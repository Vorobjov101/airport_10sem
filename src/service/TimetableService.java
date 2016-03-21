
package service;

import logic.Timetable;

public class TimetableService {
    
    //Timetable timet;
    
    public void add_new(Timetable timet,int id)
    {
        timet.add_new(Integer.toString(id));
    }
    
}
