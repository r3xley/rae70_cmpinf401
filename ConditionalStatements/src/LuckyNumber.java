import javax.swing.JOptionPane;

public class LuckyNumber {

	public static void main(String[] args) {
		String userinput = JOptionPane.showInputDialog("Please enter a number");
		
		int userInputInt = Integer.parseInt(userinput);
		
		if(userInputInt == 7) {
			System.out.println("Lucky number");
			
		}
		else {
			System.out.println("Pick another line");
		}
		
	}

}
