package logic;

import java.util.PriorityQueue;
import java.util.Queue;

public class Timetable 
{
    Queue<String> timetable = new PriorityQueue<>(10, null);
    
    public String get_next() {return timetable.remove();}
    public void add_new(String new_) {timetable.add(new_);}
}
