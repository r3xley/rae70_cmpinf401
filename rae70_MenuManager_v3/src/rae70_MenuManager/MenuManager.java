package rae70_MenuManager;

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
				entrees.add((Entree) mi);
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


		return new Menu("Today's Menu!", randomEntree, randomSide, randomSalad, randomDessert);
		/**
		 * Method randomMenu
		 * @param N/A
		 * @return new Menu with random dishes
		 */

	}

}
