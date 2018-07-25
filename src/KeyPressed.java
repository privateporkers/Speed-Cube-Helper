import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPressed implements KeyListener {
	Timer time = new Timer();
	Scrambler scram = new Scrambler();
	private int counter = 0;
	
	//Gets the Space Bar key after completed solve as soon as its pressed
	@Override
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		if(key == 32 && counter == 1) {
			time.stop();
			time.timeResult();
			counter = 0;
			//creates a new scramble after every solve/completed time
			scram.scramble();
		}
	}
	
	//Gets the key code for any key except the Space Bar key to start the time once released
	@Override
	public void keyReleased(KeyEvent e) {
		
		int keyRelease = e.getKeyCode();
		
		if(keyRelease != 32 && counter == 0) {
			time.start();
			counter++;
		}
	}
	
	//Keep for right now, should remove in future if not used
	@Override
	public void keyTyped(KeyEvent e) {
	}

}
