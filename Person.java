/**
   This class represents a person with a name.
*/
public class Person implements Comparable<Person>
{
   private String name;

   /**
      Constructs a person object
      @param name the person's name
   */
   public Person(String name)
   {
      this.name = name;
   }

   /**
      Gets the person's name
      @return the name
   */
   public String getName()
   {
      return this.name;
   }

   /**
      returns a string describing this object
      @return a string describing this object
   */
   public String toString()
   {
      return "Name: " + this.getName();
   }

   /**
      Compares person objects.
      @param other Other person against which to compare
      @return < 0 if this person comes before, 0 if equal,
      			> 0 if this person comes after
   */
   public int compareTo(Person other)
   {
      return this.getName().compareTo(other.getName());
   }
}

