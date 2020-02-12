package Model;

import java.util.ArrayList;

public interface TableMember
{
    //String name;
    //Height height;
    //int weight;
    //String hometown;
    //String highSchool;
    //int number;
    //Sting position;
   
    public String getAttribute(int n);
    
    
    public ArrayList<String> getAttributes();
    
    
    public String getAttributeName(int n);
    
    
    public ArrayList<String> getAttributeNames();
    
}
