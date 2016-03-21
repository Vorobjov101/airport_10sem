/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import logic.*;



public class DispetcherService {
    
    final  String strDatabasePath = "C:\\Users\\802249\\Documents\\NetBeansProjects\\airport\\src\\AIRPORT.fdb";
    final  String strURL = "jdbc:firebirdsql:localhost:" + strDatabasePath;
    final  String strUser = "SYSDBA";
    final  String strPassword = "masterkey";
    Connection conn = null;
    
    InputStreamReader myfile = null;
    char buffer[] = null;
    
    public Connection make_connection()
    {
        try 
        {
            Class.forName("org.firebirdsql.jdbc.FBDriver").newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException ex) 
        {
            System.out.println("db init error: " + ex);
        }

        try 
        {
            conn = DriverManager.getConnection(strURL, strUser, strPassword);

            if (conn == null) 
            {
                System.err.println("Could not connect to database");
            }
        } catch (SQLException ex) 
        {
            System.out.println("db connect error " + ex);
        }
        return conn;  
    }
    
    public InputStreamReader connect_to_file()
    {
        try 
        {
            myfile = new InputStreamReader(new FileInputStream("C:\\Users\\802249\\Documents\\NetBeansProjects\\airport\\src\\flights.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return myfile;
    }
    
    public Flight get_next_fl(InputStreamReader input)
    {
        buffer = new char[20];
        
        int flight_id;
        
        int dep_year;   
        int dep_month;  
        int dep_day; 
        int dep_hour;  
        int dep_min;    
        int dep_sec;
        
        int arr_year;      
        int arr_month;
        int arr_day;
        int arr_hour;
        int arr_min;
        int arr_sec;
        
        int plane_id;
        String pilot_name = "";
        
        String table_time_str = "";
        
        Calendar arr = Calendar.getInstance();
        Calendar dep = Calendar.getInstance();
        
        Flight fl = null;
        Plane plane_fl = null;
        
        try {
                input.read(buffer,0,5);
        } catch (IOException ex) {
                Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        flight_id = Character.getNumericValue(buffer[0])*1000 + Character.getNumericValue(buffer[1])*100 + Character.getNumericValue(buffer[2])*10 + Character.getNumericValue(buffer[3]);
        
        try {
                input.read(buffer,0,3);
        } catch (IOException ex) {
                Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        arr_day = Character.getNumericValue(buffer[0])*10 + Character.getNumericValue(buffer[1]);
        try {
                input.read(buffer,0,3);
        } catch (IOException ex) {
                Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        arr_month = Character.getNumericValue(buffer[0])*10 + Character.getNumericValue(buffer[1]);
        try {
                input.read(buffer,0,5);
        } catch (IOException ex) {
                Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        arr_year = Character.getNumericValue(buffer[0])*1000+Character.getNumericValue(buffer[1])*100+Character.getNumericValue(buffer[2])*10+Character.getNumericValue(buffer[3]);
        try {
            input.read(buffer,0,3);
        } catch (IOException ex) {
            Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        arr_hour = Character.getNumericValue(buffer[0])*10 + Character.getNumericValue(buffer[1]);
        try {
            input.read(buffer,0,3);
        } catch (IOException ex) {
            Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        arr_min = Character.getNumericValue(buffer[0])*10 + Character.getNumericValue(buffer[1]);
        try {
            input.read(buffer,0,3);
        } catch (IOException ex) {
            Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        arr_sec = Character.getNumericValue(buffer[0])*10 + Character.getNumericValue(buffer[1]);
        
        
        try {
                input.read(buffer,0,3);
        } catch (IOException ex) {
                Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        dep_day = Character.getNumericValue(buffer[0])*10 + Character.getNumericValue(buffer[1]);
        try {
                input.read(buffer,0,3);
        } catch (IOException ex) {
                Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        dep_month = Character.getNumericValue(buffer[0])*10 + Character.getNumericValue(buffer[1]);
        try {
                input.read(buffer,0,5);
        } catch (IOException ex) {
                Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        dep_year = Character.getNumericValue(buffer[0])*1000+Character.getNumericValue(buffer[1])*100+Character.getNumericValue(buffer[2])*10+Character.getNumericValue(buffer[3]);
        try {
            input.read(buffer,0,3);
        } catch (IOException ex) {
            Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        dep_hour = Character.getNumericValue(buffer[0])*10 + Character.getNumericValue(buffer[1]);
        try {
            input.read(buffer,0,3);
        } catch (IOException ex) {
            Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        dep_min = Character.getNumericValue(buffer[0])*10 + Character.getNumericValue(buffer[1]);
        try {
            input.read(buffer,0,3);
        } catch (IOException ex) {
            Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        dep_sec = Character.getNumericValue(buffer[0])*10 + Character.getNumericValue(buffer[1]);
        
        try {
            input.read(buffer,0,3);
        } catch (IOException ex) {
            Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        plane_id = Character.getNumericValue(buffer[0])*10 + Character.getNumericValue(buffer[1]);
        
        int i = 0;
        try {
            char new_buf[] = new char[1];
            new_buf[0] = 'A';
            while(new_buf[0]!='\n')
            {
                input.read(new_buf);
                buffer[i] = new_buf[0];
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(airportservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int j = 0;j<i;j++)
        {
            pilot_name += Character.toString(buffer[j]);
        }
        
        System.out.println(flight_id+" "+arr_day+"/"+arr_month+"/"+arr_year+" "+arr_hour+":"+arr_min+":"+arr_sec+" "+
                                         dep_day+"/"+dep_month+"/"+dep_year+" "+dep_hour+":"+dep_min+":"+dep_sec+" "+plane_id+" "+pilot_name);
        
        arr.set(arr_year, arr_month, arr_day, arr_hour, arr_min, arr_sec);
        dep.set(dep_year, dep_month, dep_day, dep_hour, arr_min, arr_sec);
        
        plane_fl = Dispetcher.get_plane_by_id_(conn, plane_id);
        
        fl = new Flight(flight_id,arr,dep,plane_fl,plane_fl.get_tanklvolume()/500,pilot_name);
        
        return fl;
    }
    
}
