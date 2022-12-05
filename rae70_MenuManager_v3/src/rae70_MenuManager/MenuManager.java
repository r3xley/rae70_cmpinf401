package rae70_MenuManager;

/*
 * Class: Menu
 * author: Robert Exley
 * created: 11/27/22 
 */


import java.util.ArrayList;
import java.util.Random;

public class MenuManager {
	private ArrayList<Entree> entrees = new ArrayList<>();
	private ArrayList<Side> sides= new ArrayList<>();
	private ArrayList <Salad>salads= new ArrayList<>();
	private ArrayList <Dessert>desserts= new ArrayList<>();

	public MenuManager(String dishesFile) {

		ArrayList<MenuItem> menuItems = FileManager.readItems(dishesFile);

		for(MenuItem mi : menuItems) {
			if(mi instanceof Entree) {
				entrees.add((Entree)mi);
			}
			else if(mi instanceof Side) {
				sides.add((Side)mi);
			}
			else if(mi instanceof Salad) {
				salads.add((Salad)mi);
			}
			else {
				desserts.add((Dessert)mi);
			}

		}

	}
	/**
	 * Method MenuManager - puts dishes in right arraylist
	 * @param String dishFile
	 * @return N/A
	 */

	public Menu randomMenu(String name) {

		Random randomizeDish = new Random();

		int randEntree = randomizeDish.nextInt(entrees.size());
		int randSide = randomizeDish.nextInt(sides.size());
		int randSalad = randomizeDish.nextInt(salads.size());
		int randDessert = randomizeDish.nextInt(desserts.size());



		Entree randomEntree = entrees.get(randEntree);
		Side randomSide = sides.get(randSide);
		Salad randomSalad = salads.get(randSalad);
		Dessert randomDessert = desserts.get(randDessert);


		return new Menu(name, randomEntree, randomSide, randomSalad, randomDessert);
		/**
		 * Method randomMenu
		 * @param N/A
		 * @return new Menu with random dishes
		 */

	}

	/*public Menu minCalories(String name) {
		int min_entree = 0;
		int min_side = 0;
		int min_salad = 0;
		int min_dessert = 0;
		for(Entree e : entrees) {
			if(e.getCalories() < min_entree) {
				min_entree = e.getCalories();
			}

		}
		for(Side s : sides) {
			if(s.getCalories() < min_side) {
				min_side = s.getCalories();
			}
		}
		for(Salad sa : salads) {
			if(sa.getCalories() < min_salad) {
				min_salad = sa.getCalories();
			}

		}
		for(Dessert d : desserts) {
			if(d.getCalories() < min_dessert) {
				min_dessert = d.getCalories();
			}
		}
		String all = ""

				return new Menu(name, min_entree,min_side,min_salad,min_dessert);


	}*/


}
