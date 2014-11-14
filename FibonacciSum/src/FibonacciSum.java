
public class FibonacciSum {

	
	public static void main(String[] args) {
		
		int curTerm = 0;
		int firstPre = 1;
		int secondPre = 0;
		int Total = 0;
		
		while (curTerm < 4000000){
			
			curTerm = firstPre + secondPre;
			
			if (curTerm%2==0){
				
				Total = Total + curTerm;
				
			}
			
			secondPre = firstPre;
			firstPre = curTerm;
			
		}
		
		System.out.println("Total sum is "+Total);
		

	}

}
