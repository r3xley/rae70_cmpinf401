package rae70_lab5;
import java.util.Random;
import javax.swing.JOptionPane;
public class DiceRoll {

	public static void main(String[] args) {
		String terminate = "quit";
		Random r = new Random();
		String userinput = JOptionPane.showInputDialog("Enter value");
		double input = Double.parseDouble(userinput);
		
		while(userinput.equals(terminate) == false){
			RollDice(input,r);
			String newinput = JOptionPane.showInputDialog("Enter value, else enter 'quit'");
			if(newinput.equals(terminate)) {
				System.out.println("Thank You!");
				break;
			}else {
				input = Double.parseDouble(newinput);
			}
		}
		
	
			
	}
	static void RollDice(double input, Random r ) {
		double first;
		double second;
		
		double two = 0;
		double third = 0;
		double four = 0;
		double five = 0;
		double six = 0;
		double seven = 0;
		double eight = 0;
		double nine = 0;
		double ten = 0;
		double eleven = 0;
		double twelve = 0;
		double total;
		double i = 0;
		while (i < input) {
			first = r.nextInt(6) + 1;
			second = r.nextInt(6) + 1;
			total = first + second;
				if (total == 2) {
					two ++;
				}
				else if(total == 3){
					third ++;
				}
				else if(total == 4) {
					four ++;
				}
				else if(total == 5) {
					five++;
				}
				else if(total == 6) {
					six++;
				}
				else if(total == 7) {
					seven++;
				}
				else if(total == 8) {
					eight++;
				}
				else if(total == 9) {
					nine++;
				}
				else if(total == 10) {
					ten++;
				}
				else if(total == 11) {
					eleven++;
				}
				else {
					twelve++;
				}
			i++;
					}
		System.out.println("You rolled 2 " + two + " out of " + input+ " times!");
		System.out.println("You rolled 3 " + third + " out of " + input+ " times!");
		System.out.println("You rolled 4 " + four + " out of " + input+ " times!");
		System.out.println("You rolled 5 " + five + " out of " + input+ " times!");
		System.out.println("You rolled 6 " + six + " out of " + input+ " times!");
		System.out.println("You rolled 7 " + seven + " out of " + input+ " times!");
		System.out.println("You rolled 8 " + eight + " out of " + input+ " times!");
		System.out.println("You rolled 9 " + nine + " out of " + input+ " times!");
		System.out.println("You rolled 10 " + ten + " out of " + input+ " times!");
		System.out.println("You rolled 11 " + eleven + " out of " + input+ " times!");
		System.out.println("You rolled 12 " + twelve + " out of " + input+ " times!");
		
		
	}

}
