package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] Args) {
		
		String[] lines = new String[] {"Good morning", "Good afternon", "Good night"};
		String path = "C:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //esse true acrescenta ao final do arquivo
			
			for(String line : lines) {
				bw.write(line); //não tem quebra de linha, para dar a quebra de linha usamos:
				bw.newLine();
			}
			
		}
		
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage() + ">> " + e.getStackTrace());
		}
			
	}	
}
		
	
