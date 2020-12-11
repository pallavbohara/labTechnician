/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo1;

import java.util.Calendar;

/**
 *
 * @author mtsguest
 */
public class Reservation implements Comparable<Reservation> {
   private String firstName;
   private String lastName;
   private Calendar reservationDateTime;    //Date(int year, int month, int date, int hrs, int min, int sec)
   private int sizeOfParty;
   
    public Reservation()
    {
        firstName = "";
        lastName = "";
        reservationDateTime = Calendar.getInstance();
        sizeOfParty = 0;
    }
    public Reservation(String aFirstName, String aLastName, Calendar aReservationDateTime, int aPartySize)
    {
        firstName = aFirstName;
        lastName = aLastName;
        reservationDateTime = aReservationDateTime;
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

    public Calendar getReservationDateTime() {
        return reservationDateTime;
    }

    public void setReservationDateTime(Calendar reservationDateTime) {
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
    
    public int compareTo(Reservation anotherRes)
    {
        if (this.reservationDateTime.after(anotherRes.getReservationDateTime()))
        {
            return 1;            
        }
        else if (this.reservationDateTime.before(anotherRes.getReservationDateTime()))
        {
            return -1;
        }
        else if (this.lastName.compareTo(anotherRes.getLastName()) == 0 &&
                    this.firstName.compareTo(anotherRes.getFirstName()) == 0 &&
                      this.sizeOfParty == anotherRes.getSizeOfParty())
        {
            return 0;
        }
        else
        {
            return -1;
        }
                   
 
            
    }
}
