package rae70_assignment1;

import javax.swing.JOptionPane;

public class Lab2_Problem3 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Enter number");
		int num = Integer.parseInt(a);
		int grands = num/1000;
		int benj = (num/100)%10;
		int saw = (num /10)%10; 
		int bucks = num%10;
		JOptionPane.showMessageDialog(null, "Grands: " + grands + '\n' + "Benjamins: " + benj + '\n' + "Sawbucks: " + saw + '\n' + "Bucks: " + bucks);
		
		
		
		
		
		//JOptionPane.showMessageDialog(null, calc);
		
	}

}
