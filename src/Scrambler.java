import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

public class Scrambler {
	
	public static void scramble() {
		
		String[] scramble = new String[] {"R","Rp","L","Lp","U","Up","D","Dp","B","Bp","F","Fp"};
		List result = new  ArrayList<String>();
		int i = 0;
			
		while(i < 20) {
			
			double rand = Math.random() * scramble.length - 1;
			int randGen = (int)(rand);
			
			List<String> move = Arrays.asList(scramble[randGen]);
			
			
			result.add(move);
			i++;
			
		}
		
		
		System.out.println( result.get(result.size() - 1) );
	}
}
