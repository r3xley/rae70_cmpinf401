package rae70_MenuManager;
/**
 * Class FileManager
 * @author : Robert Exley 
 * @created: 11/1/2022
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;



public class FileManager {
	public static ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<MenuItem> items = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String food;
			while((food = br.readLine())!= null) {
				String[] itemList = food.split("@@");
				String name = itemList[0];
				String type = itemList[1];
				String descr = itemList[2];
				int cal = Integer.parseInt(itemList[3]);
				double price = Double.parseDouble(itemList[4]);
				
				if(type.equalsIgnoreCase("entree")) {
					Entree item = new Entree(name, descr, cal, price);
					items.add(item);
				}
				else if(type.equalsIgnoreCase("dessert")) {
					Dessert item = new Dessert(name, descr, cal, price);
					items.add(item);
				}
				else if(type.equalsIgnoreCase("side")) {
					Side item = new Side(name, descr, cal, price);
					items.add(item);
				}
				else if(type.equalsIgnoreCase("salad")) {
					Salad item = new Salad(name, descr, cal, price);
					items.add(item);
				}
				

			}

			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return items;
		/**
		 * Method readEntrees
		 * @param filename 
		 * @return array list with "@@" split = entrees
		 */


	}
	public static void writeToFile(String filename,ArrayList<Menu>menus) {
		try {
			System.out.println(System.getProperty("user.dir"));
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);

			for(Menu m : menus){
				String output = "";
				String output2 = "";
				String output3 = "";
				String output4 = "";
				// Create an output string by concattenating data from each menu
				output = m.entree + " "+ m.entree.getDescription() +" "+ m.entree.getCalories()+"\n";
				output2 = m.side + " "+ m.side.getDescription() +" "+ m.side.getCalories()+"\n";
				output3 = m.salad + " "+ m.salad.getDescription() +" "+ m.salad.getCalories()+"\n";
				output4 = m.dessert + " "+ m.dessert.getDescription() +" "+ m.dessert.getCalories()+"\n";
				 
				bw.write(output);
				bw.write(output2);
				bw.write(output3);
				bw.write(output4);

			}

			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



