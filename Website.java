/**
 * Write a description of class Website here.
 *
 * @Gabriel Fioreze
 *
 */
public class Website
{
    // instance variables - replace the example below with your own
    private String name;
    private int hits;
    private int salesTotal;

    /**
     * Constructor for objects of class Website
     */
    public Website()
    {
        // initialise instance variables
        name = "Wine Direct";
        hits = 0;
        salesTotal = 0;
    }

    public void buyerLogin(Browser browser)
    {
        // put your code here
        System.out.println("Wine Direct welcomes buyer, " + browser.getiD() 
            + "you are now logged in");
        browser.setWebsite(this);
        hits +=1;
        //brackets referencing (this) class/object
    }

    public void becomeBuyer(Browser browser) {
        if (browser.getYearOfBirth() <= 2004)
        {
            browser.setID (999);
        }
    }
    
    public void checkout(Browser browser) {
        System.out.println("Thanks for your purchase. ");
    }
    
    public void checkHitDiscount(WineCase winecase) {
        if (hits % 10 == 0) {
        double discounted = winecase.getPrice() * 0.9;
        winecase.setPrice(discounted); }
    }
}