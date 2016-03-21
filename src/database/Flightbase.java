package database;

import java.sql.*;
import java.util.*;
import java.util.Date;
import logic.Flight;
import logic.Plane;


/**
 *
 * @author 802249
 */
public class Flightbase extends Flight
{
    
    public static void add_flight(Connection conn, Flight fl) throws SQLException
    {
        Statement stmt = conn.createStatement();
        
        //String req = "INSERT INTO PLANE (TANK_VOLUME,MODEL) VALUES ( "+ pl.get_tanklvolume() +", '"+ pl.get_planemodel() +"');";
        String req = "INSERT INTO FLIGHT (ARRIVAL,DEPATURE,PLANE,TIME_TO_SERVICE,PILOT,STATUS) VALUES ( '"+ 
                fl.get_arrival().get(Calendar.YEAR)         + "-" + fl.get_arrival().get(Calendar.MONTH)    + "-" + fl.get_arrival().get(Calendar.DATE)     + " " +
                fl.get_arrival().get(Calendar.HOUR_OF_DAY)  + ":" + fl.get_arrival().get(Calendar.MINUTE)   + ":" + fl.get_arrival().get(Calendar.SECOND)   + "', '" +
                fl.get_depature().get(Calendar.YEAR)        + "-" + fl.get_depature().get(Calendar.MONTH)   + "-" + fl.get_depature().get(Calendar.DATE)    + " " +
                fl.get_depature().get(Calendar.HOUR_OF_DAY) + ":" + fl.get_depature().get(Calendar.MINUTE)  + ":" + fl.get_depature().get(Calendar.SECOND)  + "'," + 
                fl.get_plane().get_planeid() + ", " + (fl.get_plane().get_tanklvolume())/500+ ", '" + fl.get_pilot() + "', 'arrived'" + ");";
        
        //System.out.println(req);
        
        stmt.execute(req);
        
    }
    
    public static Flight get_flight(Connection conn, int id) throws SQLException
    {
        Flight fl;
        
        ResultSet rs;
        Statement stmt = conn.createStatement();
        
        String timebuf;
        Calendar arr_cl = Calendar.getInstance();
        Calendar dep_cl = Calendar.getInstance();
        Plane pl;
        String status = null;
        String pilot = null;
        
        String req = "SELECT * FROM FLIGHT WHERE ID = " + id;
        rs = stmt.executeQuery(req);
        rs.next();
        
        pilot = rs.getString("PILOT");
        
        timebuf = rs.getString("ARRIVAL");
        arr_cl.set( Integer.parseInt(timebuf.substring(0, 4)),
                    Integer.parseInt(timebuf.substring(5, 7)),
                    Integer.parseInt(timebuf.substring(8, 10)),
                    Integer.parseInt(timebuf.substring(11, 13)),
                    Integer.parseInt(timebuf.substring(14, 16)),
                    Integer.parseInt(timebuf.substring(17, 19)));
        
        timebuf = rs.getString("DEPATURE");
        dep_cl.set( Integer.parseInt(timebuf.substring(0, 4)),
                    Integer.parseInt(timebuf.substring(5, 7)),
                    Integer.parseInt(timebuf.substring(8, 10)),
                    Integer.parseInt(timebuf.substring(11, 13)),
                    Integer.parseInt(timebuf.substring(14, 16)),
                    Integer.parseInt(timebuf.substring(17, 19)));
        
        //System.out.println(arr_cl);
        //System.out.println(dep_cl);
        
        pl = Planebase.get_plane_by_id(conn, rs.getInt("PLANE"));
        
        
        fl = new Flight(id,arr_cl,dep_cl,pl,pl.get_tanklvolume()/500,pilot);
        
        return fl;
    }
    
    public static void remove_flight(Connection conn,int id) throws SQLException
    {
        Statement stmt = conn.createStatement();
        
        String req = "DELETE * FROM FLIGHT WHERE ID = " + id;
        
        stmt.execute(req);
    }
    
    public static int get_new_flight_id(Connection conn) throws SQLException
    {
        int res;
        ResultSet rs = null;
        Statement stmt = conn.createStatement();
        
        String req = "SELECT MAX(ID) FROM FLIGHT";
        rs = stmt.executeQuery(req);
        rs.next();
        
        res = rs.getInt(1);
        return res;
    }
    
}
