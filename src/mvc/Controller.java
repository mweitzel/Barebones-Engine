package mvc;

import io.Keyboard;
import io.WindowPanelFrame;

public class Controller {

	public WindowPanelFrame windowPanelFrame;
	private Keyboard keyboard;
	
	ModelViewPair mvPair;
	
	public Controller(ModelViewPair mvPair, WindowPanelFrame windowPanelFrame, Keyboard keyboard){
		this.keyboard = keyboard;
		this.windowPanelFrame = windowPanelFrame;
		this.mvPair = mvPair;
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