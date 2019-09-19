/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CookBook 
{
    //instance data
    private CookBookPanel cpan;
    private ArrayList <String> words;
    private String w;
    
    
    /**
     * Initializes the instance data
     */
    public CookBook() 
    {
        cpan = new CookBookPanel();
        words = new ArrayList<>();
        w = "";
       
    }
    
    /**
     *  This class opens the file and collects the data and puts them in a String
     * @param String filename
     * @return w
     */
    public String openFile(String filename) throws FileNotFoundException
    {
        String line, word;
        
       
       Scanner input = new Scanner(new File(filename));
       while( input.hasNext())
       {
           line = input.nextLine();
           Scanner sca = new Scanner(line);
           
           while( sca.hasNext())
           {    
               word = sca.next();
               words.add(word);
           }
       }
       w = words.toString();
       return w;
       
    }
    
    /**
     * Puts the String of the file contents in another String
     * @return str
     */
    public String toString()
    {
        String str = w;
        return str;
    }
}
