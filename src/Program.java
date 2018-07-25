import java.util.Scanner;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.KeyEvent;

public class Program  {
	public static Scrambler scram = new Scrambler();
	
	
	public static void main(String[] args) {
		
		//creates a window and a text field to listen for key presses
		//TO-DO: Make it where the doesn't need a text field to listen for keys
		//or change the look of the text field
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JTextField field = new JTextField(20);
		
		panel.add(field);
		panel.addKeyListener(new KeyPressed());
		frame.getContentPane().add(panel);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		//Cube Scrambler
		//prints out the scramble once started
		scram.scramble();
	}
	
}
