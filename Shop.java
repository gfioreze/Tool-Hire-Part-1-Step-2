import java.io.*;
import java.util.*;
import java.awt.*;
import java.lang.String;
/**
 * This class stores tool objects of type Tool, for that it uses a 
 * method to retrieve the tools from an external txt file.
 *
 * @author (Gabriel Fioreze)
 * @version (v2)
 */
public class Shop
{
    // array toolList of type Tool
    private ArrayList<Tool> toolList;

    /**
     * Constructor for objects of class Shop
     */
    public Shop()
    {
        //initialise instance variables
        toolList = new ArrayList<Tool>();
    }

    // adds a tool to toolList. This takes a tool object as a parameter
    public void storeTool(Tool tool)

    {
        toolList.add(tool);
    }

    // the method uses FileDialog object to open a txt.file 
    public void readToolData() 
    {
        //create a FileDialog object save to a variable
        FileDialog myFrame = null;
        FileDialog fileBox = new FileDialog(myFrame,
                "Open", FileDialog.LOAD);
        //make it visible
        fileBox.setVisible(true);
        //.getfileName() method to retrieve the file name from directory
        String fileName = fileBox.getFile();
        //create object from that file name and pass it to the scanner
        //scan the entire line
        Scanner scanner = new Scanner(fileName);

        //while there is more data in the file
        while (scanner.hasNextLine()) {
            //read line into variable lineOfText
            String lineOfText = scanner.nextLine().trim();
            if (!lineOfText.isEmpty() && !lineOfText.startsWith("//"))
            {
                //scans a line of text again 
                Scanner scanner2 = new Scanner(lineOfText);
                //uses a comma as a delimeter 
                scanner2.useDelimiter(",");
                System.out.println(lineOfText);
                //scans the first token on first line (toolName)
                String toolName = scanner2.next();
                //scans the second token on first line 
                String itemCode = scanner2.next();
                //scans the third token on first line 
                int timesBorrowed = scanner2.nextInt();
                //scans the fourth token on first line 
                boolean onLoan = scanner2.nextBoolean();
                //scans the fifth token on first line 
                double cost = scanner2.nextDouble();
                //scans the sixth token on first line 
                double weight = scanner2.nextDouble();
                //assign the values to a new tool
                Tool tool = new Tool (toolName, itemCode, timesBorrowed, onLoan, cost, weight);
                //store object above in an array
                toolList.add(tool);
            }
        }
        scanner.close();
    }
    
    public void printAllTools()

    {

        for (Tool tool : toolList)
        {
            System.out.println(tool);

            tool.printDetails();
        }
    }
}