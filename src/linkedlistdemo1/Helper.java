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
    
    List<Technician> technicianList = new List<>();
//    LinkedList<Reservation> reservationList = new LinkedList<>();
//
//    Queue<Reservation> walkInQueue = new LinkedList<>();
    
  public int searchTechnician(int id)
  {
      
      for (Technician technician : technicianList) {
        if (technician.getId().equals(id)) {
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
    
    
   
}
