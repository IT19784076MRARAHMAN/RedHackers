package Models;

import Interface.Undergraduate_Enrollments;

public class Undergraduate {
    public String ID;
    public String name;
    public String desc;
    public int year;
    
    public Undergraduate(String ID,String name,String desc,int year){
        this.ID=ID;
        this.name=name;
        this.desc=desc;
        this.year=year;    
    }

    /**
     *
     * @param args
     */
    public static void main(String [] args){
        Undergraduate_Enrollments run=new Undergraduate_Enrollments();
        run.show();
}    
}
