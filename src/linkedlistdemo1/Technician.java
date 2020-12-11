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
 */
public class Technician {
    private int technicianId;
    private String firstName;
    private String lastName;
    
    public Technician()
    {
        firstName = "";
        lastName = "";
        reservationDateTime = Calendar.getInstance();
        sizeOfParty = 0;
    }
    public Technician(String aFirstName, String aLastName, Calendar aTechnicianDateTime, int aPartySize)
    {
        firstName = aFirstName;
        lastName = aLastName;
        reservationDateTime = aTechnicianDateTime;
        sizeOfParty = aPartySize;
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

    public Calendar getTechnicianDateTime() {
        return reservationDateTime;
    }

    public void setTechnicianDateTime(Calendar reservationDateTime) {
        this.reservationDateTime = reservationDateTime;
    }

    public int getSizeOfParty() {
        return sizeOfParty;
    }

    public void setSizeOfParty(int sizeOfParty) {
        this.sizeOfParty = sizeOfParty;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + " " + "reservation: " + 
                reservationDateTime.getTime();
    }
    
   
}
