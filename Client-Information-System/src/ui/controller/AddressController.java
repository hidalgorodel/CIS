/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.controller;

import com.vg.scfc.financing.cis.ent.Address;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodel
 */
public class AddressController {

    private static AddressController instance;

    public static AddressController getInstance() {
        if (instance == null) {
            instance = new AddressController();
        }
        return instance;
    }

    public Object createNew(String brgyCode, String zipCode, String street, String description, String status, int yearsOfStay) {
            Address a = new Address();
            a.setBrgyCode(brgyCode);
            a.setZipCode(zipCode);
            a.setAddress(street);
            a.setDescription(description);
            a.setStatus(status);
            a.setYearsOfStay(yearsOfStay + "");
            return new Object();
    }
    
    public Object update(Address a) {
        return new Object();
    }
    
    public List<Address> findByFormNo(String formNo) {
        return new ArrayList<>();
    }
}
