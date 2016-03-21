package logic;

import database.Parkingbase;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parking 
{
    static Map<String,Flight> terminal = new HashMap<String,Flight>();
    static Map<String,Flight> parking = new HashMap<String,Flight>();
    
    public Parking()
    {
        terminal.put("TERMINAL1", null);
        terminal.put("TERMINAL2", null);
        terminal.put("TERMINAL3", null);
        terminal.put("TERMINAL4", null);
        terminal.put("TERMINAL5", null);
        terminal.put("TERMINAL6", null);
        terminal.put("TERMINAL7", null);
        terminal.put("TERMINAL8", null);
        terminal.put("TERMINAL9", null);
        terminal.put("TERMINAL10", null);
        
        parking.put("PARKING1", null);
        parking.put("PARKING2", null);
        parking.put("PARKING3", null);
        parking.put("PARKING4", null);
        parking.put("PARKING5", null);
        parking.put("PARKING6", null);
        parking.put("PARKING7", null);
        parking.put("PARKING8", null);
        parking.put("PARKING9", null);
        parking.put("PARKING10", null);
        parking.put("PARKING11", null);
        parking.put("PARKING12", null);
        parking.put("PARKING13", null);
        parking.put("PARKING14", null);
        parking.put("PARKING15", null);
        parking.put("PARKING16", null);
        parking.put("PARKING17", null);
        parking.put("PARKING18", null);
        parking.put("PARKING19", null);
        parking.put("PARKING20", null);
    }
    
    public Map<String, Flight> get_terminal() {return this.terminal;}
    public Map<String, Flight> get_parking() {return this.parking;}
    
    public void add_to_terminal(String place,Flight fl)
    {
        if (terminal.containsKey(place) && (terminal.get(place)==null))
        {
            terminal.put(place, fl);
            fl.set_status("terminal");
            //System.out.println("Flight added! To: " + place);
        }
    }
    
    public void add_to_parking(String place,Flight fl)
    {
        if (parking.containsKey(place) && (parking.get(place)==null))
        {
            parking.put(place, fl);
            fl.set_status("parking");
        }
    }
        
    public void add_to_(String place, Flight fl)
    {
        if(place.contains("TERMINAL"))
        {
            this.add_to_terminal(place, fl);
        }
        else if(place.contains("PARKING"))
        {
            this.add_to_parking(place, fl);
        }
    }
        
    public void remove_from_parking(String place,Flight fl)
    {
        if (parking.containsKey(place) && (parking.get(place)!=fl))
        {
            parking.remove(place);
            parking.put(place, null);
        }
    }
    
    public static void remove_from_terminal(String place,Flight fl)
    {
        if (terminal.containsKey(place) && (terminal.get(place)!=fl))
        {
            terminal.remove(place);
            terminal.put(place, null);
        }
    }
    
    public static void remove_from_terminal(Flight fl)
    {
        String key = null;
        for (String place: terminal.keySet())
        {
            if(terminal.get(place) == fl)
            {
                key = place;
                break;
            }
        }
        terminal.put(key, null);
    }
    
    public void from_parking_to_terminal(String place,Flight fl,String new_place)
    {
        if (terminal.containsKey(new_place) && parking.containsKey(place) && (parking.get(place)!=fl) && (terminal.get(place) == null))
        {
            terminal.put(new_place, fl);
            parking.put(place, null);
            fl.set_status("terminal");
        }
    }
    
    public void from_parking_to_terminal(Flight fl)
    {
        
        String curr_place = this.find_flight(fl);
        String new_place = this.next_terminal();
        
        this.from_parking_to_terminal(curr_place, fl, new_place);
        
    }
    
    public String next_terminal()
    {
        String result = "none";
        
        for(String place : terminal.keySet())
        {
            if (terminal.get(place) == null)
            return place;
        }
        return result;
    }
    
    public String next_parking()
    {
        String result = "none";
        
        for(String place: parking.keySet())
        {
            if (parking.get(place) == null)
            return place;
        }
        return result;
    }
    
    public String find_empty()
    {
        String result = "none";
        
        result = this.next_terminal();
        if(result == "none")
        {
            result = this.next_parking();
        }
        
        return result;
    }
    
    public Flight search_next_to_dep()
    {
        String pilot1 = "qwerty";
        Calendar arr = Calendar.getInstance();
        Calendar dep = Calendar.getInstance();
        arr.set(2000, 11, 22, 10, 00);
        dep.set(2020, 11, 22, 15, 00);
        Flight fl_n = new Flight( 1 , arr, dep, new Plane(), 3, pilot1);
        
        Flight fl = terminal.get("T1");
        Flight fl_res = fl_n;
        Calendar d = Calendar.getInstance();
        //d.set(0,0,0,0,0,0);
        
        //d = terminal.get("T1").get_depature();
        
        for(String place: terminal.keySet())
        {
            fl = terminal.get(place);
            if(fl!=null)
            {
                d = fl.get_depature();
                if(d.before(fl_res.get_depature()))
                {
                    fl_res = fl;
                }
            }
        }
        
        return fl_res;
    }
    
    public void tass_places()
    {
        String nt = this.next_terminal();
        Flight fl = null;
        Calendar d = Calendar.getInstance();
        Calendar d_curr = Calendar.getInstance();
        d_curr.setTime(new Date());
        for(String place: parking.keySet())
        {
            fl = parking.get(place);
            if(fl != null)
            {
                d = fl.get_depature();
                d.add(Calendar.HOUR, 2);
                if(d.equals(d_curr) || d.after(d_curr))
                {
                    this.from_parking_to_terminal(place, fl, nt);
                }
            }
        }
    }
    
    public String find_flight(Flight fl)
    {
        String res = "none";
        for(String place: parking.keySet())
        {
            if (parking.get(place) == fl) 
            {
                res = place;
                return res;
            }
        }
        for(String place: terminal.keySet())
        {
            if (terminal.get(place) == fl) 
            {
                res = place;
                return res;
            }
        }
        return res;
    }
    
    public Flight get_flight(String place)
    {
        if(parking.containsKey(place)) {return parking.get(place);}
        else if(terminal.containsKey(place)) {return terminal.get(place);}
        return null;
    }
    
    public Flight find_next_on_parking()
    {
        Calendar base = Calendar.getInstance();
        base.set(3000, Calendar.JANUARY, 1, 0, 0, 0);
        Calendar some_date = Calendar.getInstance();
        Flight fl_res = null;
        
        for(String place: parking.keySet())
        {
            if (parking.get(place) != null)
            {
                some_date = parking.get(place).get_depature();
                if (base.after(some_date))
                {
                    fl_res = parking.get(place);
                }
            }
        }
        
        return fl_res;
    }
    
    public void print_terminal()
    {
        for(String place: terminal.keySet())
        {
            if(terminal.get(place) != null)
            {
                System.out.println(terminal.get(place).get_id());
            }
        }
    }  
    
    public Flight return_flight_by_id(int id)
    {
        Flight fl = null;
        
        for(String place: parking.keySet())
        {
            if (parking.get(place).get_id() == id) 
            {
                fl = parking.get(place);
                return fl;
            }
        }
        for(String place: terminal.keySet())
        {
            if (terminal.get(place).get_id() == id) 
            {
                fl = terminal.get(place);
                return fl;
            }
        }
        
        return fl;
    }
    
    public static void read_all_parking_(Connection conn,Parking park)
    {
        
        try {
            Parkingbase.read_all_parking(conn, park);
        } catch (SQLException ex) {
            Logger.getLogger(Parking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void fill_parkingbase_(Connection conn, Parking park)
    {
        
        try {
            Parkingbase.fill_parkingbase(conn, park);
        } catch (SQLException ex) {
            Logger.getLogger(Parking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
