package basicjava;

import java.io.*;
import java.util.Scanner;

public class FileExercises{
	
	public static int counting(String matchString) throws FileNotFoundException, IOException {
		int count = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
			String line = reader.readLine();
			while (line != null) {
				String[] lineS = line.split(" ");
				for(String s : lineS) {
					if(s.equalsIgnoreCase(matchString)) {
						count++;
					}
				}
				line = reader.readLine();
			}
			reader.close();
			return count;

		}
		catch(FileNotFoundException e) {
			throw new FileNotFoundException();
		}
		catch(IOException e) {
			throw new IOException();
		}
	}
	public static void toUpper(String fInput, String fOutput) throws IOException {
		try {
			Scanner reader = new Scanner(new File(fInput));
		    PrintWriter writer = new PrintWriter( new BufferedWriter( new FileWriter(fOutput)));
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				String oLine = line.toUpperCase();
				writer.println(oLine);		
			}
			writer.close();
			reader.close();

		}
		catch(IOException e) {
			throw new IOException();
		}
		
	}
}
