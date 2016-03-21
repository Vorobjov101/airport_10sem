/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.sql.Connection;
import logic.Flight;
import logic.Parking;


public class ParkingService {
    
    //Parking park;
    
    public static void read_all_parking(Connection conn,Parking park)
    {
        Parking.read_all_parking_(conn, park);
    }
    
    public static void fill_parkingbase(Connection conn, Parking park)
    {
        Parking.fill_parkingbase_(conn, park);
    }
    
    public void remove_from_terminal(Parking park, Flight fl)
    {
       park.remove_from_terminal(fl);
    }
    
    public Flight search_next_to_dep(Parking park)
    {
        Flight res = null;
        res = park.search_next_to_dep();
        return res;
    }
    
    public Flight find_next_on_parking(Parking park)
    {
        Flight res = null;
        res = park.find_next_on_parking();
        return res;
    }
    
    public String nex_term(Parking park)
    {
        String res = null;
        res = park.next_terminal();
        return res;
    }
    
    public void from_park_to_term(Parking park, Flight fl)
    {
        park.from_parking_to_terminal(fl);
    }
    
    
    public String find_empty(Parking park)
    {
        String res = null;
        res = park.find_empty();
        return res;
    }
    
    public void add_flight(Parking park, String slot,Flight fl)
    {
        park.add_to_(slot, fl);
    }
}
