package logic;

import database.Planebase;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Dispetcher
{
   Refueller ref = new Refueller();
   Parking park;
   
   public Dispetcher()
   {
       ref = new Refueller();
       this.park = new Parking();
       
   }
   
   public Parking get_park() {return this.park;}
   public Refueller get_ref() {return this.ref;}
   
   public void create_timetable()
   {}
   
   public void arrive_plane(Flight fl)
   {
       int volume = fl.get_plane().get_tanklvolume();
       Calendar depature = fl.get_depature();
       Calendar cur_date = Calendar.getInstance();
       Calendar measure = depature;
       
       //cur_date.setTime(new Date());
       cur_date.add(Calendar.HOUR, 2);
      
       if(cur_date.before(measure))  throw new NullPointerException("Wrong flight info");
       else
       {
           String place = park.next_terminal();
           if(place == "none")
           {
                place = park.next_parking();
                if(place == "none")  throw new NullPointerException("No parking slots");
                park.add_to_parking(place, fl);
           }
           else park.add_to_terminal(place, fl);
       }
       
   }
   
   public static Plane get_plane_by_id_(Connection conn, int id)
   {
       Plane pl = null;
       try {
           pl = Planebase.get_plane_by_id(conn, id);
       } catch (SQLException ex) {
           Logger.getLogger(Dispetcher.class.getName()).log(Level.SEVERE, null, ex);
       }
       return pl;
   }
   
   
   public void check_planes()
   {
       park.tass_places();
   }
   
//   public void move_refueller()
//   {
//       Flight next_to_serve = null;
//       String next = this.ref.get_timetable().get_next();
//       next_to_serve = park.get_flight(next);
//       
//       if(ref.get_fuel_amount() > next_to_serve.get_plane().get_tanklvolume())
//       {
//           next_to_serve.set_status("fueled");
//       }
//       else
//       {
//           ref.refresh();
//           next_to_serve.set_status("fueled");
//       }
//   }
}
