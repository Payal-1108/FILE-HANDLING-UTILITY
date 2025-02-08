import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {

	public static void main(String[] args)
	//WRITE A TEXT FILE
	{
		String[] names = {"John","Carl","Jerry"};
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Writing to a file.");
			writer.write("\nHere is another line.");
			
			for (String name : names) {
				writer.write("\n" + name);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//READ A TEXT FILE
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String line;
			try {
				while((line = reader.readLine())  != null) {
					System.out.println(line);
				}
				try {
					System.out.println(reader.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//MODIFY A TEXT FILE
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("This is modified file.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
