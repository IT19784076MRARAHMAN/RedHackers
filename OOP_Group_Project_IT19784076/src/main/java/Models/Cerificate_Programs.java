
package Models;
import Frame.Certificate_Program_Enrollments;
public class Cerificate_Programs {
    public String ID;
    public String name;
    public String desc;
    public int year;
    
    public Cerificate_Programs(String ID,String name,String desc,int year){
        this.ID=ID;
        this.name=name;
        this.desc=desc;
        this.year=year;
    }
    public static void main(String []args){
        Certificate_Program_Enrollments go=new Certificate_Program_Enrollments();
        go.show();
    }
    
}
