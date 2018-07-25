import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Scrambler {
	
	public static void scramble() {
		
		//holds all the type of moves one can do on the rubiks cube
		String[] moves = new String[] {"R","L","U","D","B","F","R2","L2","U2","D2","B2","F2","Rp","Lp","Up","Dp","Bp","Fp"};
		
		//creating ArrayList to add the scramble
		List result = new  ArrayList<String>();
		int i = 0;
		int holder = 0;
		
		//A while loop to pick a random move in the moves array to add to the list
		//TO-DO: Make it where the not as many moves are in the same couple spots (i.e. not [R,R2,R...] )
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
		
		//Prints out the scramble
		System.out.println( result );
	}
}
