package main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton exitButton = new JButton("Close");
	
	
	
	NewWindow(){
		JLabel label = new JLabel();
		label.setBounds(0,0,100,50);
		label.setFont(new Font(null,Font.PLAIN,25));
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	NewWindow(double amount, boolean tag, double total){
		
		if(tag==false) {
		JLabel label = new JLabel("$" + String.format("%.2f",amount) + " withdrawn");
		label.setBounds(100,40,500,50);
		label.setFont(new Font(null,Font.PLAIN,18));
		JLabel newTotal = new JLabel("New balance: $" + String.format("%.2f", total));
		newTotal.setBounds(100,100,500,50);
		newTotal.setFont(new Font(null,Font.BOLD,20));
		
		frame.add(newTotal);
		
		frame.add(label);}
		
		if(tag==true) {
			JLabel label = new JLabel("$" + String.format("%.2f", amount) + " deposited");
			label.setBounds(100,40,500,50);
			label.setFont(new Font(null,Font.PLAIN,18));
			JLabel newTotal = new JLabel("New balance: $" + String.format("%.2f", total));
			newTotal.setBounds(100,100,500,50);
			newTotal.setFont(new Font(null,Font.BOLD,20));
			frame.add(newTotal);
			frame.add(label);
		}
		
		exitButton.setBounds(100,200,200,40);
		exitButton.setFocusable(false);
		exitButton.addActionListener(this);
		
		frame.add(exitButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==exitButton) {
			System.exit(0);
		}
	}


}
