package rae70_MenuManager;
/**
 * Class MenuRandomize
 * @author : Robert Exley
 * @created: 11/1/2022
 */

import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList <Salad>salads;
	private ArrayList <Dessert>desserts;

	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile){

		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
	}
	public Menu randomMenu() {

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
