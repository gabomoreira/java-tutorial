import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Rose are red \nViolets are blue");
			writer.append("\n(A poem by gabo)");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
