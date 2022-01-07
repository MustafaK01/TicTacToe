package TicTacToe;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel implements ActionListener{
	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel titleOfPanel = new JPanel();
	JPanel buttonOfPanel = new JPanel();
	JLabel textField = new JLabel();
	JButton[] buttons = new JButton[9];
	boolean turnPlayer1;
	
	public Panel() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.getContentPane().setBackground(Color.darkGray);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setTitle("TicTacToe");
		frame.add(titleOfPanel,BorderLayout.NORTH);
		frame.add(buttonOfPanel);
		
		textField.setBackground(Color.black);
		textField.setForeground(Color.red);
		textField.setFont(new Font("Arial",Font.ITALIC,25));
		textField.setHorizontalAlignment(JLabel.CENTER);
		textField.setText("TicTacToe");
		textField.setOpaque(true);
		
		titleOfPanel.setLayout(new BorderLayout());
		titleOfPanel.setBounds(0,0,400,50);
		titleOfPanel.add(textField);
		
		buttonOfPanel.setLayout(new GridLayout(3,3));
		buttonOfPanel.setBackground(Color.gray);
		
		for(int i = 0;i<9;i++) {
			buttons[i]=new JButton();
			buttonOfPanel.add(buttons[i]);
			buttons[i].setFont(new Font("Arial",Font.BOLD,150));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void turn() {
	
	}
	public void check() {
		
	}
	public void winnerX(int a,int b, int c) {
		
	}
	public void winnerY(int a,int b, int c) {
		
	}

}
