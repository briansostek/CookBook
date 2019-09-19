/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

public class CookBookDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
       JFrame frame = new JFrame(); //opens up a new fram for cookbook
       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
       CookBookPanel cpan = new CookBookPanel(); // creates new panel
       frame.add(cpan); //adds the panel to the frame
       frame.pack();
       frame.setVisible(true);
       //puts all the files into an arraylist of all recipes
       ArrayList <Recipe> recipes = new ArrayList<>();
       File a = new File("Pancakes.txt");
       Recipe ar = new Recipe(a);    
       File b = new File("GrilledCheese.txt");
       Recipe br = new Recipe(b);    
       File c = new File("Pizza.txt");
       Recipe cr = new Recipe(c);    
       File d = new File("Brownies.txt");
       Recipe dr = new Recipe(d);    
       File e = new File("Pasta.txt");
       Recipe er = new Recipe(e);    
       File f = new File("StirFry.txt");
       Recipe fr = new Recipe(f);    
       File g = new File("Samosa.txt");
       Recipe gr = new Recipe(g);    
       File h = new File("PadThai.txt");
       Recipe hr = new Recipe(h);    
       File i = new File("Sushi.txt");
       Recipe ir = new Recipe(i);  
       File j = new File("Tacos.txt");
       Recipe jr = new Recipe(j);
       recipes.add(ar);
       recipes.add(br);
       recipes.add(cr);
       recipes.add(dr);
       recipes.add(er);
       recipes.add(fr);
       recipes.add(gr);
       recipes.add(hr);
       recipes.add(ir);
       recipes.add(jr);
    }    
}
