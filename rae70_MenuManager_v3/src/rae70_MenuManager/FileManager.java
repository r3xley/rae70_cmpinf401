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
				String descr = itemList[2];
				int cal = Integer.parseInt(itemList[3]);
				double price = Double.parseDouble(itemList[4]);
				MenuItem item = new MenuItem(name, descr, cal, price);
				items.add(item);

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
				// Create an output string by concattenating data from each menu
				output = m.entree.getName();
				bw.write(output);

			}

			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



