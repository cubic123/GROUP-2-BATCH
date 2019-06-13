//Meen_Khatri_Assignment7_3

public class PrimeNumbers {

    public static void main(String[] args) {

        int num = 17;
        boolean zerorem = false;
        for(int i = 2; i <= num/2; ++i)
        {
       
            if(num % i == 0) 
            {
                zerorem = true;
                break;
            }
        }

        if (!zerorem)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}