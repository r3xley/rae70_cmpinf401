package rae70_MenuManager;
/*
 * Class: Menu
 * author: Robert Exley
 * created: 10/9/22 
 */
public class Menu {
	String name;
	Entree entree;
	Salad salad;
	Side side;
	Dessert dessert;



	public Menu(String name) {
		this.name = name;
		entree = null;
		side = null;
		salad = null;
		dessert = null;

	}

	public Menu(String name, Entree entree, Side side) {
		this.name = name; 
		this.entree = entree;
		this.side = side;
		salad = null;
		dessert = null;
	}
	public Menu(String name, Entree entree, Side side, Salad salad,Dessert dessert) {
		this.name = name; 
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	/*
	 *^^ Created three instances of a menu with different parameters
	 */


	public String totalCalories() {
		int totalcal = 0;
		if(entree == null) {
			totalcal += 0;
		}else {
			totalcal += entree.getCalories();
		}
		if(side == null) {
			totalcal += 0;
		}else {
			totalcal += side.getCalories();
		}
		if(salad == null) {
			totalcal += 0;
		}else {
			totalcal += salad.getCalories();
		}
		if(dessert == null) {
			totalcal += 0;
		}else {
			totalcal += dessert.getCalories();
		}


		return "Total Calories: " + totalcal;
		/*
		 * check each category for a null value --> turn it to 0, if not GET the calories and add to total
		 */


	}
	public String description() {
		String totalDescription = "";
		if(name == null) {
			totalDescription += "N/A" + "\n";
		}else {
			totalDescription += name + "\n";
		}

		if(entree == null) {
			totalDescription += "Entree: N/A" + "\n";
		}else {
			totalDescription += "Entree: " + entree.getDescription() + "\n";
		}
		if(side == null) {
			totalDescription += "Side: N/A" + "\n";
		}else {
			totalDescription += "Side: " + side.getDescription() + "\n";
		}

		if(salad == null) {
			totalDescription += "Salad: N/A" + "\n";

		}else {
			totalDescription += "Salad: " + salad.getDescription() + "\n";
		}
		if(dessert == null) {
			totalDescription += "Dessert: N/A" + "\n";
		}else {
			totalDescription += "Dessert: " + dessert.getDescription() + "\n";
		}

		return totalDescription;
		/*
		 * Also check if the value is null, otherwise add description to string 
		 */
	}

	public String toString() {
		return name;

	}
}

