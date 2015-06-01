package logic;

import java.util.Queue;


public class Refueller
{
    int id;
    int fuel_amount;
    Timetable timateble;
    
    public Refueller()
    {
        this.id = 0;
        this.fuel_amount = 0;
        this.timetable = null;
    }
    
    public Refueller(int id_, int fuel_amount_, Timetable timetable_)
    {
        this.id = id_;
        this.fuel_amount = fuel_amount_;
        this.timetable = (Queue<String>) timetable_;
    }
    
    public void go_to_next()
    {
        
    }
    public void refresh()
    {
        this.fuel_amount = 100;
    }
}
