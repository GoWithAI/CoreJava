package comparatorVsComparableEx1;

//A Java program to demonstrate Comparator interface
import java.io.*;
import java.util.*;

//A class 'Movie' that implements Comparable
class Movie2 implements Comparable<Movie2>
{
  private double rating;
  private String name;
  private int year;

  // Used to sort movies by year
  public int compareTo(Movie2 m)
  {
      return this.year - m.year;
  }

  // Constructor
  public Movie2(String nm, double rt, int yr)
  {
      this.name = nm;
      this.rating = rt;
      this.year = yr;
  }

  // Getter methods for accessing private data
  public double getRating() { return rating; }
  public String getName()   {  return name; }
  public int getYear()      {  return year;  }
}