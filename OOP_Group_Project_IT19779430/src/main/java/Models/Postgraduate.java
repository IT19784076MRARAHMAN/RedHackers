package Models;
import Interface.Postgarduate_Enrollments;
public class Postgraduate {
    public String ID;
    public String name;
    public String desc;
    public int year;
    
    public Postgraduate(String ID,String name,String desc,int year){
        this.ID=ID;
        this.name=name;
        this.desc=desc;
        this.year=year;    
    }
    public static void main(String [] args){
        Postgarduate_Enrollments run=new Postgarduate_Enrollments();
        run.show();
}
}
