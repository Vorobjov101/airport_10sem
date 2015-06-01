package logic;


public class Dispetcher
{
   Refueller ref_mass[] = new Refueller[10];
   Parking park;
   
   public Dispetcher()
   {
       for(int i=0;i<10;i++)
       {this.ref_mass[i] = new Refueller();}
       this.park = new Parking();
       
   }
   
   public void create_timetable()
   {}
   
   public void arrive_plane()
   {}
   
   public void depature_plane()
   {}
   
   public void check_planes()
   {}
   
   public void move_refueller()
   {}
}
