import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		// JPanel => a GUI component that function as a container to hold others components
	
		ImageIcon icon = new ImageIcon("thumbup.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setForeground(new Color(0xffffff)); // set font color of text 
		label.setFont(new Font("MV Boli", Font.PLAIN, 50)); // set font of text 
		// label.setVerticalAlignment(JLabel.BOTTOM);
		// label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(100,100,75,75);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250);
		redPanel.setLayout(null);

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);
		bluePanel.setLayout(null);

		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250 );
		greenPanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(700,700);
		frame.setVisible(true);
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
	}

}
