
package logic;

public class Plane 
{
    int planeid;
    String planemodel;
    int tankvolume;
    
    public Plane()
    {
        this.planeid = 0;
        this.planemodel = "";
        this.tankvolume = 0;
    }
    
    public Plane(int planeid_, String planemodel_, int tankvolume_)
    {
        this.planeid = planeid_;
        this.planemodel = planemodel_;
        this.tankvolume = tankvolume_;
    }
    
    public int get_planeid() {return this.planeid;}
    public String get_planemodel() {return this.planemodel;}
    public int get_tanklvolume(){return this.tankvolume;}
    
}
