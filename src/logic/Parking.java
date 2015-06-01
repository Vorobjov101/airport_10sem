package logic;

import java.util.HashMap;
import java.util.Map;


public class Parking 
{
    Map terminal = new HashMap<String,Flight>();
    Map parking = new HashMap<String,Flight>();
    
    void add_to_terminal(String place,Flight fl)
    {
        if (terminal.containsKey(place) && (terminal.get(place)==null))
        {
            terminal.put(place, fl);
        }
    }
    
    void add_to_parking(String place,Flight fl)
    {
        if (parking.containsKey(place) && (parking.get(place)==null))
        {
            parking.put(place, fl);
        }
    }
    
    void remove_from_parking(String place,Flight fl)
    {
        if (parking.containsKey(place) && (parking.get(place)!=fl))
        {
            parking.remove(place);
            parking.put(place, null);
        }
    }
    
    void remove_from_terminal(String place,Flight fl)
    {
        if (terminal.containsKey(place) && (terminal.get(place)!=fl))
        {
            terminal.remove(place);
            terminal.put(place, null);
        }
    }
    
    void from_parking_to_terminal(String place,Flight fl,String new_place)
    {
        if (terminal.containsKey(new_place) && parking.containsKey(place) && (parking.get(place)!=fl) && (terminal.get(place) == null))
        {
            terminal.put(new_place, fl);
            parking.put(place, null);
        }
    }
    
    String next_terminal()
    {
        String result = "none";
        
        for(Object place: terminal.keySet())
        {
            if (terminal.get(place) == null)
            return (String) place;
        }
        return result;
    }
    
    String next_parking()
    {
        String result = "none";
        
        for(Object place: parking.keySet())
        {
            if (parking.get(place) == null)
            return (String) place;
        }
        return result;
    }
    
}
