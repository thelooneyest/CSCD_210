
import java.util.*;

public class RatesTwo
{

public static void main(String[] args)
{
String rateResult;

int age = 65;
String gender = "f";
rateResult = calcRateClass(age, gender); 

System.out.println(rateResult);
}


public static String calcRateClass(int age, String gender)
{
   String guestRate = "";
   // String bestWeek = "Best week";
  // String riskOne;
   //String riskWeek = "Risk One Week";
//    double day = 0;
//    double week = 0;
   //String tooYoung = "Too young";
   if(gender == "m")
   {
      if (age <= 65 && age >= 33)
      {
         guestRate = "Best rate";
      }
      else if (age >= 25 && age <= 32)
         {
         guestRate = "Risk rate two";
         }
      else if (age >= 66)
         {
         guestRate = "Risk rate three";
         }
         else
         {
            guestRate = "too young";
         }
         
     }    
  if(gender == "f")
   {
      if (age >= 30 && age <= 62)
      {
         guestRate = "Best rate";
      }
      else if (age >= 25 && age <= 29)
         {
         guestRate = "Risk rate one";
         }
      else if (age >= 63)
         {
         guestRate = "Risk rate three";
         }
         else
         {
            guestRate = "too young";
         }
         
}
return guestRate;
}
//end of method

}


 