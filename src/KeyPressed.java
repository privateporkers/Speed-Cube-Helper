import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPressed implements KeyListener {
	Timer time = new Timer();
	private int counter = 0;

	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println("pressed: " + e.getKeyCode() );
		
		int test = e.getKeyCode();
		if(test == 32 && counter == 1) {
			time.stop();
			System.out.println(time.timeResult());
			counter = 0;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int keyRelease = e.getKeyCode();
		
		if(keyRelease != 32 && counter == 0) {
			time.start();
			counter++;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//System.out.println("Typed: " + e.getKeyChar() );

	}

}
