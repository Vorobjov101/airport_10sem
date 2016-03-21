/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.*;
import logic.Parking;
import logic.Flight;

public class Parkingbase extends Parking
{
    public static void init_parking(Connection conn) throws SQLException
    {
        Statement stmt = conn.createStatement();
        
        String req = "INSERT INTO PARKING DEFAULT VALUES;";
        stmt.execute(req);
        
    }
    
    public static void read_all_parking(Connection conn,Parking park) throws SQLException
    {
        Statement stmt = conn.createStatement();
        ResultSet rs;
        int i;
        String place = null;
        int index;
        Flight fl;
        
        
        
        for(i=1;i<=10;i++)
        {   
            place = "TERMINAL"+i;
            String req = "SELECT " + place + " FROM PARKING WHERE ID = 1";
            System.out.println(req);
            rs = stmt.executeQuery(req);
            rs.next();
            index = rs.getInt(place);
            System.out.println(index);
            if(index != 0)
            {
                fl = Flightbase.get_flight(conn, index);
                //System.out.println("Flight: "+fl.get_id());
                park.add_to_terminal("TERMINAL"+i, fl);
            }
        }
        for(i=1;i<=20;i++)
        {
            place = "PARKING"+i;
            String req = "SELECT " + place + " FROM PARKING WHERE ID = 1";
            rs = stmt.executeQuery(req);
            rs.next();
            index = rs.getInt(place);
            if(index!=0)
            {
                fl = Flightbase.get_flight(conn, index);
                park.add_to_parking("PARKING"+i, fl);
            }
        }
    }
    
    public static void add_on_parking(Connection conn, Flight fl,String place) throws SQLException
    {
        Statement stmt = conn.createStatement();
        
        String req = "UPDATE PARKING SET " + place + " = "+ fl.get_id() +" WHERE ID = 1;";
        System.out.println(req);
        stmt.execute(req);
        
    }
    
    public static void fill_parkingbase(Connection conn,Parking park) throws SQLException
    {
        Flight fl = null;
        
        for (String place: park.get_terminal().keySet())
        {
            fl = park.get_flight(place);
            if(fl != null)
            {
                Parkingbase.add_on_parking(conn, fl, place);
        
            }
        }
        for (String place: park.get_parking().keySet())
        {
            fl = park.get_flight(place);
            if(fl != null)
            {
                Parkingbase.add_on_parking(conn, fl, place);
            }
        }
        
    }
    
    public static void delete_from_parking(Connection conn,String place) throws SQLException
    {
         Statement stmt = conn.createStatement();
        
        String req = "UPDATE PARKING SET " + place + " = NULL WHERE ID = 1;";
        System.out.println(req);
        stmt.execute(req);
    }
    
    
    public static void swap(Connection conn, String place1,String place2)throws SQLException
    {
        int fl1 = 0, fl2=0;
        ResultSet rs;
        Statement stmt = conn.createStatement();
        
        String req = "SELECT "+ place1 +" FROM PARKING WHERE ID = 1";
        rs = stmt.executeQuery(req);
        rs.next();
        fl1 = rs.getInt(place1);
        
        req = "SELECT "+ place2 +" FROM PARKING WHERE ID = 1";
        rs = stmt.executeQuery(req);
        rs.next();
        fl2 = rs.getInt(place2);
        
        req = "UPDATE PARKING SET " + place1 + " = "+ fl2 +" WHERE ID = 1;";
        System.out.println(req);
        stmt.execute(req);
        
        req = "UPDATE PARKING SET " + place2 + " = "+ fl1 +" WHERE ID = 1;";
        System.out.println(req);
        stmt.execute(req);
        
        
        
    }
    
}
