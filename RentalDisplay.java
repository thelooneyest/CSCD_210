
import java.util.*;

public class RentalDisplay
{

public static void main(String[] args)
{
   String gender = "f";
   int age = 75;
   String rateResult = "Risk rate three";
   String rate = displayResults(gender, age, rateResult);
   
   System.out.print(rate);
   
}
   
   public static String displayResults(String gender, int age, String rateResult)
   {
      if(gender == "m")
         gender = "male";
      else
         gender = "female";
         
      if(rateResult == "Best rate")
         rateResult = "Best rate - $40.00 per day or $200.00 per week";
      else if(rateResult == "Risk rate one")
         rateResult = "Risk rate 1 - Best rate plus $10.00 per day or best rate plus $55.00 per week";
      else if(rateResult == "Risk rate two")
         rateResult = "Risk rate 1 plus $7.00 per day or risk rate 1 plus $30.00 per week";
      else if(rateResult == "Risk rate three")
         if(gender == "male")
         rateResult = "Best rate plus $2.00 for each year over age 65 per day, or best rate plus $5.00 for each year over age 65";
         else
         rateResult = "Best rate plus $2.00 for each year over age 62 per day, or best rate plus $5.00 for each year over age 62";
      else
         rateResult = "Unidentified";
         
      String finalResult = (
                           "\nThank you." +
                           "\nThe " + gender + " renter is " + age + " years old." +
                           "\nThe rate class is: " + rateResult + "."
                           );
      
      return finalResult;
   }
   //end of method


}
// Find out why the 'String rateResult;' is a string. Maybe it's just a way to convert double to string for later use