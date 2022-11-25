package rae70_MenuManager;
/**
 * Class FileManager
 * @author : Robert Exley 
 * @created: 11/1/2022
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileManager {
	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> entrees = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String food;
			while((food = br.readLine())!= null) {
				String[] EntreeList = food.split("@@");
				Entree entree1 = new Entree(EntreeList[0],EntreeList[1],Integer.parseInt(EntreeList[2]));
				entrees.add(entree1);
			}

			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entrees;
		/**
		 * Method readEntrees
		 * @param filename 
		 * @return array list with "@@" split = entrees
		 */


	}
	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> sides = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String food;
			while((food = br.readLine())!= null) {
				String[] SideList = food.split("@@");
				Side side1 = new Side(SideList[0],SideList[1],Integer.parseInt(SideList[2]));
				sides.add(side1);
			}

			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sides;
		/**
		 * Method readSides
		 * @param filename 
		 * @return array list with "@@" split = sides
		 */


	}
	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> salads = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 

			String food;
			while((food = br.readLine())!= null) {
				String[] SaladList = food.split("@@");
				Salad salad1 = new Salad(SaladList[0],SaladList[1],Integer.parseInt(SaladList[2]));
				salads.add(salad1);
			}

			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return salads;
		/**
		 * Method readSalads
		 * @param filename 
		 * @return array list with "@@" split = salads
		 */

	}
	public static ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> desserts = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 

			String food;
			while((food = br.readLine())!= null) {
				String[] DessertList = food.split("@@");
				Dessert dessert1 = new Dessert(DessertList[0],DessertList[1],Integer.parseInt(DessertList[2]));
				desserts.add(dessert1);
			}

			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return desserts;
		/**
		 * Method readDesserts
		 * @param filename 
		 * @return array list with "@@" split = dessert
		 */

	}

}


