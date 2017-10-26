/****************************************************************************
 *
 * Created on : 25 Oct. 2017
 * Created for : ICS3UR
 * Daily Assignment - Unit 3-05
 * This program displays a while loop program
 *
 ****************************************************************************/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class whileLoop 
{
  static double counter = 1;
  static double currentFactorialValue = 1;
  
  public static void main(String[] args)
  {  
       try
       {
            double userInput;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter an integer greater than 0 to calculate its factorial."); 
            userInput = Double.parseDouble(br.readLine());  
         
            if (userInput < 0)
            {
                 System.out.println("Please enter a non negative value");
                 userInput = Double.parseDouble(br.readLine());                
             }
         
            while (counter <= userInput)    
            { 
                 currentFactorialValue = counter * currentFactorialValue;      
                 counter = counter + 1;
             }  
             System.out.println("The factorial is: " + currentFactorialValue);            
        }
        catch(Exception nfe)
        {
             System.err.println("Invalid input!");
         }
     }
}

