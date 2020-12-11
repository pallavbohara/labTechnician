/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo1;

import java.io.DataInputStream;
import java.util.*;

/**
 * This program demonstrates how to use a ListIterator with a LinkedList object.
 */
public class LabInformation {

    Helper myHelper;

    public static void main(String[] args) {
        LabInformation aLabInfo = new LabInformation();
        aLabInfo.myHelper = new Helper();
        int menuItem;
        System.out.println("Welcome to the Lab Information System");
        do {
            menuItem = aLabInfo.displayMenu();

            switch (menuItem) {
                //cases 1 - 5 will cause an update to a linkedList in the Helper class
                case 1:
                    aLabInfo.addTechnician();
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
        } while (menuItem != 9);

    }

    public int displayMenu() {
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

    public void addTechnician() {
        DataInputStream dis;
        int c1;
        dis = new DataInputStream(System.in);
        System.out.println("Enter id");
        int labid = Integer.parseInt(dis.readLine());
        System.out.println("Enter Firstname");
        String firstname = dis.readLine();
        System.out.println("Enter Lastname");
        String lastname = dis.readLine();
        System.out.println("Enter email-id");
        String email = dis.readLine();
        System.out.println("Enter Phone Number");
        String phonenumber = Integer.parseInt(dis.readLine());
        System.out.println("Enter Speciality");
        String speciality = dis.readLine();

        Technician aReservation = new Technician(labid, firstname, lastname, email, phonenumber, speciality);
        if (myHelper.addtechnician(aReservation) == 0) {
            System.out.println("Technician added. Thanks!");
        } else {
            System.out.println("Sorry, we are unable to add  Technician at this time.  Please try again.");
        }
    }

}
