import java.util.*;
public class Players {
    private int location=0;
    private String name;
    Players(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getLocation(){
        return location;
    }
    public void setLocation(int loc){
        this.location=loc;
    }

}
