
public class SumSquareDiff {

	
	public static void main(String[] args) {
		
		int n = 100;
		int diff = 0;
		
		diff = sumSquared(n) - squaresSum(n);
		
		System.out.println("The difference is " + diff);
		
	}
	
	public static int sumSquared (int num){
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++){
			
			sum += i;
			
		}
		
		return sum * sum;
		
	}
	
	public static int squaresSum (int num){
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++){
			
			sum += i * i;
			
		}
		
		return sum;
	
	}

}
