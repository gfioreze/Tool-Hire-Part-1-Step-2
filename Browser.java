/**
 * Write a description of class Browser here.
 *
 * @Gabriel Fioreze
 * 
 */
public class Browser
{
    // instance variables (global variables)
    private int yearOfBirth;
    private String email;
    private int iD;
    private boolean isBuyer;
    private WineCase wineCase;
    private Website website;

    /**
     * Default constructor for objects of class Browser
     */
    public Browser(int userDOB, String userEmail)
    {
        // initialise instance variables
        yearOfBirth = userDOB;
        email = userEmail;
    }
    
    /**
     * Constructor for objects of class Browser
     */
    public Browser(int userDOB, String userEmail, int useriD)
    {
        // initialise instance variables
        yearOfBirth = userDOB;
        email = userEmail;
        iD = useriD;
    }
    
    //Start of accessor methods
    public int getYearOfBirth() 
    {
        return yearOfBirth;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public int getiD()
    {
        return iD;
    }
        
    public boolean getBuyerStatus() 
    {
        return isBuyer;
    }
    
    public WineCase getWineCase() 
    {
        return wineCase;
    }
    
    public Website getWebsite() {
        return website;
    }
    
    // start of mutator methods
    public void setOfBirth (int newYearOfBirth) 
    {
        yearOfBirth = newYearOfBirth;
    }
    
    public void setEmail (String newEmail)
    {
        email = newEmail;
    }
    
    public void setID(int newID) 
    {
        iD = newID;
    }
    
    public void setBuyerStatus(boolean buyerStatus)
    {   
        isBuyer = buyerStatus;
    }
    
    public void selectWineCase(int getiD, WineCase newWineCase) 
    {
        System.out.println("Buyer with ID " + getiD() + 
        " has selected wine case with reference number" 
        + newWineCase.getRefNo() + ", a case of " 
        + newWineCase.getDescription() + " of " 
        + newWineCase.getNoOfBottles() + " at " 
        + newWineCase.getPrice());
    }
    
    public void setWebsite(Website newWebSite) {
        website = newWebSite;
    }
    
    public void payforWine(Website newWebsite) {
        //this references the browser object 
        newWebsite.checkout(this);
    }
    
}