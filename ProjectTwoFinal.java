//Veronica Leal
import java.util.*;
public class ProjectTwoFinal
{
   public static void main (String[] args)
   { 
   //declare variables important 
   int trials = 0; //the amount of trials 
   int countHit= 0; //count every hit
   
   //do while loop, do this loop till we get a certain amount of trials
   do{
   
      //generate the random point, for x axis and y axis
      double x = Math.random();
      double y = Math.random();
      
      //distance formula   
      
      //this is the suggested 
      //formula (x^2 -x ) + ( y^2 -y) <= -0.25
      if ((x-0.5)*(x-0.5) + (y-0.5)*(y-0.5) <= 0.25 )
      {
         countHit++;
      }
    
    
      trials ++;
    
    }
    while (trials < 100000);
   
   //after a certain amount of trials you are gonn calculate the amount of sucessful hits/ trials 
   //it will give you the probability of hitting in the area
    double probability = (double)4.0 * countHit / trials;
    System.out.println("With " + trials + " trials the value of pi is estimated to be " + probability);
    
   }

}
