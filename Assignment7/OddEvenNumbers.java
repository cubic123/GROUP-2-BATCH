 //Meen_khatri_Assignment7_q2  
import java.util.Scanner;
     
    class OddEvenNumbers
    {
       public static void main(String args[])
       {
          int i;
          System.out.println("Please enter your number");
          Scanner s = new Scanner(System.in);
          i = s.nextInt();
         
          if (i % 2 == 0)
             System.out.println("The number is even.");
          else
             System.out.println("The number is odd.");
       }
    }
