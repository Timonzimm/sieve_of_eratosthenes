import java.util.Arrays;

public class Sieve {

	public static void main(String[] args) {
		boolean[] primes = getPrimes(47);
		for(int i = 0; i < primes.length; i++)
		{
			if(primes[i])
			{
				System.out.println(i);
			}
		}
	}
	
	
	public static boolean[] getPrimes(int max)
	{
		// Sieve of Eratosthenes
		boolean[] numbers = new boolean[max+1];
		Arrays.fill(numbers, Boolean.TRUE);
		numbers[0] = false;
		numbers[1] = false;
		
		for(int i = 0; i < numbers.length; i++)
		{
			//Set all multiple of current i to false, if i is a prime
			if(numbers[i])
			{
				for(int j = 2*i; j < numbers.length; j+=i)
				{
					numbers[j] = false;
				}
			}
		}

		return numbers;
	}
}
