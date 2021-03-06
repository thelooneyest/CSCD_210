//  Rental rates assignment
//  Pre-set main for testing (see DEBUG constant)

//  Required methods to be added:  calcAge(...), calcRateClass(...) and displayResult(...)
//  Also, insert code into main as indicated.

import java.util.*;

public class RentalRates
{
   private static final boolean DEBUG = false; //set to true to run in debug
   
   private static final String BEST_RATE = "Best rate - $40.00 per day or $200.00 per week.";
   private static final String RISK_RATE_1= "Risk rate 1-$50.00 per day or $255.00 per week.";
   private static final String RISK_RATE_2= "Risk rate 2-$57.00 per day or $285.00 per week.";
   private static final String RISK_RATE_3= "Risk rate 3-$%4.2f per day or $%5.2f per week.";

   public static void main(String[] args)
   {    
      int curMonth = 0;
      int curDay = 0;
      int curYear = 0;
      int birthMonth = 0;
      int birthDay = 0;
      int birthYear = 0;
      String gender = "";
      int age = 0;
      String rateResult;
      int calcAge; //added by me			
   	
   	// Testing mode...	
      if (DEBUG == true)
      {
      	// Establish a 'current' date for testing...
         curMonth = 2;
         curDay = 1;
         curYear = 2016;
      	
         System.out.println("First test case: Renter is not old enough to rent...");
         birthMonth = 2;
         birthDay = 2;
         birthYear = 1991;
         gender = "m";
         age = calcAge(curMonth, curDay, curYear, birthMonth, birthDay, birthYear);
         rateResult = calcRateClass(age, gender);
         displayResults(gender, age, rateResult);
      	
         System.out.println("\nSecond test case: Renter is barely old enough (57/285)...");
         birthMonth = 2;
         birthDay = 1;
         birthYear = 1991;
         gender = "m";
         age = calcAge(curMonth, curDay, curYear, birthMonth, birthDay, birthYear);
         rateResult = calcRateClass(age, gender);
         displayResults(gender, age, rateResult);
      	
         System.out.println("\nThird test case: Renter is 35 and male (40/200)...");
         birthMonth = 1;
         birthDay = 1;
         birthYear = 1981;
         gender = "m";
         age = calcAge(curMonth, curDay, curYear, birthMonth, birthDay, birthYear);
         rateResult = calcRateClass(age, gender);
         displayResults(gender, age, rateResult);
      
         System.out.println("\nFourth test case: Renter is 35 and female (40/200)...");
         birthMonth = 1;
         birthDay = 1;
         birthYear = 1981;
         gender = "f";
         age = calcAge(curMonth, curDay, curYear, birthMonth, birthDay, birthYear);
         rateResult = calcRateClass(age, gender);
         displayResults(gender, age, rateResult);
      	
         System.out.println("\nFifth test case: Renter is 30 and male (57/285)...");
         birthMonth = 1;
         birthDay = 1;
         birthYear = 1986;
         gender = "m";
         age = calcAge(curMonth, curDay, curYear, birthMonth, birthDay, birthYear);
         rateResult = calcRateClass(age, gender);
         displayResults(gender, age, rateResult);
       	
         System.out.println("\nSixth test case: Renter is 30 and female (40/200)...");
         birthMonth = 1;
         birthDay = 1;
         birthYear = 1986;
         gender = "f";
         age = calcAge(curMonth, curDay, curYear, birthMonth, birthDay, birthYear);
         rateResult = calcRateClass(age, gender);
         displayResults(gender, age, rateResult);
      
         System.out.println("\nSeventh test case: Renter is 76 and male (62/255)...");
         birthMonth = 1;
         birthDay = 1;
         birthYear = 1940;
         gender = "m";
         age = calcAge(curMonth, curDay, curYear, birthMonth, birthDay, birthYear);
         rateResult = calcRateClass(age, gender);
         displayResults(gender, age, rateResult);        
      
         System.out.println("\nEighth test case: Renter is 76 and female (68/270)...");
         birthMonth = 1;
         birthDay = 1;
         birthYear = 1940;
         gender = "f";
         age = calcAge(curMonth, curDay, curYear, birthMonth, birthDay, birthYear);
         rateResult = calcRateClass(age, gender);
         displayResults(gender, age, rateResult);         
      }
      else
      {
         Scanner kb = new Scanner(System.in);
         System.out.println("Welcome to the car renter's rate finder.");
      
      // If you're not attempting the EC, get today's date from the user...
      //    Your code goes here...
      System.out.println("What is the current month? "); //ask for month
      curMonth = kb.nextInt();
      
      
      System.out.println("What is the current day? "); //ask for day
      curDay = kb.nextInt();
      
      
      System.out.println("What is the current year? "); //ask for year
      curYear = kb.nextInt();
      
      
      // If you are attempting the EC, use the Calendar class to get today's date...
      //    Your code goes here...
      
      // Get the gender...
      //    Your code goes here...
      System.out.println("What is your gender (m/f)? "); //ask for gender
      gender = kb.nextInt();
      
      // Get the date of birth...
      //    Your code goes here...
      
      System.out.println("What is your birth month? "); //ask for month
      birthMonth = kb.nextInt();
      
      
      System.out.println("What is your birth day? "); //ask for day
      birthDay = kb.nextInt();
      
      
      System.out.println("What is your birth year? "); //ask for year
      birthYear = kb.nextInt();
      
      // Get age... 
         age = calcAge(curMonth, curDay, curYear, birthMonth, birthDay, birthYear);
         
      // Get the rental rate...
         rateResult = calcRateClass(age, gender);
      	
      // Display the results...
         displayResults(gender, age, rateResult);
      }
   }
   
   //------start of calcAge Method
           public static int calcAge(int curMonth, int curDay, int curYear, int birthMonth, int birthDay, int birthYear)
        {
         int baseYear = (curYear - birthYear);
         
            if(curMonth - birthMonth < 0)
               baseYear = baseYear - 1;
            else if(curMonth == birthMonth && ((curDay - birthDay) < 0))
               baseYear = baseYear - 1;
            else
               baseYear = baseYear;

            return baseYear;
        }
     //------end of calcAge Method
     
}
   
