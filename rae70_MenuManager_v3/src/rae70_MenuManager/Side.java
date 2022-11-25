package rae70_MenuManager;
/*
 * Class: Side
 * author: Robert Exley
 * created: 10/9/22 
 */
public class Side {
	String name;
	String description;
	int calories;

	public Side(String name, String description, int calories) {
		this.name = name; 
		this.description = description;
		this.calories = calories;
		/*
		 * declare and assign for the side class
		 */

	}
	public int getCal() {
		return calories;
	}
	public void setCal(int calories) {
		this.calories = calories;
	}
	public String getDescription(){
		return description;

	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getName(){
		return name;

	}
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * ^ getters and setters for name, description, cal. (Side)
	 */
}
