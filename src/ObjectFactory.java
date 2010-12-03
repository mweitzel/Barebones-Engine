
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
		return new ModelViewPair(keyboard, windowPanelFrame);
	}
	
	
}
