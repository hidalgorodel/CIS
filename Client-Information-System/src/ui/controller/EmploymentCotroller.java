/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.controller;

/**
 *
 * @author rodel
 */
public class EmploymentCotroller {

    private static EmploymentCotroller instance;

    public static EmploymentCotroller getInstance() {
        if (instance == null) {
            instance = new EmploymentCotroller();
        }
        return instance;
    }
    
    public Object createNewEmploymentRecord(String status, String positionDept, String companyEmployer, String address, String contactNo, String natureOfBuss, int yearsInService) {
        return new Object();
    }
    
    public Object updateEmploymentRecord(String clientNo, String status, String positionDept, String companyEmployer, String address, String contactNo, String natureOfBuss, int yearsInService) {
        return new Object();
    }

}
