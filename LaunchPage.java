package main;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LaunchPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton withdrawalButton = new JButton("Withdrawal");
	JButton depositButton = new JButton("Deposit");
	String userInput;
	double balance;
	
	LaunchPage(){
		userInput = JOptionPane.showInputDialog(null, "Enter account balance: ");
		balance = Double.parseDouble(userInput);
		JLabel labelBalance = new JLabel("Balance: $" + String.format("%.2f",balance));
		labelBalance.setBounds(100,40,500,50);
		labelBalance.setFont(new Font(null,Font.BOLD,18));
		withdrawalButton.setBounds(100,150,200,40);
		withdrawalButton.setFocusable(false);
		withdrawalButton.addActionListener(this);
		
		depositButton.setBounds(100,200,200,40);
		depositButton.setFocusable(false);
		depositButton.addActionListener(this);
		
		frame.add(labelBalance);
		frame.add(withdrawalButton);
		frame.add(depositButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	LaunchPage(String balance){
		
		JLabel label = new JLabel("$" + balance);
		label.setBounds(100,40,500,50);
		label.setFont(new Font(null,Font.BOLD,18));
		frame.add(label);
		
		withdrawalButton.setBounds(100,150,200,40);
		withdrawalButton.setFocusable(false);
		withdrawalButton.addActionListener(this);
		
		depositButton.setBounds(100,200,200,40);
		depositButton.setFocusable(false);
		depositButton.addActionListener(this);
		
		frame.add(withdrawalButton);
		frame.add(depositButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==withdrawalButton) { 
			frame.dispose();
			String user_Input = JOptionPane.showInputDialog(null, "Enter amount to withdrawal: ");
			double amount = Double.parseDouble(user_Input);	
			balance = balance - amount;
			NewWindow myWindow = new NewWindow(amount, false, balance);
		}
		
		if(e.getSource()==depositButton) {
			frame.dispose();
			String user_Input = JOptionPane.showInputDialog(null, "Enter amount to deposit: ");
			double amount = Double.parseDouble(user_Input);	
			balance = balance + amount;
			NewWindow myWindow = new NewWindow(amount, true, balance);
		}
		
	}
	
	

}
