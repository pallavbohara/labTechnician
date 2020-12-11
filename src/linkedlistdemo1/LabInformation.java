/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo1;

import java.util.*;

/**
   This program demonstrates how to use a ListIterator
   with a LinkedList object.
*/

public class LabInformation
{
   Helper myHelper;
   public static void main(String[] args)
   {
       LabInformation aLabInfo = new LabInformation();
       aLabInfo.myHelper = new Helper();
       int menuItem;   
       System.out.println("Welcome to the Lab Information System");
       do
       {
           menuItem = aLabInfo.displayMenu();

           switch (menuItem)
           {
               //cases 1 - 5 will cause an update to a linkedList in the Helper class
               case 1:
                   aLabInfo.addReservation();
                   break;
               case 2:
                   aLabInfo.changeReservation();
                   break;
               case 3:
                   aLabInfo.cancelReservation();
                   break;
               case 4:
                   aLabInfo.listAllReservations();
                   break;
               case 5:
                   aLabInfo.seatAReservation();
                   break;
               //cases 6 - 9 will cause an update to a quueue in the Helper class
               case 6:
                   aLabInfo.addAWalkIn();
                   break;
               case 7:
                   aLabInfo.listAllWalkIns();
                   break;
               case 8:
                   aLabInfo.seatAWalkIn();
                   break;
               case 9:
                   System.out.println("Bye!");
                   break;
               default:
                   System.out.println("Invalid menu option.  Only 1 - 7 are valid.");

            }
        } while (menuItem !=9);

   }
   
   public int displayMenu()
   {
       Scanner keyboard = new Scanner(System.in);
       
       System.out.println("1.	Create a lab");
       System.out.println("2.	Display lab information");
       System.out.println("3.	Create a technician");
       System.out.println("3.	Display a technician information");
       System.out.println("5.	Assign a technician to a lab");
       System.out.println("6.	List all technician assigned to a lab");
       System.out.println("7.	Create a lab equipment");
       System.out.println("8.	Display lab equipment information");
       System.out.println("9.	Update lab equipment information (state, etc.)");
       System.out.println("10.	Find if a lab is assigned to a technician");
       System.out.println("11.	Display Report");


       System.out.println("What is your selection? ");
       int menuSelection = keyboard.nextInt();
       return menuSelection;
   }
   
    public void addReservation()
    {
        //1. ask user for information needed to create a reservation object
        //2. instantiate a Reservation object
        //Example:   Date aDate = new Date(yyyy, mm, dd, hrs, min, 00); 
        //  Calendar myCalendar = Calendar.getInstance();
        //  myCalendar.set(year,month, day, hourOfDay,  minute);
        
        //Reservation aReservation = new Reservation(firstName, lastName, myCalendar, partySize);
        //3. pass the reservation object to Helper class' add method
        //4. receive a return code from Helper's add method, and display appropriate message 
        //   a.  successfully added reservation
        //   b.  unable to add reservation
        
        Reservation aReservation = new Reservation();
        if (myHelper.addReservation(aReservation) == 0)
        {
            System.out.println("Your reservation was added. Thanks!");
        }
        else
        {
            System.out.println("Sorry, we are unable to add your reservation at this time.  Please try another date.");
        }
    }
    
    public void changeReservation()
    {
        //1. ask user for information needed to find a reservation object (last name, first name, and date/time of reservation)
        //2. instantiate a Reservation object
        //Example:   Date aDate = new Date(yyyy, mm, dd, hrs, min, 00);  
        //           Reservation aReservation = new Reservation(firstName, lastName, aCalendar, size);
        //3. Ask user for new reservation information object (last name, first name, and date/time of reservation)
        //3. pass the 2 reservation objects to Helper class' change method
        //4. receive a return code from Helper's change method, and display appropriate message 
        //   a.  successfully changed reservation
        //   b.  unable to change reservation
    }
    
    public void cancelReservation()
    {
        //1. ask user for information needed to find a reservation object (last name, first name, and date/time of reservation)
        //2. instantiate a Reservation object
        //Example:   Date aDate = new Date(yyyy, mm, dd, hrs, min, 00);  
        //           Reservation aReservation = new Reservation(firstName, lastName, aDate));
        //3. pass the reservation objects to Helper class' delete method
        //4. receive a return code from Helper's delete method, and display appropriate message 
        //   a.  successfully cancelled reservation
        //   b.  unable to cancel reservation
    }
    
    public void listAllReservations()
    {
        //1.  Call the Helper class' listAllReserv() method, and receive a String object that contains 
        //    all the reservations objects concatenated together to form one string.
        //2.  Display the string returned from the Helper class' listAllReserv() method
    }
        
    public void seatAReservation()
    {
        //1. ask user for information needed to find a reservation object (last name, first name, and date/time of reservation)
        //2. instantiate a Reservation object
        //Example:   Date aDate = new Date(yyyy, mm, dd, hrs, min, 00);  
        //           Reservation aReservation = new Reservation(firstName, lastName, aDate));
        //3. pass the reservation objects to Helper class' delete method
        //4. receive a return code from Helper's delete method, and display appropriate message 
        //   a.  will be able to seat the reservation 
        //   b.  unable to find reservation, therefore unable to seat the reservation
    }
    
    public void addAWalkIn()
    {
         //1. ask user for information needed to create a reservation object
        //2. instantiate a Reservation object
        //Example:   Date aDate = new Date(yyyy, mm, dd, hrs, min, 00);  
        //           Calendar myCalendar = Calendar.getInstance();
        //           Reservation aReservation = new Reservation(firstName, lastName, myCalendar));
        //3. pass the reservation object to Helper class' addWalkInQueue() method
        //4. receive a return code from Helper's addWalkInQueue() method, and display appropriate message 
        //   a.  successfully added reservation to walkIn Queue
        //   b.  unable to add reservation to walkIn Queue
    }
    
    public void listAllWalkIns()
    {
         //1. Call the Helper class' listAllWalkIns() method, and receive a String object that contains 
        //    all the reservations objects concatenated together to form one string.
        //2.  Display the string returned from the Helper class' listAllWalkIns() method
    }
    
    public void seatAWalkIn()
    {
        
        //1. Call the Helper class' deleteAWalkIn() method which will return a Reservation object in the WalkIn queue
        //2. receive either a Reservation object that was removed from the WalkIn queue, or null if queue is empty; display message:
        //   a.  will be able to seat WalkIn reservation object returned OR
        //   b.  unable to find any WalkIns in the queue - no reservation objects to seat 
   
        
    }
    
   
   
   
   
}