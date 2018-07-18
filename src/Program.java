import java.util.Scanner;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.KeyEvent;

public class Program  {
	public static Scrambler scram = new Scrambler();
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField field = new JTextField(20);
		field.addKeyListener(new KeyPressed());
		panel.add(field);
		frame.getContentPane().add(panel);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		//KeyListener
		
		//Cube Scrambler
		scram.scramble();
		
		//Cube timer
		Timer timer = new Timer();
		
		
	}
	
}
