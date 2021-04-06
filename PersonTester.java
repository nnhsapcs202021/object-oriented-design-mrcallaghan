import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
   Test class for Comparable Person objects.
*/
public class PersonTester
{
   public static void main(String [] args)
   {
      ArrayList<Person> people = new ArrayList<Person>();
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter 10 names: ");
      for (int i = 0; i < 10 && scanner.hasNext(); i++)
      {
         people.add(new Person(scanner.next()));
      }
      
      // Collections.sort can only sort objects that are Comparable
      Collections.sort( people );

      System.out.println( "First: " + people.get(0));
      System.out.println( "Last: " + people.get(people.size()-1));
      
      for(Person p : people)
      {
          System.out.println(p);
      }
   }
}
