/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.reusable;

import ui.listener.BasicActionListener;

/**
 *
 * @author rodel
 */
public class AddEditButtonPanel extends javax.swing.JPanel implements BasicActionListener {

    /**
     * Creates new form AddEditButtonPanel
     */
    public AddEditButtonPanel() {
        initComponents();
        initActionState();
    }

    private void initActionState() {
        actionState = ActionState.DEFAULT;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 100, -1));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 1, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (actionState == ActionState.DEFAULT) {
            onAdd();
        } else {
            switch (actionState) {
                case SAVE:
                    onCancelAdd();
                    resetActionStateToDefault();
                    break;
                case EDIT:
                    onSaveEdit();
                    resetActionStateToDefault();
                    break;
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (actionState == ActionState.DEFAULT) {
            onEdit();
        } else {
            switch (actionState) {
                case SAVE:
                    onSaveAdd();
                    resetActionStateToDefault();
                    break;
                case EDIT:
                    onCancelEdit();
                    resetActionStateToDefault();
                    break;
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    // End of variables declaration//GEN-END:variables
    private ActionState actionState;
    private BasicActionListener basicActionListener;

    public void setBasicActionListener(BasicActionListener basicActionListener) {
        this.basicActionListener = basicActionListener;
    }

    @Override
    public void onAdd() {
        if (btnAdd.getText().equals("Add")) {
            actionState = ActionState.SAVE;
            btnAdd.setText("Cancel");
            btnEdit.setText("Save");
            basicActionListener.onAdd();
        } else {
            resetActionStateToDefault();
        }
    }

    @Override
    public boolean onSaveAdd() {
        boolean isSaved = basicActionListener.onSaveAdd();
        if(!isSaved) {
            onAdd();
        }
        return isSaved;
    }

    @Override
    public void onCancelAdd() {
        basicActionListener.onCancelAdd();
    }

    @Override
    public void onEdit() {
        if (btnEdit.getText().equals("Edit")) {
            actionState = ActionState.EDIT;
            btnAdd.setText("Save");
            btnEdit.setText("Cancel");
            basicActionListener.onEdit();
        } else {
            resetActionStateToDefault();
        }
    }

    @Override
    public boolean onSaveEdit() {
       boolean isEdited = basicActionListener.onSaveEdit();
       if(!isEdited) {
           onEdit();
       }
        return isEdited;
    }

    @Override
    public void onCancelEdit() {
       basicActionListener.onCancelEdit();
    }

    private void resetActionStateToDefault() {
        actionState = ActionState.DEFAULT;
        btnAdd.setText("Add");
        btnEdit.setText("Edit");
    }

    private enum ActionState {
        SAVE, EDIT, DEFAULT
    }
}