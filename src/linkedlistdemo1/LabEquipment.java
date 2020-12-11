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
public class LabEquipment {
   
   private int labEquipmentId;
   private String labEquipmentName;
   private int labId;  
   private boolean equipmentState ;

    public boolean isEquipmentState() {
        return equipmentState;
    }

    public void setEquipmentState(boolean equipmentState) {
        this.equipmentState = equipmentState;
    }
   


     //Date(int year, int month, int date, int hrs, int min, int sec)
  
   
    
    public LabEquipment(int alabEquipmentId,String alabEquipmentName, int alabId, String alabEquipment, boolean aequipmentState)
    {
        labEquipmentId = alabEquipmentId;
        labEquipmentName = alabEquipmentName;
        labId =alabId;
        equipmentState=aequipmentState;
      
    }    

    LabEquipment(int labEquipmentId, String labEquipmentName, int labId, String equipmentState) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getLabEquipmentId() {
        return labEquipmentId;
    }

    public void setLabEquipmentId(int labEquipmentId) {
        this.labEquipmentId = labEquipmentId;
    }

    public String getLabEquipmentName() {
        return labEquipmentName;
    }

    public void setLabEquipmentName(String labEquipmentName) {
        this.labEquipmentName = labEquipmentName;
    }

    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    

       
       

 
    public String toString()
    {
        return "\nlab Equipment Id= "+labEquipmentId + "\nlabEquipmentName= "+labEquipmentName + "  \nlabId= " + labId + " " + "  \nEquipment State: " + equipmentState +  "\n \n" ;
    }
    
}