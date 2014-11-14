import java.util.ArrayList;
import java.util.Scanner;


public class PrimeFactors {
	
	
	static ArrayList<Integer> Primes = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		long number = 0;
		
		System.out.print("Input number: ");
		number = in.nextLong();
		
		Factorise(number, Primes);
		
		System.out.println("The largest Prime factor is " + Primes.get(Primes.size()-1));
		
		

	}
	
	
	public static void Factorise(long num, ArrayList<Integer> Primes){
		
		int divisor = 2;
		
		while (num > 1){
			
			while (num % divisor == 0){
				
				Primes.add(divisor);
				num /= divisor;
				
			}
			
			if (divisor == 2) {
				
				divisor++;
				
			}else{
				
				divisor += 2;
				
			}
			
			
		}
			
		
	}

}
