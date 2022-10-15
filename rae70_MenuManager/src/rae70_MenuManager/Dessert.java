package rae70_MenuManager;

public class Dessert {

	String name;
	String description;
	int calories;

	public Dessert(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;

		/*
		 * Declare the name description and calories and assign
		 */

	}

	public int getCal() {
		return calories;
	}

	public void setCal(int calories) {
		this.calories = calories;
	}

	public String getDescription() {
		return description;

	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}
	/*
	 * ^ getters and setters for name, description, cal. (Dessert)
	 */

}
