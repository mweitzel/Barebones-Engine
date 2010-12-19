package initialize;

import javax.swing.Timer;

import io.Keyboard;
import io.Frame;
import mvc.Controller;
import mvc.Model;
import mvc.ModelViewPair;
import mvc.SharedObject;
import mvc.View;

public class ObjectFactory {

	private Keyboard keyboard;
	private Frame frame;
	
	public ObjectFactory(){
		keyboard = new Keyboard(); 
		frame = new Frame();
	}
	
	public Controller controller() {
		return new Controller(modelViewPair(), frame, keyboard);
	}

	private ModelViewPair modelViewPair() {
		SharedObject sharedObject = new SharedObject();
		return new ModelViewPair(Model(sharedObject), View(sharedObject));
	}
	
	private Model Model(SharedObject sharedObject) {
		return new Model(keyboard, sharedObject);
	}

	private View View(SharedObject sharedObject) {
		return new View(frame, sharedObject);
	}

	public Ticker ticker() {
		Ticker ticker = new Ticker(controller());
		Timer timer = new Timer(20, ticker);
		ticker.setAndStartTimer(timer);
		return ticker;
	}
}
