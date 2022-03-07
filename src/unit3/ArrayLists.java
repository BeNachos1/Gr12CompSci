package unit3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Ben Bere
//March 1 2022
//Experimenting with ArrayLists 
public class ArrayLists {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Book> books = new ArrayList<Book>();

		File file = new File("books_list.txt");
		Scanner input = new Scanner(file);

		// reads New York Times Hard cover fiction best sellers from file books_list
		System.out.println("New York Times Best Selling Hard Cover Fiction");
		System.out.printf("Book Name\t\t      Author\t\tRelease Date\n");
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			String[] data = line.split(",");
			books.add(new Book(data[0],data[1],data[2]));
		}
		System.out.println(listBooks());
		

		input.close();
	}
	public static listBooks(ArrayList<Book> books) {
		for (int i = 0; i<books.size(); i++) {
			Book b = books.get(i);
			System.out.printf("%-30s%s\t%s\t\n", b.title, b.author, b.date);
		}
		
		
	}
}
