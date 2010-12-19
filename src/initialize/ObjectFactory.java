package initialize;
import io.Keyboard;
import io.WindowPanelFrame;
import mvc.Controller;
import mvc.Model;
import mvc.ModelViewPair;
import mvc.SharedObject;
import mvc.View;


public class ObjectFactory {

	private Keyboard keyboard;
	private WindowPanelFrame windowPanelFrame;
	
	public ObjectFactory(){
		keyboard = new Keyboard(); 
		windowPanelFrame = new WindowPanelFrame();
	}
	
	public Controller controller() {
		return new Controller(modelViewPair(), windowPanelFrame, keyboard);
	}

	private ModelViewPair modelViewPair() {
		SharedObject sharedObject = new SharedObject();
		return new ModelViewPair(Model(sharedObject), View(sharedObject));
	}
	
	private Model Model(SharedObject sharedObject) {
		return new Model(keyboard, sharedObject);
	}

	private View View(SharedObject sharedObject) {
		return new View(windowPanelFrame, sharedObject);
	}

	public Ticker ticker() {
		return new Ticker(controller());
	}
}
