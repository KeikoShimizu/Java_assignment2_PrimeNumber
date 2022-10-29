import java.util.*;

class PrimePrinter {
  public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
    int n = 1;
    PrimeGenerator generator = new PrimeGenerator();
    while( n != 0 )     // Loop until the inputed parameter is 0
        {
        System.out.print("Enter an integer: ");
        n = input.nextInt();
        while (true)
        {
            int checkPrime = generator.nextPrime();
            if(n < checkPrime)          // Compare input num and returned prime number,
            {                           // if returned prime number is bigger than input number,  
                break;                  // escape the while loop.
            } 
            else if(checkPrime == 2)    //if prime is 2, print the number without ","
            {
                System.out.print(checkPrime);
            }
            else                        //print the number without ","
            {
                System.out.print("," + checkPrime);
            }
        }
        generator.nextPrimeNumber = 1;  // Reset the global variable of Prime number
        System.out.println();
    }
  }
}