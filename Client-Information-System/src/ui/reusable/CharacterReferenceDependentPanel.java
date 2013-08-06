/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.reusable;

import com.vg.scfc.financing.cis.ent.CharacterReference;
import com.vg.scfc.financing.cis.ent.Dependent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import ui.controller.CharacterReferenceDependentController;
import ui.validator.UIValidator;

/**
 *
 * @author rodel
 */
public class CharacterReferenceDependentPanel extends javax.swing.JPanel implements KeyListener {

    /**
     * Creates new form CharacterReferencePanel
     */
    public CharacterReferenceDependentPanel() {
        initComponents();
        startUpSettings();
    }

    private void initTableCharacterReference() {
        if (tableCharacterRef != null) {
            tableCharacterRef.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tableCharacterRef.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

                @Override
                public void valueChanged(ListSelectionEvent lse) {
                    try {
                        selectedIndex = tableCharacterRef.getSelectedRow();
                        if (selectedIndex >= 0) {
                            setCharacterReference(characterReferences.get(selectedIndex));
                        }
                    } catch (Exception e) {
                        // TODO, log exception
                    }
                }
            });
        }
    }

    private void initTableDependent() {
        if (tableDependent != null) {
            tableDependent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tableDependent.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

                @Override
                public void valueChanged(ListSelectionEvent lse) {
                    try {
                        selectedIndex = tableDependent.getSelectedRow();
                        if (selectedIndex >= 0) {
                            setDependent(dependents.get(selectedIndex));
                        }
                    } catch (Exception e) {
                        // TODO, log exception
                    }
                }
            });
        }
    }

    /**
     * Set TextBoxes KeyListener
     */
    private void initTextBoxesListener() {
        txtRefName.addKeyListener(this);
        txtRefAddress.addKeyListener(this);
        txtRefContact.addKeyListener(this);
        txtRefRelationship.addKeyListener(this);
    }

    private void startUpSettings() {
        setFieldsEditable(false);
        initTextBoxesListener();
        initTableDependent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRefContact = new javax.swing.JTextField();
        txtRefAddress = new javax.swing.JTextField();
        txtRefName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRefRelationship = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Address");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 35, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Contact");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 60, -1, -1));

        txtRefContact.setFont(new java.awt.Font("Monospaced", 0, 9)); // NOI18N
        txtRefContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRefContactFocusLost(evt);
            }
        });
        add(txtRefContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 55, 140, -1));

        txtRefAddress.setFont(new java.awt.Font("Monospaced", 0, 9)); // NOI18N
        txtRefAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRefAddressFocusLost(evt);
            }
        });
        add(txtRefAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 30, 255, -1));

        txtRefName.setFont(new java.awt.Font("Monospaced", 0, 9)); // NOI18N
        txtRefName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRefNameFocusLost(evt);
            }
        });
        add(txtRefName, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 5, 255, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Relationship");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 85, -1, -1));

        txtRefRelationship.setFont(new java.awt.Font("Monospaced", 0, 9)); // NOI18N
        txtRefRelationship.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRefRelationshipFocusLost(evt);
            }
        });
        add(txtRefRelationship, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 80, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtRefNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRefNameFocusLost
        name = UIValidator.validate(txtRefName);
    }//GEN-LAST:event_txtRefNameFocusLost

    private void txtRefAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRefAddressFocusLost
        address = UIValidator.validate(txtRefAddress);
    }//GEN-LAST:event_txtRefAddressFocusLost

    private void txtRefContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRefContactFocusLost
        contact = UIValidator.isNumeric(txtRefContact);
    }//GEN-LAST:event_txtRefContactFocusLost

    private void txtRefRelationshipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRefRelationshipFocusLost
        relationship = UIValidator.validate(txtRefRelationship);
    }//GEN-LAST:event_txtRefRelationshipFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtRefAddress;
    private javax.swing.JTextField txtRefContact;
    private javax.swing.JTextField txtRefName;
    private javax.swing.JTextField txtRefRelationship;
    // End of variables declaration//GEN-END:variables
    private String name;
    private String address;
    private String contact;
    private String relationship;
    private JTable tableDependent;
    private int selectedIndex;
    private List<Dependent> dependents;
    private JTable tableCharacterRef;
    private List<CharacterReference> characterReferences;

    public void setTableCharacterRef(JTable tableCharacterRef) {
        this.tableCharacterRef = tableCharacterRef;
    }

    public void setCharacterReferences(List<CharacterReference> characterReferences) {
        this.characterReferences = characterReferences;
    }

    public void setDependents(List<Dependent> dependents) {
        this.dependents = dependents;
    }

    public void setTableDependent(JTable tableDependent) {
        this.tableDependent = tableDependent;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                if (txtRefName.isFocusOwner()) {
                txtRefAddress.requestFocus();
            } else if (txtRefAddress.isFocusOwner()) {
                txtRefContact.requestFocus();
            } else if (txtRefContact.isFocusOwner()) {
                txtRefRelationship.requestFocus();
            }
                break;
            case KeyEvent.VK_UP:
                if (txtRefRelationship.isFocusOwner()) {
                txtRefContact.requestFocus();
            } else if (txtRefContact.isFocusOwner()) {
                txtRefAddress.requestFocus();
            } else if (txtRefAddress.isFocusOwner()) {
                txtRefName.requestFocus();
            }
                break;
        }
    }

    public void setFieldsEditable(boolean value) {
        txtRefName.setEditable(value);
        txtRefAddress.setEditable(value);
        txtRefContact.setEditable(value);
        txtRefRelationship.setEditable(value);
    }

    public void resetToDefault() {
        txtRefName.setText("");
        txtRefAddress.setText("");
        txtRefContact.setText("");
        txtRefRelationship.setText("");
    }

    public boolean saveDependent() {
        Object o = CharacterReferenceDependentController.getInstance().createNew(name, address, contact, relationship, true);
        setDependent(o);
        return o != null;
    }

    public boolean updateDependent() {
        Object o = CharacterReferenceDependentController.getInstance().update("", name, address, contact, relationship, true);
        setDependent(o);
        return o != null;
    }

    public void setDependent(Object o) {
        if (o == null) {
            resetToDefault();
        } else {
            Dependent d = (Dependent) o;
            txtRefName.setText(d.getDepName());
            txtRefAddress.setText(d.getDepAddress());
            txtRefContact.setText(d.getDepContactNo());
            txtRefRelationship.setText(d.getDepRelation());
        }
    }

    public boolean saveCharacterReference() {
        Object o = CharacterReferenceDependentController.getInstance().createNew(name, address, contact, relationship, false);
        return o != null;
    }

    public boolean updateCharacterReference() {
        Object o = CharacterReferenceDependentController.getInstance().update("", name, address, contact, relationship, false);
        return o != null;
    }

    public void setCharacterReference(Object o) {
        if (o == null) {
            resetToDefault();
        } else {
            CharacterReference chr = (CharacterReference) o;
            txtRefName.setText(chr.getCharRefName());
            txtRefAddress.setText(chr.getCharRefAddress());
            txtRefContact.setText(chr.getCharRefContactNo());
//            txtRefRelationship.setText(chr.getCharRefRelationship());
        }
    }

    public void refreshTableDependent(List<Dependent> d) {
        dependents.clear();
        dependents.addAll(d);
        if (!dependents.isEmpty()) {
            tableDependent.setRowSelectionInterval(0, 0);
        }
    }

    public void refreshTableCharacterReference(List<CharacterReference> c) {
        characterReferences.clear();
        characterReferences.addAll(c);
        if (!characterReferences.isEmpty()) {
            tableCharacterRef.setRowSelectionInterval(0, 0);
        }
    }
}
