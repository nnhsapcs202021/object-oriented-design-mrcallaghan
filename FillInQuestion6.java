import java.util.Scanner;

/**
 * A FillInQuestion is constructed with a string that contains the answer surrounded by '_'.
 *      For example, "The inventor of Java is _James Gosling_." The question should be displayed
 *      as: The inventor of Java is _____.
 *
 * @author mcallaghan
 * @version 15mar2021
 */

/*
 * The FillInQuestion class extends (i.e., is a subclass of) the Question class.
 */
public class FillInQuestion6 extends Question
{
   /*
    * Do not declare instance variables for text and answer! The text and answer instance variables
     *      are inherited from the Question class!
    */
   
   
   /**
     * This method overrides the setText method in the Question class.
     * 
     *  Sets the question text and the answer.
     *  
     *  @param questionText the text of the question including the answer
     */
   /*
    * Use the @Override annotation when overriding a method to help the compiler verify that
     *      you in fact overriding and not overloading by mistake.
    */
   @Override
   public void setText(String questionText)
   {
       Scanner parser = new Scanner(questionText);
       parser.useDelimiter("_");
       String question = parser.next();     // "The inventor of Java is "
       String answer = parser.next();       // "James Gosling"
       question += "_____________" + parser.next(); // "_________."
       
       /*
        * The inherited instance variables are private; they cannot be directly accessed. We must use
         *      the mutator and accessor methods.
        */
       //this.text = question;
       //this.answer = answer;
       
       
   }
   
   
   
   
   
   
   
}
