/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class MedicineCatalog {
    ArrayList<Medicine> medicineList;
    
    public MedicineCatalog() {
        this.medicineList = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public Medicine createMedicine(String name, double dosage) {
        Medicine medicine = new Medicine();
        medicine.setMedicineName(name);
        medicine.setDosage(dosage);
        
        this.medicineList.add(medicine);
        
        return medicine;
    }
    
    // check if medicine already exists
    public Boolean checkIfMedicineUnique(String name) {
        for(Medicine med: this.medicineList) {
            if(med.getMedicineName().equals(name)) {
                return false;
            }
        }
        
        return true;
    }
    
    // delete a medicine from the catalog
    public void removeMedicine(String name) {
         // find the medicine obj in the arraylist with this name
         
         for(Medicine med: this.medicineList) {
             if(med.getMedicineName().equals(name)) {
                 this.medicineList.remove(med);
                 break;
             }
         }
    }
 }
