/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.panel;

import com.vg.scfc.financing.cis.ent.CharacterReference;
import com.vg.scfc.financing.cis.ent.CreditRef;
import com.vg.scfc.financing.cis.ent.Dependent;
import java.util.LinkedList;
import org.jdesktop.observablecollections.ObservableCollections;
import ui.listener.BasicActionListener;
import ui.validator.UIValidator;

/**
 *
 * @author rodel
 */
public class MainPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();
        initPersonalInfoAddEditListener();
        initApplicantPersonalInfo();
        initEmploymentDataAddEditListener();
        initFamilyBackgroundAddEditListener();
        initSiblingAddEditListener();
        initCharacterReferenceAddEditListener();
        initDependentsAddEditListener();
        initCreditReferenceAddEditListener();
        initSourceOfIncomeAddEditListener();
        initExpendituresAddEditListener();
        initLandAssetsAddEditListener();
        initVehicleAssetsAddEditListener();
        initApplianceAssetsAddEditListener();
        initMachineryAssetsAddEditListener();
        initSpousePersonalInfoAddEditListener();
        initSpouseEmploymentAddEditListener();
        initSpouseFamilyBackgroundAddEditListener();
        initCoMakerPersonalInfoAddEditListener();
        initCoMakerEmploymentAddEditListener();
        initCoMakerFamilyBackgroundAddEditListener();
        initCoMakerSourceOfIncomeAddEditListener();
        initCoMakerSpousePersonalInfoAddEditListener();
        initCoMakerSpouseEmploymentAddEditListener();
        initCoMakerSpouseFamilyBackgroundAddEditListener();
    }

    private void initApplicantPersonalInfo() {
        panelPersonalInfo.setFieldsEditable(false);
        panelPersonalInfo.resetToDefault();
    }

    private void initPersonalInfoAddEditListener() {
        addEditPersonalInfo.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelPersonalInfo.setFieldsEditable(true);
                panelPersonalInfo.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelPersonalInfo.savePersonalInfo();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelPersonalInfo.resetToDefault();
                panelPersonalInfo.setFieldsEditable(false);
            }

            @Override
            public void onEdit() {
                panelPersonalInfo.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelPersonalInfo.updatePersonalInfo();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return true;
            }

            @Override
            public void onCancelEdit() {
                panelPersonalInfo.setFieldsEditable(false);
            }
        });
    }

    private void initEmploymentDataAddEditListener() {
        addEditEmployment.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelEmploymentData.setFieldsEditable(true);
                panelEmploymentData.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelEmploymentData.saveEmploymentData();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelEmploymentData.setFieldsEditable(false);
//                panelEmploymentData.setEmploymentData(o);                
                panelEmploymentData.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelEmploymentData.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelEmploymentData.updateEmploymentData();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelEmploymentData.setFieldsEditable(false);
//                panelEmploymentData.setEmploymentData(o);
                panelEmploymentData.resetToDefault();
            }
        });
    }

    private void initFamilyBackgroundAddEditListener() {
        addEditFamily.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelFamilyBackground.setFieldsEditable(true);
                panelFamilyBackground.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelFamilyBackground.saveFamilyBackground();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelFamilyBackground.setFieldsEditable(false);
//                panelFamilyBackground.setFamilyBackground(null);
                panelFamilyBackground.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelFamilyBackground.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelFamilyBackground.updateFamilyBackground();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelFamilyBackground.setFieldsEditable(false);
//                panelFamilyBackground.setFamilyBackground(null);
                panelFamilyBackground.resetToDefault();
            }
        });
    }

    private void initSiblingAddEditListener() {
        addEditSibling.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelSibling.setFieldsEditable(true);
                panelSibling.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelSibling.saveSibling();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelSibling.setFieldsEditable(false);
//                panelSibling.setSibling(ui);
                panelSibling.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelSibling.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelSibling.updateSibling();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelSibling.setFieldsEditable(false);
//                panelSibling.setSibling(ui);
                panelSibling.resetToDefault();
            }
        });
    }

    private void initCharacterReferenceAddEditListener() {
        panelCharacterReference.setTableCharacterRef(tableCharacterRef);
        panelCharacterReference.setCharacterReferences(characterReferences);
        addEditCharacterReference.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelCharacterReference.setFieldsEditable(true);
                panelCharacterReference.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelCharacterReference.saveCharacterReference();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelCharacterReference.setFieldsEditable(false);
//                panelCharacterReference.setCharacterReference(ui);
                panelCharacterReference.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelCharacterReference.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelCharacterReference.updateCharacterReference();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelCharacterReference.setFieldsEditable(false);
//                panelCharacterReference.setCharacterReference(ui);
                panelCharacterReference.resetToDefault();
            }
        });
    }

    private void initDependentsAddEditListener() {
        panelDependents.setTableDependent(tableDependent);
        panelDependents.setDependents(dependents);
        addEditDependents.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelDependents.setFieldsEditable(true);
                panelDependents.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelDependents.saveDependent();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelDependents.setFieldsEditable(false);
//                panelDependents.setDependent(ui);
                panelDependents.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelDependents.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelDependents.updateDependent();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelDependents.setFieldsEditable(false);
//                panelDependents.setDependent(ui);
                panelDependents.resetToDefault();
            }
        });
    }

    private void initCreditReferenceAddEditListener() {
        panelCreditReference.setTableCreditReference(tableCreditReference);
        panelCreditReference.setCreditReferences(creditReferences);
        addEditCreditReference.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelCreditReference.setFieldsEditable(true);
                panelCreditReference.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelCreditReference.saveCreditReference();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelCreditReference.setFieldsEditable(false);
//                panelCreditReference.setCreditReference(ui);
                panelCreditReference.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelCreditReference.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelCreditReference.updateCreditReference();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelCreditReference.setFieldsEditable(false);
//                panelCreditReference.setCreditReference(ui);
                panelCreditReference.resetToDefault();
            }
        });
    }

    private void initSourceOfIncomeAddEditListener() {
        addEditSourceOfInc.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelSourceOfIncome.setFieldsEditable(true);
                panelSourceOfIncome.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelSourceOfIncome.saveSourceOfIncome();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelSourceOfIncome.setFieldsEditable(false);
//                panelSourceOfIncome.setSourceOfIncome(ui);
                panelSourceOfIncome.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelSourceOfIncome.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelSourceOfIncome.updateSourceOfIncome();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelSourceOfIncome.setFieldsEditable(false);
//                panelSourceOfIncome.setSourceOfIncome(ui);
                panelSourceOfIncome.resetToDefault();
            }
        });
    }

    private void initExpendituresAddEditListener() {
        addEditExpenditures.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelExpenditures.setFieldsEditable(true);
                panelExpenditures.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelExpenditures.saveExpenditures();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelExpenditures.setFieldsEditable(false);
//                panelExpenditures.setExpenditures(null);
                panelExpenditures.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelExpenditures.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelExpenditures.updateExpenditures();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelExpenditures.setFieldsEditable(false);
//                panelExpenditures.setExpenditures(null);
                panelExpenditures.resetToDefault();
            }
        });
    }

    private void initLandAssetsAddEditListener() {
        addEditLandAssets.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelLandAssets.setFieldsEditable(true);
                panelLandAssets.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelLandAssets.saveLandAssets();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelLandAssets.setFieldsEditable(false);
//                panelLandAssets.setLandAssets();
                panelLandAssets.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelLandAssets.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelLandAssets.updateLandAssets();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelLandAssets.setFieldsEditable(false);
//                panelLandAssets.setLandAssets();
                panelLandAssets.resetToDefault();
            }
        });
    }

    private void initVehicleAssetsAddEditListener() {
        addEditVehicle.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelVehicle.setFieldsEditable(true);
                panelVehicle.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelVehicle.saveVehicleAsset();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelVehicle.setFieldsEditable(false);
//                panelVehicle.setVechicle(ui);
                panelVehicle.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelVehicle.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelVehicle.updateVehicleAsset();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelVehicle.setFieldsEditable(false);
//                panelVehicle.setVechicle(ui);
                panelVehicle.resetToDefault();
            }
        });
    }

    private void initApplianceAssetsAddEditListener() {
        addEditAppliance.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelAppliance.setFieldsEditable(true);
                panelAppliance.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelAppliance.saveApplianceAsset();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelAppliance.setFieldsEditable(false);
//                panelAppliance.setApplianceAsset(ui);
                panelAppliance.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelAppliance.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelAppliance.updateApplianceAsset();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelAppliance.setFieldsEditable(false);
//                panelAppliance.setApplianceAsset(ui);
                panelAppliance.resetToDefault();
            }
        });
    }

    private void initMachineryAssetsAddEditListener() {
        addEditMachinery.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelMachinery.setFieldsEditable(true);
                panelMachinery.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelMachinery.saveMachinery();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelMachinery.setFieldsEditable(false);
//                panelMachinery.setMachinery(ui);
                panelMachinery.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelMachinery.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelMachinery.updateMachinery();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelMachinery.setFieldsEditable(false);
//                panelMachinery.setMachinery(ui);
                panelMachinery.resetToDefault();
            }
        });
    }

    private void initSpousePersonalInfoAddEditListener() {
        addEditSpousePersonalInfo.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelSpousePersonalInfo.setFieldsEditable(true);
                panelSpousePersonalInfo.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelSpousePersonalInfo.savePersonalInfo();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelSpousePersonalInfo.resetToDefault();
                panelSpousePersonalInfo.setFieldsEditable(false);
            }

            @Override
            public void onEdit() {
                panelSpousePersonalInfo.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelSpousePersonalInfo.updatePersonalInfo();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return true;
            }

            @Override
            public void onCancelEdit() {
                panelSpousePersonalInfo.setFieldsEditable(false);
            }
        });
    }

    private void initSpouseEmploymentAddEditListener() {
        addEditSpouseEmployment.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelSpouseEmployment.setFieldsEditable(true);
                panelSpouseEmployment.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelSpouseEmployment.saveEmploymentData();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelSpouseEmployment.setFieldsEditable(false);
//                panelSpouseEmployment.setEmploymentData(o);                
                panelSpouseEmployment.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelSpouseEmployment.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelSpouseEmployment.updateEmploymentData();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelSpouseEmployment.setFieldsEditable(false);
//                panelSpouseEmployment.setEmploymentData(o);
                panelSpouseEmployment.resetToDefault();
            }
        });
    }

    private void initSpouseFamilyBackgroundAddEditListener() {
        addEditSpouseFamilyBackground.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelSpouseFamilyBackground.setFieldsEditable(true);
                panelSpouseFamilyBackground.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelSpouseFamilyBackground.saveFamilyBackground();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelSpouseFamilyBackground.setFieldsEditable(false);
//                panelSpouseFamilyBackground.setFamilyBackground(null);
                panelSpouseFamilyBackground.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelSpouseFamilyBackground.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelSpouseFamilyBackground.updateFamilyBackground();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelSpouseFamilyBackground.setFieldsEditable(false);
//                panelSpouseFamilyBackground.setFamilyBackground(null);
                panelSpouseFamilyBackground.resetToDefault();
            }
        });
    }

    private void initCoMakerPersonalInfoAddEditListener() {
        addEditCoMakerPersonalInfo.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelCoMakerPersonalInformation.setFieldsEditable(true);
                panelCoMakerPersonalInformation.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelCoMakerPersonalInformation.savePersonalInfo();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelCoMakerPersonalInformation.resetToDefault();
                panelCoMakerPersonalInformation.setFieldsEditable(false);
            }

            @Override
            public void onEdit() {
                panelCoMakerPersonalInformation.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelCoMakerPersonalInformation.updatePersonalInfo();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return true;
            }

            @Override
            public void onCancelEdit() {
                panelCoMakerPersonalInformation.setFieldsEditable(false);
            }
        });
    }

    private void initCoMakerEmploymentAddEditListener() {
        addEditCoMakerEmployment.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelCoMakerEmploymentData.setFieldsEditable(true);
                panelCoMakerEmploymentData.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelCoMakerEmploymentData.saveEmploymentData();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelCoMakerEmploymentData.setFieldsEditable(false);
//                panelEmploymentData.setEmploymentData(o);                
                panelCoMakerEmploymentData.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelCoMakerEmploymentData.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelCoMakerEmploymentData.updateEmploymentData();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelCoMakerEmploymentData.setFieldsEditable(false);
//                panelEmploymentData.setEmploymentData(o);
                panelCoMakerEmploymentData.resetToDefault();
            }
        });
    }

    private void initCoMakerFamilyBackgroundAddEditListener() {
        addEditCoMakerFamilyBackground.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelCoMakerFamilyBackground.setFieldsEditable(true);
                panelCoMakerFamilyBackground.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelCoMakerFamilyBackground.saveFamilyBackground();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelCoMakerFamilyBackground.setFieldsEditable(false);
//                panelCoMakerFamilyBackground.setFamilyBackground(null);
                panelCoMakerFamilyBackground.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelCoMakerFamilyBackground.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelCoMakerFamilyBackground.updateFamilyBackground();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelCoMakerFamilyBackground.setFieldsEditable(false);
//                panelCoMakerFamilyBackground.setFamilyBackground(null);
                panelCoMakerFamilyBackground.resetToDefault();
            }
        });
    }

    private void initCoMakerSourceOfIncomeAddEditListener() {
        addEditCoMakerSourceOfIncome.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelCoMakerSourceOfIncome.setFieldsEditable(true);
                panelCoMakerSourceOfIncome.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelCoMakerSourceOfIncome.saveSourceOfIncome();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelCoMakerSourceOfIncome.setFieldsEditable(false);
//                panelCoMakerSourceOfIncome.setSourceOfIncome(ui);
                panelCoMakerSourceOfIncome.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelCoMakerSourceOfIncome.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelCoMakerSourceOfIncome.updateSourceOfIncome();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelCoMakerSourceOfIncome.setFieldsEditable(false);
//                panelCoMakerSourceOfIncome.setSourceOfIncome(ui);
                panelCoMakerSourceOfIncome.resetToDefault();
            }
        });
    }

    private void initCoMakerSpousePersonalInfoAddEditListener() {
        addEditCoMakerSpousePersonalInfo.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelCoMakerSpousePersonalInformation.setFieldsEditable(true);
                panelCoMakerSpousePersonalInformation.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelCoMakerSpousePersonalInformation.savePersonalInfo();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelCoMakerSpousePersonalInformation.resetToDefault();
                panelCoMakerSpousePersonalInformation.setFieldsEditable(false);
            }

            @Override
            public void onEdit() {
                panelCoMakerSpousePersonalInformation.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelCoMakerSpousePersonalInformation.updatePersonalInfo();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return true;
            }

            @Override
            public void onCancelEdit() {
                panelCoMakerSpousePersonalInformation.setFieldsEditable(false);
            }
        });
    }
    
    private void initCoMakerSpouseEmploymentAddEditListener() {
        addEditCoMakerSpouseEmployment.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelCoMakerSpouseEmploymentData.setFieldsEditable(true);
                panelCoMakerSpouseEmploymentData.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelCoMakerSpouseEmploymentData.saveEmploymentData();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelCoMakerSpouseEmploymentData.setFieldsEditable(false);
//                panelCoMakerSpouseEmploymentData.setEmploymentData(o);                
                panelCoMakerSpouseEmploymentData.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelCoMakerSpouseEmploymentData.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelCoMakerSpouseEmploymentData.updateEmploymentData();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelCoMakerSpouseEmploymentData.setFieldsEditable(false);
//                panelCoMakerSpouseEmploymentData.setEmploymentData(o);
                panelCoMakerSpouseEmploymentData.resetToDefault();
            }
        });
    }
    
    private void initCoMakerSpouseFamilyBackgroundAddEditListener() {
        addEditCoMakerSpouseFamilyBackground.setBasicActionListener(new BasicActionListener() {

            @Override
            public void onAdd() {
                panelCoMakerSpouseFamilyBackground.setFieldsEditable(true);
                panelCoMakerSpouseFamilyBackground.resetToDefault();
            }

            @Override
            public boolean onSaveAdd() {
                boolean isSaved = panelCoMakerSpouseFamilyBackground.saveFamilyBackground();
                if (!isSaved) {
                    UIValidator.promptErrorMessageOn("SAVE");
                }
                return isSaved;
            }

            @Override
            public void onCancelAdd() {
                panelCoMakerSpouseFamilyBackground.setFieldsEditable(false);
//                panelCoMakerSpouseFamilyBackground.setFamilyBackground(null);
                panelCoMakerSpouseFamilyBackground.resetToDefault();
            }

            @Override
            public void onEdit() {
                panelCoMakerSpouseFamilyBackground.setFieldsEditable(true);
            }

            @Override
            public boolean onSaveEdit() {
                boolean isUpdated = panelCoMakerSpouseFamilyBackground.updateFamilyBackground();
                if (!isUpdated) {
                    UIValidator.promptErrorMessageOn("EDIT");
                }
                return isUpdated;
            }

            @Override
            public void onCancelEdit() {
                panelCoMakerSpouseFamilyBackground.setFieldsEditable(false);
//                panelCoMakerSpouseFamilyBackground.setFamilyBackground(null);
                panelCoMakerSpouseFamilyBackground.resetToDefault();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        creditReferences = ObservableCollections.observableList(new LinkedList<CreditRef>());
        dependents = ObservableCollections.observableList(new LinkedList<Dependent>());
        characterReferences = ObservableCollections.observableList(new LinkedList<CharacterReference>());
        tabMain = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panelPersonalInfo = new ui.reusable.PersonalInformationPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        panelEmploymentData = new ui.reusable.EmploymentDataPanel();
        addEditEmployment = new ui.reusable.AddEditButtonPanel();
        jPanel3 = new javax.swing.JPanel();
        panelFamilyBackground = new ui.reusable.FamilyBackgroundPanel();
        addEditFamily = new ui.reusable.AddEditButtonPanel();
        jPanel4 = new javax.swing.JPanel();
        panelSibling = new ui.reusable.SiblingsPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehicle = new javax.swing.JTable();
        addEditSibling = new ui.reusable.AddEditButtonPanel();
        jPanel5 = new javax.swing.JPanel();
        panelCharacterReference = new ui.reusable.CharacterReferenceDependentPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCharacterRef = new javax.swing.JTable();
        addEditCharacterReference = new ui.reusable.AddEditButtonPanel();
        jPanel6 = new javax.swing.JPanel();
        panelDependents = new ui.reusable.CharacterReferenceDependentPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDependent = new javax.swing.JTable();
        addEditDependents = new ui.reusable.AddEditButtonPanel();
        jPanel7 = new javax.swing.JPanel();
        panelCreditReference = new ui.reusable.CreditReferencePanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableCreditReference = new javax.swing.JTable();
        addEditCreditReference = new ui.reusable.AddEditButtonPanel();
        jPanel8 = new javax.swing.JPanel();
        panelSourceOfIncome = new ui.reusable.SourceOfIncomePanel();
        addEditSourceOfInc = new ui.reusable.AddEditButtonPanel();
        jPanel9 = new javax.swing.JPanel();
        panelExpenditures = new ui.reusable.ExpendituresPanel();
        addEditExpenditures = new ui.reusable.AddEditButtonPanel();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        panelLandAssets = new ui.reusable.LandPanel();
        addEditLandAssets = new ui.reusable.AddEditButtonPanel();
        jPanel12 = new javax.swing.JPanel();
        panelVehicle = new ui.reusable.VehiclePanel();
        addEditVehicle = new ui.reusable.AddEditButtonPanel();
        jPanel13 = new javax.swing.JPanel();
        panelAppliance = new ui.reusable.AppliancesPanel();
        addEditAppliance = new ui.reusable.AddEditButtonPanel();
        jPanel14 = new javax.swing.JPanel();
        panelMachinery = new ui.reusable.MachineryPanel();
        addEditMachinery = new ui.reusable.AddEditButtonPanel();
        jPanel27 = new javax.swing.JPanel();
        addressPanel1 = new ui.reusable.AddressPanel();
        addEditChangeButtonPanel1 = new ui.reusable.AddEditChangeButtonPanel();
        addEditPersonalInfo = new ui.reusable.AddEditButtonPanel();
        jPanel15 = new javax.swing.JPanel();
        panelSpousePersonalInfo = new ui.reusable.PersonalInformationPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        panelSpouseEmployment = new ui.reusable.EmploymentDataPanel();
        addEditSpouseEmployment = new ui.reusable.AddEditButtonPanel();
        jPanel17 = new javax.swing.JPanel();
        panelSpouseFamilyBackground = new ui.reusable.FamilyBackgroundPanel();
        addEditSpouseFamilyBackground = new ui.reusable.AddEditButtonPanel();
        jPanel28 = new javax.swing.JPanel();
        addressPanel2 = new ui.reusable.AddressPanel();
        addEditSpousePersonalInfo = new ui.reusable.AddEditButtonPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblVehicle4 = new javax.swing.JTable();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        panelCoMakerPersonalInformation = new ui.reusable.PersonalInformationPanel();
        jPanel20 = new javax.swing.JPanel();
        panelCoMakerEmploymentData = new ui.reusable.EmploymentDataPanel();
        addEditCoMakerEmployment = new ui.reusable.AddEditButtonPanel();
        jPanel21 = new javax.swing.JPanel();
        panelCoMakerFamilyBackground = new ui.reusable.FamilyBackgroundPanel();
        addEditCoMakerFamilyBackground = new ui.reusable.AddEditButtonPanel();
        jPanel22 = new javax.swing.JPanel();
        panelCoMakerSourceOfIncome = new ui.reusable.SourceOfIncomePanel();
        addEditCoMakerSourceOfIncome = new ui.reusable.AddEditButtonPanel();
        jPanel23 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel24 = new javax.swing.JPanel();
        panelCoMakerSpousePersonalInformation = new ui.reusable.PersonalInformationPanel();
        addEditCoMakerSpousePersonalInfo = new ui.reusable.AddEditButtonPanel();
        jPanel25 = new javax.swing.JPanel();
        panelCoMakerSpouseEmploymentData = new ui.reusable.EmploymentDataPanel();
        addEditCoMakerSpouseEmployment = new ui.reusable.AddEditButtonPanel();
        jPanel26 = new javax.swing.JPanel();
        panelCoMakerSpouseFamilyBackground = new ui.reusable.FamilyBackgroundPanel();
        addEditCoMakerSpouseFamilyBackground = new ui.reusable.AddEditButtonPanel();
        jPanel30 = new javax.swing.JPanel();
        addressPanel4 = new ui.reusable.AddressPanel();
        jPanel29 = new javax.swing.JPanel();
        addressPanel3 = new ui.reusable.AddressPanel();
        addEditCoMakerPersonalInfo = new ui.reusable.AddEditButtonPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(panelPersonalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 5, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(panelEmploymentData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel2.add(addEditEmployment, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 215, -1, -1));

        jTabbedPane1.addTab("Employment", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(panelFamilyBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel3.add(addEditFamily, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 165, -1, -1));

        jTabbedPane1.addTab("Family", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(panelSibling, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        tblVehicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Type/Model", "Years Used", "Use", "Estimated Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehicle);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 600, 90));
        jPanel4.add(addEditSibling, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 185, -1, -1));

        jTabbedPane1.addTab("Siblings", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(panelCharacterReference, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        tableCharacterRef.setColumnSelectionAllowed(true);
        tableCharacterRef.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, characterReferences, tableCharacterRef);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${charRefName}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${charRelationship}"));
        columnBinding.setColumnName("Relationship");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${charRefContactNo}"));
        columnBinding.setColumnName("Contact #");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tableCharacterRef);
        tableCharacterRef.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCharacterRef.getColumnModel().getColumn(1).setPreferredWidth(180);
        tableCharacterRef.getColumnModel().getColumn(1).setMaxWidth(180);
        tableCharacterRef.getColumnModel().getColumn(2).setPreferredWidth(150);
        tableCharacterRef.getColumnModel().getColumn(2).setMaxWidth(150);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 600, 90));
        jPanel5.add(addEditCharacterReference, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 215, -1, -1));

        jTabbedPane1.addTab("Character Reference", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(panelDependents, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        tableDependent.setColumnSelectionAllowed(true);
        tableDependent.getTableHeader().setReorderingAllowed(false);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, dependents, tableDependent, "");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${depName}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${depRelation}"));
        columnBinding.setColumnName("Relationship");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${depContactNo}"));
        columnBinding.setColumnName("Contact #");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(tableDependent);
        tableDependent.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableDependent.getColumnModel().getColumn(1).setPreferredWidth(180);
        tableDependent.getColumnModel().getColumn(1).setMaxWidth(180);
        tableDependent.getColumnModel().getColumn(2).setPreferredWidth(150);
        tableDependent.getColumnModel().getColumn(2).setMaxWidth(150);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 600, 90));
        jPanel6.add(addEditDependents, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 215, -1, -1));

        jTabbedPane1.addTab("Dependents", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(panelCreditReference, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, creditReferences, tableCreditReference);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${creRefName}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${creRefAddress}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${creItem}"));
        columnBinding.setColumnName("Item on Credit");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${creRefLoanAmount}"));
        columnBinding.setColumnName("Loan Amount");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${creRefMonthly}"));
        columnBinding.setColumnName("Monthly Amort");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${creRefTerm}"));
        columnBinding.setColumnName("Term");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${creRefAmountPaid}"));
        columnBinding.setColumnName("Amount Paid");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${creRefBalance}"));
        columnBinding.setColumnName("Balance");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane4.setViewportView(tableCreditReference);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 980, 90));
        jPanel7.add(addEditCreditReference, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 240, -1, -1));

        jTabbedPane1.addTab("Credit Reference", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(panelSourceOfIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel8.add(addEditSourceOfInc, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, -1));

        jTabbedPane1.addTab("Src. of Income", jPanel8);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(panelExpenditures, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel9.add(addEditExpenditures, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, -1));

        jTabbedPane1.addTab("Expenditures", jPanel9);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(panelLandAssets, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel11.add(addEditLandAssets, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 215, -1, -1));

        jTabbedPane2.addTab("Land", jPanel11);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(panelVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel12.add(addEditVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 215, -1, -1));

        jTabbedPane2.addTab("Vehicle", jPanel12);

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel13.add(panelAppliance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel13.add(addEditAppliance, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 215, -1, -1));

        jTabbedPane2.addTab("Appliances", jPanel13);

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(panelMachinery, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel14.add(addEditMachinery, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 235, -1, -1));

        jTabbedPane2.addTab("Machinery", jPanel14);

        jPanel10.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 290));

        jTabbedPane1.addTab("Assets", jPanel10);

        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel27.add(addressPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));
        jPanel27.add(addEditChangeButtonPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, -1, -1));

        jTabbedPane1.addTab("Address", jPanel27);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 1020, 330));
        jPanel1.add(addEditPersonalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        tabMain.addTab("Applicant Personal Information", jPanel1);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel15.add(panelSpousePersonalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel16.add(panelSpouseEmployment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel16.add(addEditSpouseEmployment, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 215, -1, -1));

        jTabbedPane3.addTab("Employment", jPanel16);

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel17.add(panelSpouseFamilyBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel17.add(addEditSpouseFamilyBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 215, -1, -1));

        jTabbedPane3.addTab("Family", jPanel17);

        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel28.add(addressPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        jTabbedPane3.addTab("Address", jPanel28);

        jPanel15.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 1020, 330));
        jPanel15.add(addEditSpousePersonalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        tabMain.addTab("Spouse Information", jPanel15);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVehicle4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Type/Model", "Years Used", "Use", "Estimated Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblVehicle4);

        jPanel18.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 1000, 70));

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel19.add(panelCoMakerPersonalInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 5, -1, -1));

        jTabbedPane4.addTab("Personal Info", jPanel19);

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel20.add(panelCoMakerEmploymentData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel20.add(addEditCoMakerEmployment, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 215, -1, -1));

        jTabbedPane4.addTab("Employment", jPanel20);

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel21.add(panelCoMakerFamilyBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel21.add(addEditCoMakerFamilyBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 215, -1, -1));

        jTabbedPane4.addTab("Family", jPanel21);

        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel22.add(panelCoMakerSourceOfIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel22.add(addEditCoMakerSourceOfIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jTabbedPane4.addTab("Source of Income", jPanel22);

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane5.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel24.add(panelCoMakerSpousePersonalInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(-11, 5, -1, -1));
        jPanel24.add(addEditCoMakerSpousePersonalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 210, -1, -1));

        jTabbedPane5.addTab("Personal Info", jPanel24);

        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel25.add(panelCoMakerSpouseEmploymentData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel25.add(addEditCoMakerSpouseEmployment, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jTabbedPane5.addTab("Employment", jPanel25);

        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel26.add(panelCoMakerSpouseFamilyBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        jPanel26.add(addEditCoMakerSpouseFamilyBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jTabbedPane5.addTab("Family", jPanel26);

        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel30.add(addressPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        jTabbedPane5.addTab("Address", jPanel30);

        jPanel23.add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 400));

        jTabbedPane4.addTab("Spouse Information", jPanel23);

        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel29.add(addressPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        jTabbedPane4.addTab("Address", jPanel29);

        jPanel18.add(jTabbedPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1030, 440));
        jPanel18.add(addEditCoMakerPersonalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 80, -1, -1));

        tabMain.addTab("Co-Maker", jPanel18);

        add(tabMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 1040, 600));

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.reusable.AddEditButtonPanel addEditAppliance;
    private ui.reusable.AddEditChangeButtonPanel addEditChangeButtonPanel1;
    private ui.reusable.AddEditButtonPanel addEditCharacterReference;
    private ui.reusable.AddEditButtonPanel addEditCoMakerEmployment;
    private ui.reusable.AddEditButtonPanel addEditCoMakerFamilyBackground;
    private ui.reusable.AddEditButtonPanel addEditCoMakerPersonalInfo;
    private ui.reusable.AddEditButtonPanel addEditCoMakerSourceOfIncome;
    private ui.reusable.AddEditButtonPanel addEditCoMakerSpouseEmployment;
    private ui.reusable.AddEditButtonPanel addEditCoMakerSpouseFamilyBackground;
    private ui.reusable.AddEditButtonPanel addEditCoMakerSpousePersonalInfo;
    private ui.reusable.AddEditButtonPanel addEditCreditReference;
    private ui.reusable.AddEditButtonPanel addEditDependents;
    private ui.reusable.AddEditButtonPanel addEditEmployment;
    private ui.reusable.AddEditButtonPanel addEditExpenditures;
    private ui.reusable.AddEditButtonPanel addEditFamily;
    private ui.reusable.AddEditButtonPanel addEditLandAssets;
    private ui.reusable.AddEditButtonPanel addEditMachinery;
    private ui.reusable.AddEditButtonPanel addEditPersonalInfo;
    private ui.reusable.AddEditButtonPanel addEditSibling;
    private ui.reusable.AddEditButtonPanel addEditSourceOfInc;
    private ui.reusable.AddEditButtonPanel addEditSpouseEmployment;
    private ui.reusable.AddEditButtonPanel addEditSpouseFamilyBackground;
    private ui.reusable.AddEditButtonPanel addEditSpousePersonalInfo;
    private ui.reusable.AddEditButtonPanel addEditVehicle;
    private ui.reusable.AddressPanel addressPanel1;
    private ui.reusable.AddressPanel addressPanel2;
    private ui.reusable.AddressPanel addressPanel3;
    private ui.reusable.AddressPanel addressPanel4;
    private java.util.List<CharacterReference> characterReferences;
    private java.util.List<CreditRef> creditReferences;
    private java.util.List<Dependent> dependents;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private ui.reusable.AppliancesPanel panelAppliance;
    private ui.reusable.CharacterReferenceDependentPanel panelCharacterReference;
    private ui.reusable.EmploymentDataPanel panelCoMakerEmploymentData;
    private ui.reusable.FamilyBackgroundPanel panelCoMakerFamilyBackground;
    private ui.reusable.PersonalInformationPanel panelCoMakerPersonalInformation;
    private ui.reusable.SourceOfIncomePanel panelCoMakerSourceOfIncome;
    private ui.reusable.EmploymentDataPanel panelCoMakerSpouseEmploymentData;
    private ui.reusable.FamilyBackgroundPanel panelCoMakerSpouseFamilyBackground;
    private ui.reusable.PersonalInformationPanel panelCoMakerSpousePersonalInformation;
    private ui.reusable.CreditReferencePanel panelCreditReference;
    private ui.reusable.CharacterReferenceDependentPanel panelDependents;
    private ui.reusable.EmploymentDataPanel panelEmploymentData;
    private ui.reusable.ExpendituresPanel panelExpenditures;
    private ui.reusable.FamilyBackgroundPanel panelFamilyBackground;
    private ui.reusable.LandPanel panelLandAssets;
    private ui.reusable.MachineryPanel panelMachinery;
    private ui.reusable.PersonalInformationPanel panelPersonalInfo;
    private ui.reusable.SiblingsPanel panelSibling;
    private ui.reusable.SourceOfIncomePanel panelSourceOfIncome;
    private ui.reusable.EmploymentDataPanel panelSpouseEmployment;
    private ui.reusable.FamilyBackgroundPanel panelSpouseFamilyBackground;
    private ui.reusable.PersonalInformationPanel panelSpousePersonalInfo;
    private ui.reusable.VehiclePanel panelVehicle;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTable tableCharacterRef;
    private javax.swing.JTable tableCreditReference;
    private javax.swing.JTable tableDependent;
    private javax.swing.JTable tblVehicle;
    private javax.swing.JTable tblVehicle4;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
