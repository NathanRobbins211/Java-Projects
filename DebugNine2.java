// Sorts an array of movies by name or year
import java.util.*;
public class DebugNine2
{
   public static void main(String[] args)
   {
      // Create variables
      Scanner input = new Scanner(System.in);
      Movie[] movies = new Movie[8];
      int i;
      String message, entry;
      movies[0] = new Movie("The Godfather", 1972);
      movies[1] = new Movie("The Good, the Bad, and the Ugly", 1966);
      movies[2] = new Movie("Pulp Fiction", 1994);
      movies[3] = new Movie("Shindler's List", 1993);
      movies[4] = new Movie("Casablanca", 1942);
      movies[5] = new Movie("Wizard of Oz", 1939);
      movies[6] = new Movie("Citizen Kane", 1941);
      movies[7] = new Movie("Some Like It Hot", 1959);

      // Ask user for input
      System.out.println( "Sort Movies by\n(N)ame, or (Y)ear");
      entry = input.next();

      // Pick a sort method, sort the array, then display (sorted) array
      if(entry.charAt(0) == 'Y')
      {
        yearSort(movies);
        message = "Sorted by Year\n";
      }
      else
      {
        nameSort(movies);
        message = "Sorted by Name\n";
      }   
      display(movies, message);
   }

    // Custom method to sort by YEAR
    public static void yearSort(Movie[] array)
    {
        int a, b;
        Movie temp;
        int highSub = array.length - 1;
        for (a = 0; a < highSub; ++a)
        {
           for (b = 0; b < highSub; ++b)
           if (array[b].getYear() > array[b + 1].getYear())
           {
              temp = array[b];
              array[b] = array[b + 1];
              array[b + 1] = temp;
           }
        }
     }

    // Custom method to sort by NAME
    public static void nameSort(Movie[] array)
    {
        int a, b;
        Movie temp;
        int highSub = array.length;
        for(a = 0; a < highSub; ++a)
        {
            for(b = 0; b < highSub; ++b)
            {
                String first = array[a].getName();
                String second = array[b].getName();

                // if first is less than second, then switch them
                // A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).
                if(first.compareTo(second) < 0)
                {
                    temp = array[b];
                    array[b] = array[a];
                    array[a] = temp;
                }
            }
        }
    }

     // Custom method to display array
    public static void display(Movie[] s,  String msg)
    {
        int len = s.length;
        for (int i = 0; i < len; i++)
           msg = msg + s[i].getName() + ", " + s[i].getYear() + "\n";
        System.out.println(msg);
    }
}
