package rae70_lab4;
import javax.swing.JOptionPane;
public class LogCalc {

	public static void main(String[] args) {
		String inputlog = JOptionPane.showInputDialog("Enter value: ");
		int x = Integer.parseInt(inputlog);
		int i = 0;
		while(x < 0){
			 String input1 = JOptionPane.showInputDialog("Enter value: ");
			 x = Integer.parseInt(input1);
			 }
		String inputbase = JOptionPane.showInputDialog("Enter base: ");
		int base = Integer.parseInt(inputbase);
		while(base < 1) {
			String input2 = JOptionPane.showInputDialog("Enter base: ");
			base = Integer.parseInt(input2);
		
		}
		while(x >= base) {
			x = x / base;
			i++;
		}
		JOptionPane.showMessageDialog(null, i + " divisions");
	}
	

}
