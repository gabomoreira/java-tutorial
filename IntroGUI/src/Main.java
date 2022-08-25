import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// JOptionPane.ShowInputDialog() => receive a String and return a String
		// JOptionPane.showMessageDialog() => return a message
		// Integer.parseInt() => convert to int
		// Double.perseDouble() => convert to double
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age"));
		JOptionPane.showMessageDialog(null,"You are "+ age + " years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are " + height + "cm tall");
	}

}
