/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.*;
import java.util.*;
import logic.Timetable;
import logic.Flight;
import logic.Refueller;

public class Refuellerbase {
    
     public static void init_refueller(Connection conn) throws SQLException
    {
        Statement stmt = conn.createStatement();
        
        String req = "INSERT INTO REFUELLER (FUEL_LEFT) VALUES (3000);";
        stmt.execute(req);
        
    }
            
    public static void add_queve(Connection conn, int tt) throws SQLException
    {
        Statement stmt = conn.createStatement();
        
        String req = "UPDATE INTO REFUELLER SET TIMETABLE = " + tt +" WHERE ID = 1;";
        stmt.execute(req);
    }
     
    public static void refuel(Connection conn) throws SQLException
    {
        Statement stmt = conn.createStatement();
        
        String req = "UPDATE INTO REFUELLER SET FUEL_LEFT = 3000;";
        stmt.execute(req);
    }    
    
}
