package control;

import java.util.ArrayList;

import Control.Product;

public class Clothes extends Product{
	
	private String  creator, type;
	private int yearReleased, age;
	private String size;
	private String color;
	private char gender;
	
	
	public Clothes(ArrayList generalProperties, ArrayList clothesProperties) {
		//general properties
		super.name = (String) generalProperties.get(0);
		super.imagePath = (String) generalProperties.get(1);
		super.price = (double) generalProperties.get(2);
		super.rating = (double) generalProperties.get(3);
		
		creator = (String) clothesProperties.get(0);
		type = (String) clothesProperties.get(1);
		yearReleased = (int) clothesProperties.get(2);
		gender = (char) clothesProperties.get(3);
		size = (String) clothesProperties.get(4);
		color = (String) clothesProperties.get(5);
	}
	
	@Override
	protected void setDescription() {
		import java.util.ArrayList; 

		public class Clothes extends Product
		{

		    private String  creator, type;
		    private int yearReleased, age;
		    private char gender;
		    private String size;
		    private String color;

		    /**
		     * Constructor to initialize a clothes object given its generalProperties and clothesProperties
		     */

		    public Clothes(ArrayList generalProperties, ArrayList clothesProperties) {
		        //general properties
		        super.name = (String) generalProperties.get(0);
		        super.imagePath = (String) generalProperties.get(1);
		        super.price = (double) generalProperties.get(2);
		        super.rating = (double) generalProperties.get(3);

		        // clothes properties
		        creator = (String) clothesProperties.get(0);
		        type = (String) clothesProperties.get(1);
		        yearReleased = (int) clothesProperties.get(2);
		        gender = (char) clothesProperties.get(3);
		        size = (String) clothesProperties.get(4);
		        color = (String) clothesProperties.get(5);
		    }

		    @Override
		    protected void setDescription() {
		        
		        // Convert all descriptions into strings
		        // General descriptions
		        String des_name = String.format("Product name: %s", super.name);
		        String des_category = String.format("Category: Clothes");
		        String des_imagePath = String.format("Image path: %s", super.imagePath);
		        String des_price = String.format("Price: $%.2f", super.price);
		        String des_rating = String.format("Rating: %.1f", super.rating);

		        // clothes properties
		        String des_creator = String.format("Creator: %s", creator);
		        String des_type = String.format("Type: %s", type);
		        String des_yearReleased = String.format("Year released: %d", yearReleased);
		        String des_gender = String.format("Youngest age: %c", gender);
		        String des_size = String.format("Product name: %s", size);
		        String des_color = String.format("Product name: %s", color);

		        // print out all properties
		        System.out.println(des_name);
		        System.out.println(des_creator);
		        System.out.println(des_type);
		        System.out.println(des_yearReleased);
		        System.out.println(des_category);
		        System.out.println(des_gender);
		        System.out.println(des_size);
		        System.out.println(des_color);
		        System.out.println(des_imagePath);
		        System.out.println(des_price);
		        System.out.println(des_rating);
		    }
		}
	}
}
