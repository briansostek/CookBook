import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JTextArea;


public class Recipe
{
    //instance data
    private String author;
    private String category;
    private String name;
	
    /**
     * Initializes the instance data (name, category, author)
     */
    public Recipe()
    {
        name = "";
	author = "";
	category = "";
        
    }
    public Recipe( File file)
    {
        name = "";
        author = "";
        category = "";
    }

    /**
     * Gets the name of the recipe
     * @return name
     */
    public String getName()
    {
        return name;
    }
    /**
     * Sets the name of the recipe
     * @param String name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * Gets the author of the recipe
     * @return author
     */
    public String getAuthor() 
    {  
        return author;
    }
    /**
     * Sets the name of the author
     * @param String author 
     */
    public void setAuthor(String author)
    {
        this.author = author;

    }
    
    /**
     * Gets the category of the recipe
     * @return category
     */
    public String getCategory()
    {
       return category;
    }
    
    /**
     * Sets the category of the recipe
     * @param String category
     */
    public void setCategory(String category)
    {
	this.category = category;
    }
	
    /**
     * Write the recipe to a file already created called Recipe.txt
     * @param JTextArea area
     * @throws IOException 
     */
    public void writeFile(JTextArea area) throws IOException
    {
        //uses bufferedwriter to print the recipe to the file
	try (BufferedWriter fileOut = new BufferedWriter(new FileWriter("Recipe.txt"))) 
        {
            area.write(fileOut);
        }
    }
    /**
     * Puts the name, author, and category of the recipe to a String
     * @return str
     */
    public String toString()
    {
	String str = "Name: " + name + "\nAuthor: " + author + "\nCategory: " 
                    + category;
	return str;
    }

    
}
