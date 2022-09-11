package rae70_assignment1;

import javax.swing.JOptionPane;

public class Lab2_Problem3 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Enter amount");//user input
		
		int num = Integer.parseInt(a);//change the string into an integer
		
		//Calculate each of the values 
		int grands = num/1000;
		int benj = (num/100)%10;
		int saw = (num /10)%10; 
		int bucks = num%10;
		
		//print out each of the values/ print a new line after
		JOptionPane.showMessageDialog(null, "Grands: " + grands + '\n' + "Benjamins: " + benj + '\n' + "Sawbucks: " + saw + '\n' + "Bucks: " + bucks);
		
		
	}

}
