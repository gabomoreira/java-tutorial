import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
		for (int i = 1; i <= 52; i++) {
			deck.add(new JLabel(new ImageIcon("src\\cards\\"+i+".png")));
			frame.add(deck.get(i - 1));
		}
	}

}
