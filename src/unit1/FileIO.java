//Ben Bere
//Feb 24 2022
//Testing IO
package unit1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {

		
		//reading and printing using scanner
		try {
			File file = new File("words_alpha.txt");
			Scanner input = new Scanner(file);
			for (int i=0; i < 15; i++) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		}
		catch (FileNotFoundException ex) {
			System.out.println(ex.toString());

		}
		System.out.println();
		//reading and printing using BufferedReader
		try {
			File file = new File("words_alpha.txt");
			BufferedReader brIn = new BufferedReader(new FileReader (file));
			for (int i =0; i<15; i++) {
				String line = brIn.readLine();
				System.out.println(line);
			}
			brIn.close();
		}
		catch (IOException ex){
			System.out.println(ex.toString());
			
		}
	}

}
