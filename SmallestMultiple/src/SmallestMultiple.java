
public class SmallestMultiple {

	
	public static void main(String[] args) {
		
		int n = 22;
		long num = 0;
		int counter = 1;
		boolean found = false;
		
		while (!found){
			
			num = (long) n * counter;
			
			boolean check = true;
			
			while (check && n > 0){
				
				if (num%n == 0){
					
					n--;
					
				}else{
					
					check = false;
					
				}
				
				
			}
			
			if (n == 0){
				
				found = true;
				
			}else{
			
				counter++;
				n = 22;
				
			}
			
		}
		
		System.out.println("The highest number is " + num);
		

	}

}
