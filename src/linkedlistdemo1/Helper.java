/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Cristy
 */
public class Helper {
    
    List<Technician> technicianList = new LinkedList<Technician>();
//    LinkedList<Reservation> reservationList = new LinkedList<>();
     List<Lab> labList = new LinkedList<Lab>();
     List<LabEquipment> labequipmentList = new LinkedList<LabEquipment>();
//    Queue<Reservation> walkInQueue = new LinkedList<>();
    public Lab searchLab(int id)
  {
      
      for (Lab lab : labList) {
        if (lab.getLabId()==id) {
            return lab;
        }
    }
      return null;
  }
    
  public int addlab(Lab alab)
  {
      int returnCode=0;
       try {
           labList.add(alab); //This allows to delete a reservation fron reservation list
            returnCode = 1;
        } catch (Exception e) {

        }

      return returnCode;
  }
    
  public Technician searchTechnician(int id)
  {
      
      for (Technician technician : technicianList) {
        if (technician.getTechnicianId()==id) {
            return technician;
        }
    }
      return null;
  }
    
  public int addtechnician(Technician aTechnician)
  {
      int returnCode=0;
       try {
            technicianList.add(aTechnician); //This allows to delete a reservation fron reservation list
            returnCode = 1;
        } catch (Exception e) {

        }

      return returnCode;
  }
    
  public LabEquipment searchLabEquipment(int id)
  {
      
      for (LabEquipment labequipment : labequipmentList) {
        if (labequipment.getLabEquipmentId()==id) {
            return labequipment;
        }
    }
      return null;
  }
    
  public int addlabequipment(LabEquipment aLabEquipment)
  {
      int returnCode=0;
       try {
          labequipmentList.add(aLabEquipment); //This allows to delete a reservation fron reservation list
            returnCode = 1;
        } catch (Exception e) {

        }

      return returnCode;
  }
    
    
   
  
   
}
