package streamInterviewQA.numeric;

import java.util.*;
import java.io.*;


class Main {

  static int sizeOfFile;
  static int i = 0;
  static List<Directory> listOfDirectory = new ArrayList<>();

	/*
	 * public static String foo() {
	 * 
	 * // sizeOfFile += listOfDirectory.get(i).stream().map(File::size).reduce(0,
	 * Intger::add); // listOfDirectory.foo();
	 * 
	 * return param; }
	 */
  public static void main (String[] args) {
    
    
    for(Directory d : listOfDirectory)
    {
      //d.foo();

    }       

  }

}

class Directory{
  private Integer id;
  private List<File> files;
  private List<Directory> directory;
  

}

class File{
  private Integer id;
  private String fileName;
  private int size;


}