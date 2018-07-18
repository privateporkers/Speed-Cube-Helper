
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
	
	public long timeResult() {
		long result;
		
		result = (endTime - startTime) / 10000000;
		
		return result;
	}
	
	
}
