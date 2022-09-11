import javax.swing.JOptionPane;

public class LuckyNumber {

	public static void main(String[] args) {
		String userinput = JOptionPane.showInputDialog("Please enter a number");
		
		//if (richter >= 8.0);
		//{
			//description = "Most structures fall";
		//}
		//else
		//{
			
		//}
		if (richter >= 8.0)
		{
			description = "Most structures fall";
		}
		else if (richter >= 7.0)
		{
			description = "Many buildings destroyed";
		}
		else if (richter >= 6.0)
		{
			description = "Many buildings considerably damaged, some collapse";
		}
		else if (richter >= 4.5)
		{
			description = "Damage to poorly constructed buildings";
		}
		else
		{
			description = "No destruction of buildings";
		}
		
		System.out.print(description);

		
	}

}
