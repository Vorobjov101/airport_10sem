/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.sql.Connection;
import logic.Flight;

public class FlightService {
    
    public void add_flight(Connection conn, Flight fl)
    {
        Flight.add_flight_to_base(conn, fl);
    }
    
    public int get_new_flight_id(Connection conn)
    {
        int i= 0;
        i = Flight.get_new_flight_id_(conn);
        return i;
    }
    
    public Flight set_flight_id (Flight fl,int i)
    {
        fl.set_id(i);
        return fl;
    }
    
}
