
import java.util.*;

public class Rates
{

public static void main(String[] args)
{
double rateResult;

int age = 35;
String gender = "m";
rateResult = calcRateClass(age, gender); 

}


public static double calcRateClass(int age, String gender)
{
   double bestRate = 40.0;
   double bestWeek = 200.0;
   double riskOne = bestRate + 10.0;
   double riskWeek = bestWeek + 55.0;
   double day = 0;
   double week = 0;
   double tooYoung = 0;
   if(gender == "m")
   {
      if (age <= 65 && age >= 33)
      {
         day = bestRate;
         week = bestWeek;
      }
      else if (age >= 25 && age <= 29)
         {
         day = riskOne + 7.0;
         week = riskWeek + 30.0;
         }
      else if (age >= 66)
         {
         day = bestRate + ((age - 65) * 2.0);
         week = bestWeek + ((age - 65) * 5.0);
         }
         return day;
         //return week;
//       else
//       {
//       return tooYoung;
//       }
}
else
   return tooYoung;
}
//end of method

}


 