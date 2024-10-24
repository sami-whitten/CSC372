package main_cta3;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.util.*;

public class frame_cta3 extends JFrame implements ActionListener {
	
	//declare items
	JTextField textBox = new JTextField("Enter text here", 20);
	JMenuBar menuBar;
	JMenu optionMenu;
	JMenuItem showDateItem;
	JMenuItem addTextItem;
	JMenuItem changeColorItem;
	JMenuItem exitItem;
	JPanel panel;
	
	
	frame_cta3(){
		//setup frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		//create panel
		panel = new JPanel();		
		//create menu bar and option menu
		menuBar = new JMenuBar();
		optionMenu = new JMenu("Options");		
		//create option menu items
		showDateItem = new JMenuItem("Show Date & Time");
		addTextItem = new JMenuItem("Add text...");
		changeColorItem = new JMenuItem("Change background color");
		exitItem = new JMenuItem("Exit");
		
		//add action listener to menu items
		showDateItem.addActionListener(this);
		addTextItem.addActionListener(this);
		changeColorItem.addActionListener(this);
		exitItem.addActionListener(this);
		//add items to option menu
		optionMenu.add(showDateItem);
		optionMenu.add(addTextItem);
		optionMenu.add(changeColorItem);
		optionMenu.add(exitItem);
		//add option menu to menu bar
		menuBar.add(optionMenu);
		//add textbox to panel
		panel.add(textBox);
		//add panel to frame
		this.add(panel);
		//add menu bar to frame
		this.setJMenuBar(menuBar);
		//make frame visible
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//if date option selected
		if (e.getSource()==showDateItem) {
			//obtain local date and time
			LocalDateTime currentDateTime = LocalDateTime.now();
			//convert to string and print to text box
			textBox.setText(currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));			
		}
		//if add text option selected
		if (e.getSource()==addTextItem) {
			try {
				//create file writer
				FileWriter writer = new FileWriter("C:\\Users\\samij\\eclipse-workspace1\\CSC372_CTA3_Option1\\textBox.txt");
				//write contents of text box to file
				writer.write(textBox.getText());
				writer.close();
				//print success message
				textBox.setText("Printed successfully!");
			} catch (IOException e1) {
				//print error message
				textBox.setText("Error!");
				e1.printStackTrace();
			}
		}
		//if change color option selected
		if (e.getSource()==changeColorItem) {
			Random random = new Random();
			//create variables for color
			float hue = random.nextFloat() * 360;
			float saturation = (float) 1.0;
			float brightness = (float) 0.3;
			//create color using variables
			Color myColor = Color.getHSBColor(hue, saturation, brightness);
			//print color details to text box
			textBox.setText("Color: " + myColor.toString());
			//change background color
			this.getContentPane().setBackground(myColor);
			
		}
		//if exit option selected
		if (e.getSource()==exitItem) {
			System.exit(0);
		}
		
	}
	
	

}
