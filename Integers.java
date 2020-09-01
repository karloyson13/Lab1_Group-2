import java.util.ArrayList;

public class Integers {
ArrayList<Integer> nums = new ArrayList();
	
	static int computeSum(ArrayList<Integer> ints) { 
		int sum = 0;
		for(int num: ints) {
			sum += num; // or sum + num
		}
		return sum;
	
	}
}