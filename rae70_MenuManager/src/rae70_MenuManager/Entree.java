package rae70_MenuManager;

public class Entree {
	private String name;
	private String description;
	private int calories; 
		
	public Entree(String name, String description, int calories) {
		this.name = name; 
		this.description = description;
		this.calories = calories;
	
		/*
		 * declare and assign 
		 */
	}
	public int getCal() {
		return calories;
	}
	public void setCal(int calories) {
		this.calories = calories;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	/*
	 * ^ getters and setters for name, description, cal. (Entree)
	 */

}
