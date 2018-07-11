import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

public class Scrambler {
	
	public static void scramble() {
		
		String[] moves = new String[] {"R","L","U","D","B","F","R2","L2","U2","D2","B2","F2","Rp","Lp","Up","Dp","Bp","Fp"};
		
		List result = new  ArrayList<String>();
		int i = 0;
		int holder = 0;
			
		while(i < 20) {
			
			double rand = Math.random() * moves.length - 1;
			int randGen = (int)(rand);
			
			if(holder == randGen) {
				continue;
			}
			
			List<String> move = Arrays.asList(moves[randGen]);
			
			holder = randGen;
			result.add(move);
			i++;
		}
		
		System.out.println( result );
	}
}
