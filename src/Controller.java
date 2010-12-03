
public class Controller {

	public WindowPanelFrame windowPanelFrame;
	private Keyboard keyboard;
	
	ModelViewPair mvPair;
	
	//Stack<ModelViewPair> mvPairStack = new Stack<ModelViewPair>();
	
	public Controller(ModelViewPair baseOfMVPairStack, WindowPanelFrame windowPanelFrame, Keyboard keyboard){
		this.keyboard = keyboard;
		this.windowPanelFrame = windowPanelFrame;
		mvPair = baseOfMVPairStack;
		windowPanelFrame.setView(mvPair.view);
		windowPanelFrame.setKeyboard(keyboard);
	}
	
	public void tick() {
		
		modelTick();
		paint();
	}

	void removeFrame() {
		windowPanelFrame.removeFrame();
	}

	private void modelTick() {
		mvPair.model.tick();
	}


	private void paint() {
		windowPanelFrame.repaint();
	}

}
