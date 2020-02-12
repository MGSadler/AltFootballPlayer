package Model;

public class Person
{

    //****Attributes are defined and Encapsulated****
    protected String name;
    protected Height height;
    protected int weight;
    protected String hometown;
    protected String highSchool;

    //****Constructor - Transfer information to attributes****
    public Person(String in_name, Height in_height, int in_weight, String in_hometown, String in_highSchool)
    {
        name = in_name;
        height = in_height;
        weight = in_weight;
        hometown = in_hometown;
        highSchool = in_highSchool;
    }

    //****Methods****
    /**
     * Meant to return String for entire class
     *
     * @return
     */
    @Override
    public String toString()
    {
        return getName() + ", " + getHeight() + ", " + getWeight() + ", " + getHometown() + ", " + getHighSchool() + ", ";
    }

    void displayInfo()
    {
        System.out.println(toString());
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Height getHeight()
    {
        return height;
    }

    public void setHeight(Height height)
    {
        this.height = height;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public String getHometown()
    {
        return hometown;
    }

    public void setHometown(String hometown)
    {
        this.hometown = hometown;
    }

    public String getHighSchool()
    {
        return highSchool;
    }

    public void setHighSchool(String highSchool)
    {
        this.highSchool = highSchool;
    }

}
