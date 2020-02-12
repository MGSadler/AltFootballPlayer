package Model;

public class Height
{

    //****Attributes are defined and Encapsulated****
    private int feet;
    private int inches;

    //****Constructor - Transfer information to attributes****
    public Height(int in_feet, int in_inches)
    {
        feet = in_feet;
        inches = in_inches;
    }

    //****Methods****
    public int getTotalInches()
    {
        int totalInches = feet * 12 + inches;
        return totalInches;
    }
    
    /**
     *  Meant to return String for entire class
     * 
     * @return 
     */
    @Override
    public String toString()
    {
        return getFeet() + "'" + getInches() + "\"";
    }
    
    void displayInfo()
    {
        System.out.println(toString());
    }
    
    public int getFeet()
    {
        return feet;
    }

    public void setFeet(int feet)
    {
        this.feet = feet;
    }

    public int getInches()
    {
        return inches;
    }

    public void setInches(int inches)
    {
        this.inches = inches;
    }    
}
