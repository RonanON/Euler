import java.util.ArrayList;


public class CalcMultiples {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int Sum=0;
		
		for (int i=1; i<1000; i++){
			
			if (i%3 == 0 || i%5 == 0){
				
				array.add(i);
				
			}
			
		}
		
		System.out.println(array);
		
		for (int j=0; j<array.size(); j++){
			
			Sum = Sum + array.get(j);
			
		}
		
		System.out.println(array.get(2));

		System.out.println("The sum of all multiples of 3 and 5 below 1000 is "+Sum);
		
	}

}
