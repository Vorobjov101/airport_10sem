package airport;

import java.util.Calendar;
import logic.*;
import database.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Airport {

    public static void main(String[] args) throws SQLException 
    {
        
        /*
        Plane pl = new Plane(1,"qwerty",100);
        System.out.println("ID: " + pl.get_planeid() + " PLANE: " + pl.get_planeid() + " TANK: " + pl.get_tanklvolume());
        
        Calendar arr = Calendar.getInstance();
        arr.set(2015, Calendar.JANUARY , 1, 22, 0, 0);
        System.out.println(arr.getTime());
        Calendar dep = Calendar.getInstance();
        dep.set(2015, Calendar.JANUARY , 1, 24, 0, 0);
        
        Flight fl = new Flight( 11,arr ,dep ,pl, 20 ,"pilot1");
        
        System.out.println("ID: " + fl.get_id() + " ARR: "+ fl.get_arrival().getTime() + " DEP: " + fl.get_depature().getTime() + " TTS: " + fl.get_tts() + " PILOT: " + fl.get_pilot());
    
        Parking p = new Parking();
        
        for (String place: p.get_terminal().keySet())
        {
            System.out.println(place +" "+ p.get_terminal().get(place));
        }
        for (String place: p.get_parking().keySet())
        {
            System.out.println(place +" "+ p.get_parking().get(place));
        }
    
        String place1 = "T1";
        String pilot1 = "qwerty";
        arr = Calendar.getInstance();
        dep = Calendar.getInstance();
        arr.set(2000, 11, 22, 10, 00);
        dep.set(2000, 11, 22, 15, 00);
        fl = new Flight( 1 , arr, dep, new Plane(), 3, pilot1);
        Parking instance = new Parking();
        instance.add_to_terminal(place1, fl);
        
        System.out.println(instance.get_flight("T1").get_depature().getTime());
        
        place1 = "T2";
        pilot1 = "qwerty";
        arr = Calendar.getInstance();
        dep = Calendar.getInstance();
        arr.set(2000, Calendar.NOVEMBER, 22, 10, 00, 00);
        dep.set(2000, Calendar.NOVEMBER, 22, 11, 00, 00);
        fl = new Flight( 2 , arr, dep, new Plane(), 3, pilot1);
        instance.add_to_terminal(place1, fl);
        
        for (String index: instance.get_terminal().keySet())
        {
            if(instance.get_flight(index) != null)
            {
                System.out.println(index +" "+ instance.get_flight(index).get_id());
            }
        }
        
        System.out.println(instance.get_flight("T1").get_depature().getTime() + " " + instance.get_flight("T2").get_depature().getTime());
        
        fl = instance.search_next_to_dep();
        System.out.println(fl.get_id());
        
        pl = new Plane(1,"qwerty",100);
        
        place1 = "T1";
        pilot1 = "qwerty";
        arr = Calendar.getInstance();
        dep = Calendar.getInstance();
        arr.set(2000, 11, 22, 10, 00);
        dep.set(2000, 11, 22, 15, 00);
        fl = new Flight( 1 , arr, dep, pl, 3, pilot1);
        
        Dispetcher instance1 = new Dispetcher();
        instance1.arrive_plane(fl);
        instance1.depature_plane();
        */
        
        
        final  String strDatabasePath = "C:\\Users\\802249\\Documents\\NetBeansProjects\\airport_10sem\\src\\AIRPORT.fdb";
        final  String strURL = "jdbc:firebirdsql:localhost:" + strDatabasePath;
        final  String strUser = "SYSDBA";
        final  String strPassword = "masterkey";
        Connection conn = null;
        
        
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver").newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
            System.out.println("db init error: " + ex);
        }
        
        try {
            conn = DriverManager.getConnection(strURL, strUser, strPassword);

            if (conn == null) {
                System.err.println("Could not connect to database");
            }
        } catch (SQLException ex) {
            System.out.println("db connect error " + ex);
        }
      
        int res;
        ResultSet rs = null;
        Statement stmt = conn.createStatement();
        
        String req = "SELECT MAX(ID) FROM FLIGHT";
        rs = stmt.executeQuery(req);
        rs.next();
        
        res = rs.getInt(1);
                
        /*  
        try {
            Planebase.fill_planelist(conn);
        } catch (SQLException ex) {
            Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Plane pl = new Plane();
        try {
            pl = Planebase.get_plane(conn, "model1");
        } catch (SQLException ex) {
            Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        System.out.println(pl.get_planeid());
        */
        
        Plane pl = new Plane(1,"model1",500);
        
        String place1 = "TERMINAL1";
        String pilot1 = "qwerty";
        Calendar arr = Calendar.getInstance();
        Calendar dep = Calendar.getInstance();
        arr.set(2000, 11, 22, 10, 00);
        dep.set(2000, 11, 22, 15, 00);
        Flight fl = new Flight( 1 , arr, dep, pl, 3, pilot1);
        
        Plane pl1 = new Plane(2,"model2",1000);
        
        String place2 = "TERMINAL2";
        String pilot2 = "qwerty";
        Calendar arr1 = Calendar.getInstance();
        Calendar dep1 = Calendar.getInstance();
        arr.set(2000, 11, 22, 10, 00);
        dep.set(2000, 11, 22, 15, 00);
        Flight fl2 = new Flight( 2 , arr1, dep1, pl1, 3, pilot2);
        
        Parkingbase park = new Parkingbase();
        Parkingbase.read_all_parking(conn, park);
        park.print_terminal();

        
        place1 = park.find_empty();
        System.out.println("New slot: " + place1);
        
        fl2 = Flightbase.get_flight(conn, res);
        
        System.out.println(fl2.get_arrival().get(Calendar.YEAR));
        
        //try {
        //    Flightbase.add_flight(conn, fl2);
        //} catch (SQLException ex) {
        //    Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        //} 
        
        // try {
        //     Parkingbase.init_parking(conn);
        // } catch (SQLException ex) {
        //     Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        // }
        
        //try {
        //    Parkingbase.add_on_parking(conn, fl, place1);
        //} catch (SQLException ex) {
        //    Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        //}
        
        //try {
        //    Parkingbase.swap(conn, place1, place2);
        //} catch (SQLException ex) {
        //   Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        //}
        
//        try {
//            Timetablebase.init_timetable(conn);
//        } catch(SQLException ex) {
//            Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        //try {
        //    Parkingbase.delete_from_parking(conn, place1);
        //} catch (SQLException ex) {
        //    Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        //}
              
        //try {
        //    Planebase.clear_planes_table(conn);
        //} catch (SQLException ex) {
        //    Logger.getLogger(Airport.class.getName()).log(Level.SEVERE, null, ex);
        //}
        
        
       
        try {
            if(conn != null){
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println("closing connection error: " + ex);
        }
        
        
        
    }
    
}
