package rae70_MenuManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
public class MenuManagerGUI {
	private JFrame mainWindow;
	private JFrame secWindow;

	private JLabel label;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;

	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;


	private JComboBox<Entree> box1;
	private JComboBox<Side> box2;
	private JComboBox<Salad> box3;
	private JComboBox<Dessert> box4;

	private JTextField cal;
	private JTextField price;

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;


	private JTextArea text2;
	private JTextArea text3;
	private JTextArea text4;
	private JTextArea text5;

	private JList<Menu> selectedMenuList;
	private DefaultListModel<Menu> dlm;


	private MenuManager men1;


	public MenuManagerGUI(){
		men1 = new MenuManager("data/dishes.txt");

		buildMainWindow();
		//call the method to build first window

	}
	private void buildMainWindow(){

		ArrayList<Menu>menus = new ArrayList<Menu>();

		mainWindow = new JFrame("Menu Manager");
		mainWindow.setBounds(20, 20, 600, 500);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.getContentPane().setLayout(null);

		//labels- entree,side,salad,dessert
		label = new JLabel("Entree");
		label.setBounds(20, 20, 150, 30);
		mainWindow.getContentPane().add(label);

		label2 = new JLabel("Side");
		label2.setBounds(20, 60, 150, 30);
		mainWindow.getContentPane().add(label2);

		label3 = new JLabel("Salad");
		label3.setBounds(20, 100, 150, 30);
		mainWindow.getContentPane().add(label3);

		label4 = new JLabel("Dessert");
		label4.setBounds(20, 140, 150, 30);
		mainWindow.getContentPane().add(label4);

		box1 = new JComboBox( men1.getEntrees().toArray());
		box1.setBounds(100,20,150,30);
		mainWindow.getContentPane().add(box1);

		box2 = new JComboBox( men1.getSides().toArray());
		box2.setBounds(100,60,150,30);
		mainWindow.getContentPane().add(box2);

		box3 = new JComboBox( men1.getSalads().toArray());
		box3.setBounds(100,100,150,30);
		mainWindow.getContentPane().add(box3);

		box4 = new JComboBox(men1.getDesserts().toArray());
		box4.setBounds(100,140,150,30);
		mainWindow.getContentPane().add(box4);
		//add the lists to jcomboboxes 

		//generate menu
		button1 = new JButton("Generate New Menu");
		button1.setBounds(50, 190, 200, 30);
		mainWindow.getContentPane().add(button1);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("Name for Menu?");
				Menu menu1 = new Menu(input, (Entree) box1.getSelectedItem(), (Side)box2.getSelectedItem(),(Salad)box3.getSelectedItem(),(Dessert)box4.getSelectedItem());
				dlm.add(0, menu1);
				menus.add(menu1);
				//geneated menu with chosen items

			}
		});
		//min cal
		button2 = new JButton("Min Cal");
		button2.setBounds(50, 350, 200, 30);
		mainWindow.getContentPane().add(button2);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//	Menu menu1 = new Menu(null, null, null, null, null);
			}
		});
		//max cal
		button3 = new JButton("Max Cal");
		button3.setBounds(50, 400, 200, 30);
		mainWindow.getContentPane().add(button3);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String input = JOptionPane.showInputDialog("Name for Menu?");
				//Menu menu1 = new Menu(input, null, null, null, null);
			}
		});
		//details
		button4 = new JButton("Details");
		button4.setBounds(300, 400, 100, 30);
		mainWindow.getContentPane().add(button4);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buildSecWindow();
			}
		});
		//delete
		button5 = new JButton("Delete");
		button5.setBounds(400, 400, 100, 30);
		mainWindow.getContentPane().add(button5);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.clear();

			}
		});
		//txt to file
		button6 = new JButton("Save to File");
		button6.setBounds(500, 400, 100, 30);
		mainWindow.getContentPane().add(button6);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FileManager.writeToFile("data/menu.txt",menus );



			}
		});
		//generate a random menu
		button7 = new JButton("Random Menu");
		button7.setBounds(50, 300, 200, 30);
		mainWindow.getContentPane().add(button7);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input2 = JOptionPane.showInputDialog("Name for Menu?");
				Menu menu2 = men1.randomMenu(input2);
				dlm.add(0, menu2);
				menus.add(menu2);
				//generate random menu

			}
		});


		// text = new JTextArea();
		// text.setBounds(300, 20, 290, 350);
		dlm = new DefaultListModel<Menu>();
		selectedMenuList = new JList<Menu>(dlm);
		selectedMenuList.setBounds(300, 20, 290, 350);
		mainWindow.getContentPane().add(selectedMenuList);
		System.out.print(selectedMenuList.getName());


		mainWindow.setVisible(true);
		// secWindow.setVisible(true);
	}
	private void buildSecWindow(){
		//frame
		secWindow = new JFrame("Menu:" + selectedMenuList.getSelectedValue());
		secWindow.setBounds(20, 20, 1000, 450);
		secWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		secWindow.getContentPane().setLayout(null);

		//labels
		label5 = new JLabel("Entrees");
		label5.setBounds(20, 20, 150, 30);
		secWindow.getContentPane().add(label5);
		label6 = new JLabel("Side");
		label6.setBounds(20, 80, 150, 30);
		secWindow.getContentPane().add(label6);
		label7 = new JLabel("Salad");
		label7.setBounds(20, 140, 150, 30);
		secWindow.getContentPane().add(label7);
		label8 = new JLabel("Dessert");
		label8.setBounds(20, 200, 150, 30);
		secWindow.getContentPane().add(label8);
		label9 = new JLabel("Total Calories");
		label9.setBounds(20, 260, 150, 30);
		secWindow.getContentPane().add(label9);
		label10 = new JLabel("Total Price");
		label10.setBounds(20, 320, 150, 30);
		secWindow.getContentPane().add(label10);

		//text area for details window 



		text2 = new JTextArea(selectedMenuList.getSelectedValue().entree.getDescription()+"\n"+"Calories:"+ selectedMenuList.getSelectedValue().entree.getCalories()+" "+ "Price:"+selectedMenuList.getSelectedValue().entree.getPrice());
		text2.setBounds(130, 30, 850, 50);
		secWindow.getContentPane().add(text2);
		text3 = new JTextArea(selectedMenuList.getSelectedValue().side.getDescription()+"\n"+"Calories:"+ selectedMenuList.getSelectedValue().side.getCalories()+" "+ "Price:"+selectedMenuList.getSelectedValue().side.getPrice());
		text3.setBounds(130, 90, 850, 50);
		secWindow.getContentPane().add(text3);
		text4 = new JTextArea(selectedMenuList.getSelectedValue().salad.getDescription()+"\n"+"Calories:"+ selectedMenuList.getSelectedValue().salad.getCalories()+" "+ "Price:"+selectedMenuList.getSelectedValue().salad.getPrice());
		text4.setBounds(130, 150, 850, 50);
		secWindow.getContentPane().add(text4);
		text5 = new JTextArea(selectedMenuList.getSelectedValue().dessert.getDescription()+"\n"+"Calories:"+ selectedMenuList.getSelectedValue().dessert.getCalories()+" "+ "Price:"+selectedMenuList.getSelectedValue().dessert.getPrice());
		text5.setBounds(130, 210, 850, 50);
		secWindow.getContentPane().add(text5);

		cal = new JTextField(selectedMenuList.getSelectedValue().totalCalories());
		cal.setBounds(127, 280, 150, 50);
		secWindow.getContentPane().add(cal);
		price = new JTextField(selectedMenuList.getSelectedValue().totalPrice());
		price.setBounds(127, 340, 150, 50);
		secWindow.getContentPane().add(price);



		text2.setEditable(false);
		text3.setEditable(false);
		text4.setEditable(false);
		text5.setEditable(false);
		cal.setEditable(false);
		price.setEditable(false);


		secWindow.setVisible(true);
	}

	public static void main(String[] args) {
		MenuManagerGUI menugui = new MenuManagerGUI();




	}
}
