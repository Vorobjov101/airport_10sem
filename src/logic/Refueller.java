package logic;

import java.util.Queue;


public class Refueller
{
    int id;
    int fuel_amount;
    
    public Refueller()
    {
        this.id = 0;
        this.fuel_amount = 0;
    }
    
    public Refueller(int id_, int fuel_amount_, Timetable timetable_)
    {
        this.id = id_;
        this.fuel_amount = fuel_amount_;
    }
    
    public void refresh()
    {
        this.fuel_amount = 10000;
    }
    
    public int get_fuel_amount()
    {
        return this.fuel_amount;
    }
}
