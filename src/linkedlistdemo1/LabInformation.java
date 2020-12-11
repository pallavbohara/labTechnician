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
                    aLabInfo.addlab();
                    break;
                case 2:
                    aLabInfo.displaylab();
                    break;
                case 3:
                    aLabInfo.addTechnician();
                    break;
                case 4:
                    aLabInfo.displayTechnician();
                    break;

                // case 5:
                // aLabInfo.assigntechnician();
                // break;
                //cases 6 - 9 will cause an update to a quueue in the Helper class
                // case 6:
                //     aLabInfo.listtechnician();
                //    break;
                case 7:
                    aLabInfo.addlabequipment();
                    break;
                case 8:
                    aLabInfo.displaylabequipment();
                    break;
                /* case 9:
                    aLabInfo.updatelabequipment();
                    break;
                    case 9:
                    aLabInfo.assigning of lab to tecchnician();
                    break;
                    case 11:
                    aLabInfo.displayreport();
                    break;
                case:12
                    System.out.println("Bye!");
                    break;*/
                default:
                    System.out.println("Invalid menu option.  Only 1 - 11 are valid.");

            }
        } while (menuItem != 9);

    }

    public int displayMenu() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1.	Create a lab");
        System.out.println("2.	Display lab information");
        System.out.println("3.	Create a technician");
        System.out.println("4.	Display a technician information");
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
        try {
            System.out.println("Enter id");
            int labid = Integer.parseInt(dis.readLine());
            System.out.println("Enter Firstname");
            String firstname = dis.readLine();
            System.out.println("Enter Lastname");
            String lastname = dis.readLine();
            System.out.println("Enter email-id");
            String email = dis.readLine();
            System.out.println("Enter Phone Number");
            String phonenumber = (dis.readLine());
            System.out.println("Enter Speciality");
            String speciality = dis.readLine();
            Technician aTechnician = new Technician(labid, firstname, lastname, email, phonenumber, speciality);
            if (myHelper.addtechnician(aTechnician) > 0) {
                System.out.println("Technician added. Thanks!");
            } else {
                System.out.println("Sorry, we are unable to   add  Technician at this time.  Please try again.");
            }
        } catch (Exception e) {
            System.out.println("");
        }

    }

    public void displayTechnician() {
        Technician t;
        DataInputStream dis;
        dis = new DataInputStream(System.in);
        int c5 = 0;
        try {
            System.out.println("Enter the ID :");
            c5 = Integer.parseInt(dis.readLine());
        } catch (Exception e) {
        }
        t = myHelper.searchTechnician(c5);

        System.out.println("Firstname " + t.getFirstName());
        System.out.println("Lastname " + t.getLastName());
        System.out.println("email-id " + t.getEmail());
        System.out.println("Phone number " + t.getPhonenumber());
        System.out.println("Speciality " + t.getSpeciality());
    }

    public void addlab() {
        DataInputStream dis;
        int c1;
        dis = new DataInputStream(System.in);
        try {
            System.out.println("Enter labId");
            int labid = Integer.parseInt(dis.readLine());
            System.out.println("Enter labName");
            String labname = dis.readLine();
            System.out.println("Enter Phone Number");
            String phonenumber = (dis.readLine());
            System.out.println("Enter labEquipment");
            String labEquipment = dis.readLine();

            System.out.println("Enter Technicians");
            String technicians = dis.readLine();
            Lab aLab = new Lab(labid, labname, phonenumber, labEquipment, technicians);
            if (myHelper.addlab(aLab) > 0) {
                System.out.println("Lab Created added. Thanks!");
            } else {
                System.out.println("Sorry, we are unable to create lab at this time.  Please try again.");
            }
        } catch (Exception e) {
            System.out.println("");
        }

    }

    public void displaylab() {
        Lab l;
        DataInputStream dis;
        dis = new DataInputStream(System.in);
        int c5 = 0;
        try {
            System.out.println("Enter the ID :");
            c5 = Integer.parseInt(dis.readLine());
        } catch (Exception e) {
        }
        l = myHelper.searchLab(c5);

        System.out.println("labId " + l.getLabId());
        System.out.println("labName " + l.getLabName());
        System.out.println("Phone No " + l.getPhoneNumber());
        System.out.println("lab Equipment " + l.getLabEquipment());
        System.out.println("lab tech" + l.getTechnicians());

    }

    public void addlabequipment() {
        DataInputStream dis;
        int c1;
        dis = new DataInputStream(System.in);
        try {
            System.out.println("Enter labEquipmentId");
            int labEquipmentId = Integer.parseInt(dis.readLine());
            System.out.println("Enter labEquipmentName");
            String labEquipmentName = dis.readLine();
            System.out.println("Enter labId");
            int labId = Integer.parseInt(dis.readLine());
            System.out.println("Enter equipmentState");
            String equipmentState = dis.readLine();

            System.out.println("Enter Technicians");
            String technicians = dis.readLine();
            LabEquipment aLabEquipment = new LabEquipment(labEquipmentId, labEquipmentName, labId, equipmentState);
            if (myHelper.addlabequipment(aLabEquipment) >= 0) {
                System.out.println("LabEquiment Created added. Thanks!");
            } else {
                System.out.println("Sorry, we are unable to create labequiment at this time.  Please try again.");
            }
        } catch (Exception e) {
            System.out.println("");
        }
    }

    private void displaylabequipment() {
        LabEquipment L;
        DataInputStream dis;
        dis = new DataInputStream(System.in);
        int c5 = 0;
        try {
            System.out.println("Enter the ID :");
            c5 = Integer.parseInt(dis.readLine());
        } catch (Exception e) {
        }
        L= myHelper.searchLabEquipment(c5);

        System.out.println("lab EquipmentId " + L.getLabEquipmentId());
        System.out.println("labEquipmentName " + L.getLabEquipmentName());
        System.out.println("Lab Id " + L.getLabId());
        System.out.println("lab Equipment " + L.isEquipmentState());
    }
}
