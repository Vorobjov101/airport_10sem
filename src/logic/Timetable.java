package logic;

import java.util.Calendar;
import java.util.PriorityQueue;
import java.util.Queue;

import logic.Timetable;

public class Timetable 
{
    Queue<String> timetable;
    
    public Timetable()
    {
        this.timetable = new PriorityQueue<>(100, null);
    }
    public String get_next() {return timetable.remove();}
    public void add_new(String new_) {timetable.add(new_);}
    
    public int fill_by_time(Calendar start, Calendar end, Parking parking,Refueller ref)
    {
        int fuel_amount = 0;
        Flight current_fl = null;
        int curr_tank = 0;
        while((ref.fuel_amount >= 0 ) && (start.before(end) || (start.equals(end))))
        {
            current_fl = parking.return_flight_by_id(Integer.valueOf(timetable.peek()));
            curr_tank = current_fl.get_plane().get_tanklvolume();
            start.add(Calendar.MINUTE, 30*(curr_tank/500));
            timetable.remove();
        }
        return fuel_amount;
    }        
}