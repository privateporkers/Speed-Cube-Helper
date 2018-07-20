
public class Timer {
	
	private long startTime = 0;
	private long endTime = 0;
	private boolean isRunning = false;
	
	//Start function to get the start time interval
	public void start() {
		System.out.println("Timer Started");
		
		this.startTime = System.nanoTime();
		this.isRunning = true;
	}
	
	//Stop function to get the ending time interval
	public void stop() {
		System.out.println("Timer Stopped");
		
		this.endTime = System.nanoTime();
		this.isRunning = false;
	}
	
	public void timeResult() {
		long time;
		
		//gets the time
		time = (endTime - startTime) / 10000000;
		
		//puts the long type number into a tring to be cut
		String result = Long.toString(time);
		String firstDigits = "";
		String milisec = "";
		
		//puts the time in a format to read your time easily
		//TO-DO: make it where it takes it minutes as well
		if(result.length() % 2 == 0) {
			firstDigits = result.substring(0,2);
			milisec = result.substring(2);
		} else {
			firstDigits = result.substring(0,1);
	    	milisec = result.substring(1);
		}
		
		//prints out the time
		System.out.println("Your time: " + firstDigits + "." + milisec);
		
	}
	
	
}
