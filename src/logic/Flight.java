package logic;
import java.util.Date;

public class Flight
{
    int flightid;
    Date arrival;
    Date depature;
    Plane plane;
    int timetoservice;
    String pilot;
    
    public Flight()
    {
        this.flightid =0;
        this.arrival = new Date();
        this.depature = new Date();
        this.plane = new Plane();
        this.timetoservice = 0;
        this.pilot = "";
    }
    public Flight( int flightid_,Date arrival_,Date depature_,Plane plane_,int timetoservice_,String pilot_)
    {
        this.flightid =flightid_;
        this.arrival = arrival_;
        this.depature = depature_;
        this.plane = plane_;
        this.timetoservice = timetoservice_;
        this.pilot = pilot_;
    }
    
    public int get_id() {return this.flightid;}
    public Date get_arrival() {return this.arrival;}
    public Date get_depature() {return this.depature;}
    public Plane get_plane() {return this.plane;}
    public int get_tts() {return this.timetoservice;}
    public String get_pilot() {return this.pilot;}
    
}
