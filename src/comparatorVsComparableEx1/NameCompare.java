package comparatorVsComparableEx1;

import java.util.Comparator;

// Class to compare Movies by name
class NameCompare implements Comparator<Movie2>
{
    public int compare(Movie2 m1, Movie2 m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}