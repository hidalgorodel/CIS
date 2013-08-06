/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.reusable;

import ui.listener.AddEditChangeListener;

/**
 *
 * @author rodel
 */
public class AddEditChangeButtonPanel extends javax.swing.JPanel implements AddEditChangeListener {

    /**
     * Creates new form AddEditChange
     */
    public AddEditChangeButtonPanel() {
        initComponents();
        resetActionStateToDefault();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAdd = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonChange = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAdd.setText("Add");
        add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 100, -1));

        buttonEdit.setText("Edit");
        add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 1, 100, -1));

        buttonChange.setText("Change");
        add(buttonChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 1, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonChange;
    private javax.swing.JButton buttonEdit;
    // End of variables declaration//GEN-END:variables
    private AddEditChangeListener buttonListener;
    private ActionState actionState;

    public void setButtonListener(AddEditChangeListener buttonListener) {
        this.buttonListener = buttonListener;
    }

    @Override
    public void onAdd() {
        if (buttonAdd.getText().equals("Add")) {
            actionState = ActionState.SAVE;
            buttonAdd.setText("Cancel");
            buttonEdit.setText("Save");
            buttonChange.setEnabled(false);
            buttonListener.onAdd();
        } else {
            resetActionStateToDefault();
        }
    }

    @Override
    public boolean onSaveAdd() {
        boolean isSaved = buttonListener.onSaveAdd();
        if (!isSaved) {
            onAdd();
        }
        return isSaved;
    }

    @Override
    public void onCancelAdd() {
        buttonListener.onCancelAdd();
    }

    @Override
    public void onEdit() {
        if (buttonEdit.getText().equals("Edit")) {
            actionState = ActionState.EDIT;
            buttonAdd.setText("Save");
            buttonEdit.setText("Cancel");
            buttonChange.setEnabled(false);
            buttonListener.onEdit();
        } else {
            resetActionStateToDefault();
        }
    }

    @Override
    public boolean onSaveEdit() {
        boolean isEdited = buttonListener.onSaveEdit();
        if (!isEdited) {
            onEdit();
        }
        return isEdited;
    }

    @Override
    public void onCancelEdit() {
        buttonListener.onCancelEdit();
    }

    @Override
    public void onChange() {
        if (buttonChange.getText().equals("Change")) {
            actionState = ActionState.CHANGE;
            buttonChange.setText("Cancel");
            buttonEdit.setText("Save");
            buttonAdd.setEnabled(false);
            buttonListener.onChange();
        } else {
            resetActionStateToDefault();
        }
    }

    @Override
    public boolean onSaveChange() {
        boolean isChanged = buttonListener.onSaveChange();
        if (!isChanged) {
            onChange();
        }
        return isChanged;
    }

    @Override
    public void onCancelChange() {
        buttonListener.onCancelChange();
    }

    private void resetActionStateToDefault() {
        actionState = ActionState.DEFAULT;
        buttonAdd.setText("Add");
        buttonEdit.setText("Edit");
        enableChange(false);
    }
    
    public void enableAdd(boolean value) {
        buttonAdd.setEnabled(value);
    }
    
    public void enableChange(boolean value) {
        buttonChange.setEnabled(value);
    }

    private enum ActionState {

        SAVE, EDIT, CHANGE, DEFAULT
    }
}
