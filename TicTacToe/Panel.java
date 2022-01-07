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
		turn();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0;i<9;i++) {
			if(e.getSource()==buttons[i]) {
				if(turnPlayer1) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(Color.black);
						buttons[i].setText("x");
						turnPlayer1=false;
						textField.setText("Turn O");
						check();
					}
				}else {
				if(turnPlayer1==false) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(Color.black);
						buttons[i].setText("o");
						turnPlayer1=true;
						textField.setText("Turn X");
						check();
						}
					}
				}
			}
		}
	}
	public void turn() {
		if(random.nextInt(2)==0) {
			turnPlayer1=true;
			textField.setText("Turn X");
		}else {
			turnPlayer1=false;
			textField.setText("Turn O");
			}
	}
	public void check() {
		if(buttons[0].getText()=="x"
		   &&buttons[1].getText()=="x"
		   &&buttons[2].getText()=="x") {
				winnerX(0, 1, 2);
		}
		if(buttons[3].getText()=="x"
			&&buttons[4].getText()=="x"
			&&buttons[5].getText()=="x") {
				winnerX(3, 4, 5);
		}
		if(buttons[6].getText()=="x"
			&&buttons[7].getText()=="x"
			&&buttons[8].getText()=="x") {
				winnerX(6, 7, 8);
		}
		if(buttons[0].getText()=="x"
			&&buttons[3].getText()=="x"
			&&buttons[6].getText()=="x") {
				winnerX(0, 3, 6);
		}
		if(buttons[1].getText()=="x"
			&&buttons[4].getText()=="x"
			&&buttons[7].getText()=="x") {
				winnerX(1, 4, 7);
		}
		if(buttons[2].getText()=="x"
			&&buttons[5].getText()=="x"
			&&buttons[8].getText()=="x") {
				winnerX(2, 5, 8);
		}
		if(buttons[0].getText()=="x"
			&&buttons[4].getText()=="x"
			&&buttons[8].getText()=="x") {
				winnerX(0, 4, 8);
		}
		if(buttons[2].getText()=="x"
			&&buttons[4].getText()=="x"
			&&buttons[6].getText()=="x") {
				winnerX(2, 4, 6);
		}
		if(buttons[0].getText()=="o"
			&&buttons[1].getText()=="o"
			&&buttons[2].getText()=="o") {
				winnerO(0, 1, 2);;
		}
		if(buttons[3].getText()=="o"
			&&buttons[4].getText()=="o"
			&&buttons[5].getText()=="o") {
				winnerO(3, 4, 5);
		}
		if(buttons[6].getText()=="o"
			&&buttons[7].getText()=="o"
			&&buttons[8].getText()=="o") {
				winnerO(6, 7, 8);
		}
		if(buttons[0].getText()=="o"
			&&buttons[3].getText()=="o"
			&&buttons[6].getText()=="o") {
				winnerO(0, 3, 6);
		}
		if(buttons[1].getText()=="o"
			&&buttons[4].getText()=="o"
			&&buttons[7].getText()=="o") {
				winnerO(1, 4, 7);
		}
		if(buttons[2].getText()=="o"
			&&buttons[5].getText()=="o"
			&&buttons[8].getText()=="o") {
				winnerO(2, 5, 8);
		}
		if(buttons[0].getText()=="o"
			&&buttons[4].getText()=="o"
			&&buttons[8].getText()=="o") {
				winnerO(0, 4, 8);
		}
		if(buttons[2].getText()=="o"
			&&buttons[4].getText()=="o"
			&&buttons[6].getText()=="o") {
				winnerO(2, 4, 6);
		}
	}
	public void winnerX(int a,int b, int c) {
		textField.setText("Winner X");
		buttons[a].setBackground(Color.green);
		buttons[b].setBackground(Color.green);
		buttons[c].setBackground(Color.green);
		for(int i = 0;i<9;i++) {
			buttons[i].setEnabled(false);		
			}		
	}
	public void winnerO(int a,int b, int c) {
		buttons[a].setBackground(Color.green);
		buttons[b].setBackground(Color.green);
		buttons[c].setBackground(Color.green);
		for(int i = 0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textField.setText("Winner O");
		}
}
