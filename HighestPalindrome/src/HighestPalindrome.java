import java.util.ArrayList;
import java.util.Collections;



public class HighestPalindrome {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> products = new ArrayList<Integer>();
		
		int highest = 0;
		boolean found = false;
		
		int n = 999;
		int m = 999;

			
		while (n > 0 && m > 0){
				
			while (m > 0){
					
				products.add(n*m);
				m--;
					
			}
				
			n--;
			m = n;
				
		}
		
		System.out.println("ArrayList is finishing" + products.size());
		
		Collections.sort(products);
		
		System.out.println("ArrayList is sorting");
		
		int counter = products.size()-1;
		
		while (found == false && counter > 0){
			
			if (isPallindrome(products.get(counter))){
				
				highest = products.get(counter);
				found = true;
				
			}else{
				
				counter--;
				
			}
			
		}
		
		if (highest != 0){
			
			System.out.println("The Highest Pallindrome is " + highest);
				
		}else{
			
			System.out.println("No Pallindrome found");
			
		}
		
	}
	
	public static boolean isPallindrome(int num){
		
		char[] nums = Integer.toString(num).toCharArray();
		
		boolean check = true;
		
		//if((nums.length%2) == 0){
			int start = 0;
			int end = nums.length - 1;
			
			while (start < end && check == true ){
				
				if (nums[start] != nums[end]){
					
					check = false;
					
				}else{
					
					start++;
					end--;
					
				}
				
			}
			
		return check;
			
		//}
		
	}

}