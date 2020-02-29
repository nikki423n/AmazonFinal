package control;

import util.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductStorage 
{
    private ArrayList<Electronics> prodElectronics;
    private ArrayList<Clothes> prodClothes;
    private ArrayList<Games> prodGames;
    
    
    public static void main(String args[])
    {
        // create general properties for electronics
        /*ArrayList<Object> generalProperties = new ArrayList<Object>();
        generalProperties.add("Electronics");
        generalProperties.add("dell.png");
        generalProperties.add((Double) 500.0);
        generalProperties.add((Double) 9.1);
        
        // create properties for computer in electronics
        ArrayList<Object> electronicsProperties = new ArrayList<Object>();
        electronicsProperties.add("Dell");
        electronicsProperties.add("Computer");
        electronicsProperties.add((Integer) 2015);  // yearReleased
        electronicsProperties.add("PC Laptop"); // category
        electronicsProperties.add((Boolean) false); // is it bestseller */
        
        // instantiate an object electronic, a computer, and add it to productstorage
        Product item = new Games(new ArrayList(Arrays.asList("Madden", "//", 60.00, 3.5)), 
        		new ArrayList(Arrays.asList("EA", "Sports", 2020, 10, "Single player")));
        
    }
    
    /**
     * Default constructor to initialize all products to empty ArrayList
     */
    public ProductStorage()
    {
        prodElectronics = new ArrayList<Electronics>();
        prodClothes = new ArrayList<Clothes>();
        prodGames = new ArrayList<Games>();
    }
    
    /**
     * Constructor to initialize all products and add first electronics object into prodElectronics
     */
    
    public ProductStorage(Electronics e)
    {
        System.out.println("New electronic product added to product storage");
        e.setDescription();
        
        prodElectronics = new ArrayList<Electronics>();
        prodElectronics.add(e);
        prodClothes = new ArrayList<Clothes>();
        prodGames = new ArrayList<Games>();
    }
    
    /**
     * Constructor to initialize all products and add first electronics object into prodClothes
     */
    
    public ProductStorage(Clothes c)
    {
        prodElectronics = new ArrayList<Electronics>();
        prodClothes = new ArrayList<Clothes>();
        prodClothes.add(c);
        prodGames = new ArrayList<Games>();
    }
    
    /**
     * Constructor to initialize all products and add first electronics object into prodGames
     */
    
    public ProductStorage(Games g)
    {
        prodElectronics = new ArrayList<Electronics>();
        prodClothes = new ArrayList<Clothes>();
        prodGames = new ArrayList<Games>();
        prodGames.add(g);
    }
    

    /**
     * Method to add one electronic object to prodElectronics ArrayList
     */
    
    public void addElectronics(Electronics e)
    {
        System.out.println("New electronic product added to product storage");
        e.setDescription();
        
        prodElectronics.add(e);
    }
    
    /**
     * Method to add one clothesc object to prodClothes ArrayList
     */

    public void addClothes(Clothes c)
    {
        prodClothes.add(c);
    }
    
    /**
     * Method to add one game object to prodGames ArrayList
     */
    
    public void addGames(Games g)
    {
        prodGames.add(g);
    }
    
    /**
     * Method to delete electronic object e from prodElectronics ArrayList
     */
    
    public void removeElectronics(Electronics e)
    {
        System.out.println("New electronic product removed from product storage");
        e.setDescription();
        
        prodElectronics.remove(e);
    }
    
    /**
     * Method to delete clothes object c from prodClothes ArrayList
     */

    public void removeClothes(Clothes c)
    {
        prodClothes.remove(c);
    }
    
    /**
     * Method to delete game object g from prodGames ArrayList
     */
    
    public void removeGames(Games g)
    {
        prodGames.remove(g);
    }
}
