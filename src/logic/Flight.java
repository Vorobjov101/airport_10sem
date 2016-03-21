package logic;

import database.Flightbase;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Flight
{
    int flightid;
    Calendar arrival;
    Calendar depature;
    Plane plane;
    int timetoservice;
    String pilot;
    String status;
    int fuel;
    
    public Flight()
    {
        this.flightid =0;
        this.plane = new Plane();
        this.timetoservice = 0;
        this.pilot = "";
        this.status = "none";
        this.fuel = 0;
    }
    public Flight( int flightid_,Calendar arrival_,Calendar depature_,Plane plane_,int timetoservice_,String pilot_)
    {
        this.flightid =flightid_;
        this.arrival = arrival_;
        this.depature = depature_;
        this.plane = plane_;
        this.timetoservice = timetoservice_;
        this.pilot = pilot_;
        this.status = null;
        this.fuel = 0;
    }
    
    public int get_id() {return this.flightid;}
    public Calendar get_arrival() {return this.arrival;}
    public Calendar get_depature() {return this.depature;}
    public Plane get_plane() {return this.plane;}
    public int get_tts() {return this.timetoservice;}
    public String get_pilot() {return this.pilot;}
    public String get_status() {return this.status;}
    public int get_fuel() {return this.fuel;}
    
    public void set_status(String status_) {this.status = status_;}
    public void set_id(int id_) {this.flightid = id_;}
    public void set_fuel(int i) {this.fuel = i;}
    
    public static void add_flight_to_base(Connection conn, Flight fl)
    {
        try {
            Flightbase.add_flight(conn, fl);
        } catch (SQLException ex) {
            Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int get_new_flight_id_(Connection conn)
    {
        int res = 0;
        try {
            res = Flightbase.get_new_flight_id(conn);
        } catch (SQLException ex) {
            Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
}
