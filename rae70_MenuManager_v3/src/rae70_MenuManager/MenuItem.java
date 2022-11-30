package rae70_MenuManager;

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

}
