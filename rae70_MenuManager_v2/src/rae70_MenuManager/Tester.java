package rae70_MenuManager;

public class Tester {
	public static void main(String[] args){
		MenuRandomize randomize = new MenuRandomize("data/entrees.txt",
				"data/sides.txt","data/salads.txt","data/desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\n"+
				myMenu.totalCalories());

	}
}


