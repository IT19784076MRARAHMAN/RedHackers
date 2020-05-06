 
package Models;
import Frames.MarkertingTeam_Members;
public class Markerting_Team {
    public String ID;
    public String name;
    public String role;
    public String desc; 
    
    public Markerting_Team(String ID,String name,String role,String desc){
        this.ID=ID;
        this.name=name;
        this.role=role;
        this.desc=desc;
    }
    public static void main(String []args){
        MarkertingTeam_Members exe=new MarkertingTeam_Members();
        exe.show();
    }
}
