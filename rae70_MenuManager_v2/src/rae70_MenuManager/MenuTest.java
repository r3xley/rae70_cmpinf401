package rae70_MenuManager;
/*
 * Class: MenuTest
 * author: Robert Exley
 * created: 10/9/22 
 */
public class MenuTest {

	public static void main(String[] args) {

		Entree steak = new Entree("Sirloin Steak","A delicious piece of delicate meat",500);
		Entree lobster = new Entree("Lobster","High quality lobster",600);
		Side spinich = new Side("Spinich","Sauteed Spinich",150);
		Salad salad1 = new Salad("Special Salad1","Tasty and fresh",90);
		Salad salad2 = new Salad("Special Salad2","Today's Special",120);
		Dessert cake = new Dessert("Cake","Fluffy freshly baked",300);

		/*
		 * ^ create test entree,side,salad,and a dessert
		 * 
		 */


		Menu menu1 = new Menu("Menu 1",steak,null,salad1,null);
		Menu menu2 = new Menu("Menu 2",lobster,spinich,salad2,cake);

		System.out.println(menu1.totalCalories());
		System.out.println(menu1.description());
		System.out.println(menu2.description());

		/*
		 * print out test cases
		 */

	}


}
