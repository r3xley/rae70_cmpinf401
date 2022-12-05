package rae70_MenuManager;
/*
 * Class: MenuManager
 * author: Robert Exley
 * created: 11/27/22 
 */
public class MenuItem {
	private String name;
	private String description;
	private int calories;
	private double price;

	public MenuItem(String name, String description,int calories,double price) {
		this.name = name;
		this.description = description;
		this.calories = calories;
		this.price = price;
		/**
		 * Method MenuItem
		 * @param String name, String description,int calories,double price
		 * @return N/A
		 */


	}

	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}
	public int getCalories() {
		return this.calories;
	}
	public double getPrice() {
		return this.price;
	}
	public String toString(){
		return name;


	}
	//getter and setters
}
