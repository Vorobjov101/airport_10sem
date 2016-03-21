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

public class Timetablebase {
    
     public static void init_timetable(Connection conn) throws SQLException
    {
        Statement stmt = conn.createStatement();
        
        String req = "INSERT INTO TIMETABLE DEFAULT VALUES;";
        stmt.execute(req);
        
    }
            
    public static void add_on_timetable(Connection conn, Flight fl,String place) throws SQLException
    {
        Statement stmt = conn.createStatement();
        
        String req = "UPDATE TIMETABLE SET " + place + " = "+ fl.get_id() +" WHERE ID = 1;";
        System.out.println(req);
        stmt.execute(req);
        
    }
    public static void delete_from_timetable(Connection conn,String place) throws SQLException
    {
         Statement stmt = conn.createStatement();
        
        String req = "UPDATE TIMETABLE SET " + place + " = NULL WHERE ID = 1;";
        System.out.println(req);
        stmt.execute(req);
    }
    
    
    public static void swap(Connection conn, String place1,String place2)throws SQLException
    {
        int fl1 = 0, fl2=0;
        ResultSet rs;
        Statement stmt = conn.createStatement();
        
        String req = "SELECT "+ place1 +" FROM TIMETABLE WHERE ID = 1";
        rs = stmt.executeQuery(req);
        rs.next();
        fl1 = rs.getInt("\""+place1+"\"");
        
        req = "SELECT "+ place2 +" FROM TIMETABLE WHERE ID = 1";
        rs = stmt.executeQuery(req);
        rs.next();
        fl2 = rs.getInt("\""+place2+"\"");
        
        req = "UPDATE TIMETABLE SET " + place1 + " = "+ fl2 +" WHERE ID = 1;";
        System.out.println(req);
        stmt.execute(req);
        
        req = "UPDATE TIMETABLE SET " + place2 + " = "+ fl1 +" WHERE ID = 1;";
        System.out.println(req);
        stmt.execute(req);
        
        
        
    }

    public static void init_timetable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
