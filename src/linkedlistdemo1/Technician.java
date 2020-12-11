/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo1;

import java.util.Calendar;

/**
 *
 * @author HP
 */public class Technician {
    
                
        private int technicianId;
         private String firstName;
        private String lastName;
        private String email;
        private String phonenumber;
       private String speciality;
  
   


     //Date(int year, int month, int date, int hrs, int min, int sec)
  
   
    
    public Technician (int atechnicianId, String afirstName, String alastName, String aemail,String aphonenumber,String aspeciality)
    {
        technicianId = atechnicianId;
       
        firstName =afirstName;
        lastName=alastName;
        email=aemail;
        phonenumber=aphonenumber;
        speciality= aspeciality;
    }    

    Technician(int labid, String labname, String phonenumber, String labEquipment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(int technicianId) {
        this.technicianId = technicianId;
    }  
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

   
       
       

 
    public String toString()
    {
        return "  \nfirtName= "  + "\n \n"  + "\nlab Equipment Id= "+technicianId + firstName + "  \nlastName= " + lastName + "  \nemail= " + email + "  \nPhone No= " + phonenumber + "  \nspeciality= " + speciality ;
    }
    
}