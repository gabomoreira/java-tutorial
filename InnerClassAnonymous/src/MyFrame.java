import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	
	public MyFrame() {
		
		button1.setBounds(100, 100, 100, 100);
		button2.setBounds(200, 100, 100, 100);
		button3.setBounds(300, 100, 100, 100);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				System.out.println("You pressed button #1");
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You pressed button #2");
			}
		});
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You pressed button #3");
			}
		});
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}
	
}
