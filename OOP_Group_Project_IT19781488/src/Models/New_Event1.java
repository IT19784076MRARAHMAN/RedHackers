package Models;
import Frame.New_Event;
public class New_Event1 {
    public String ID;
    public String name;
    public String date;
    public String venue;
    public New_Event1(String ID,String name,String date,String venue){
        this.ID=ID;
        this.name=name;
        this.date=date;
        this.venue=venue;  
    }
    public static void main(String []args){
        New_Event done=new New_Event();
        done.show();
    }
    
}
