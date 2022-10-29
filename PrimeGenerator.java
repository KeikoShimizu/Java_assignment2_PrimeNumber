public class PrimeGenerator 
{
  static int nextPrimeNumber = 1; // Global Variable 

  //if the parameter is prime, return true. Or if not, return false
  static boolean isPrime(int n) 
  { 
    for (int i = 2; i <= n / 2; i++ ) 
    {
      if( n % i == 0 )
      {
        return false;
      }
    }
    return true;
  }
  //Check out whether the parameter is Prime or not. Loop until finding out the next prime number 
  static int nextPrime() 
  { 
    int n = PrimeGenerator.nextPrimeNumber + 1;
    if (n == 2){                             //Execept of for loop of the isPrime method, 
        PrimeGenerator.nextPrimeNumber ++;
        return n;
    }
    else                              
    {
      while (isPrime(n) == false) // Loop unting find out the next prime number 
      {
        n++;
      }
      PrimeGenerator.nextPrimeNumber = n; // To store the biggest prime number that found from isPrime method
      return n;
    }
  }
}
