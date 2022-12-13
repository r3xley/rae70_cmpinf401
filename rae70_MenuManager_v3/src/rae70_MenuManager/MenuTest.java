package rae70_MenuManager;

import java.util.ArrayList;

/*
 * Class: MenuTest
 * author: Robert Exley
 * created: 10/9/22 
 */
public class MenuTest {

	public static void main(String[] args) {
		 ArrayList<MenuItem> mi = FileManager.readItems("data/dishes.txt");
		
		 for(MenuItem item : mi) {
		 	System.out.println(item.getDescription());
		 }
		
		//MenuManager mm = new MenuManager("data/dishes.txt");
		//System.out.println(mm.getEntrees().get(1).getDescription());
	}


}
