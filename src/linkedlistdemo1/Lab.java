/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo1;

/**
 *
 * @author HP
 */
public class Lab {
   private int labId;
   private String labName;
   private String phoneNumber;  
   private String labEquipment;
   private String technicians;


     //Date(int year, int month, int date, int hrs, int min, int sec)
  
   
    
    public Lab(int alabId,String alabName, String aphoneNumber, String alabEquipment, String atechnicians)
    {
        labId = alabId;
        labName = alabName;
        phoneNumber = aphoneNumber ;
        labEquipment = alabEquipment;
        technicians = atechnicians;
    }    

        public int getLabId() {
            return labId;
        }

        public void setLabId(int labId) {
            this.labId = labId;
        }

        public String getLabName() {
            return labName;
        }

        public void setLabName(String labName) {
            this.labName = labName;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getLabEquipment() {
            return labEquipment;
        }

        public void setLabEquipment(String labEquipment) {
            this.labEquipment = labEquipment;
        }

        public String getTechnicians() {
            return technicians;
        }

        public void setTechnicians(String technicians) {
            this.technicians = technicians;
        }

       

 
    public String toString()
    {
        return "\nLab Id= "+labId + "\nLab Name= "+labName + "  \nPhone Number= " + phoneNumber + " " + "  \nLabEquipment: " + labEquipment + "\nTechnicians:" +technicians+ "\n \n" ;
    }

    String getlabEquipmentName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getequipmentState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}