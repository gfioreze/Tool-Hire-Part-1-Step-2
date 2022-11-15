
/**
 * Write a description of class WineCase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WineCase
{
    // instance variables - replace the example below with your own
    private String refNo;
    private String description;
    private int noOfBottles;
    private double price;

    /**
     * Constructor for objects of class WineCase
     */
    public WineCase(String newRefNo, String newDescription, int newNoOfBottles,
    double newPrice)
    {
        // initialise instance variables
        refNo = newRefNo;
        description = newDescription;
        noOfBottles = newNoOfBottles;
        price = newPrice; 
    }
    
    // start of accessor methods
    
    public String getRefNo() 
    {
        return refNo;
    }
    
    public String getDescription() 
    {
        return description;
    }
    
    public String getNoOfBottles() 
    {
        return description;
    }
    
    public double getPrice() 
    {
        return price;
    }
    
    // start of mutator methods
    
    public void setRefNo(String newRefNo) 
    {
        refNo = newRefNo;
    }
    
    public void setDescription(String newDescription) 
    {
        description = newDescription;
    }
    
    public void setNoOfBottles(int newNoOfBottles)
    {
        noOfBottles = newNoOfBottles;
    }
    
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
}