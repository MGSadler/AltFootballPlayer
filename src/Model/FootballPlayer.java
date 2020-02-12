package Model;

import java.util.ArrayList;

public class FootballPlayer extends Person implements TableMember
{

    //****Attributes are defined and Encapsulated****
    private int number;
    private String position;

    //****Constructor - Transfer information to attributes****
    public FootballPlayer(int in_number, String in_name, String in_position,
            int in_feet, int in_inches, int in_weight, String in_hometown, String in_highSchool)
    {
        super(in_name, new Height(in_feet, in_inches), in_weight, in_hometown, in_highSchool);
        number = in_number;
        position = in_position;
    }
    
    

    //****Methods****
    @Override
    public String getAttribute(int n)
    {
        switch(n)
        {
            case 0: return name;
            case 1: return height + "";
            case 2: return weight + "";
            case 3: return hometown;
            case 4: return highSchool;
            case 5: return number + "";
            case 6: return position;
        }
        
        return null;
    }
    
    @Override
    public ArrayList<String> getAttributes()
    {
        ArrayList<String> attributes = new ArrayList<>();
        for(int i = 0; i < 7; i++)
            attributes.add(getAttribute(i));
        return attributes;
    }
    
    @Override
    public String getAttributeName(int n)
    {
        switch(n)
        {
            case 0: return "name";
            case 1: return "height";
            case 2: return "weight";
            case 3: return "hometown";
            case 4: return "highSchool";
            case 5: return "number";
            case 6: return "position";
        }
        
        return null;
    }
    
    @Override
    public ArrayList<String> getAttributeNames()
    {
        ArrayList<String> attributeNames = new ArrayList<>();
        for(int i = 0; i < 7; i++)
            attributeNames.add(getAttributeName(i));
        return attributeNames;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " " + getNumber() + " - " + getPosition();
    }
    
    @Override
    public void displayInfo()
    {
        System.out.println(toString());
    }
    
    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

}
