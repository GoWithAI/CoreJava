package exceptionCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// Checked Exception( Compile Time Checked) - Inherit Throwable
// must be handled at compilation time
// IOException, SQLException,  EndOfStreamException, FileNotFoundException, DirectoryNotFoundException
//Java IO API anticipated that attempting to access a file that does not exist would be a relatively common occurrence, so they created a checked exception to force a developer to deal with it.
public class CheckedExceptionEx {

	public void isFileNotFound() {

		try {
			FileInputStream file = new FileInputStream("newFile.txt"); // Checked Exception should be handled
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Handle below with try-catch block else will get compile time error
	public void fileReaderSample() {
		// FileReader fileReader = new FileReader("Test.txt");
		// System.out.println(fileReader.read());
		// fileReader.close();
	}

	private static void ioException() {
		Scanner scan = new Scanner("Hello World! Hello JavaTpoint.");
		System.out.println("" + scan.nextLine());
		System.out.println("Exception Output: " + scan.ioException()); // Check if there is an IO exception
		scan.close();
	}

	public static void main(String[] args) {
		ioException();

		CheckedExceptionEx f1 = new CheckedExceptionEx();
		f1.isFileNotFound();
	}
}
