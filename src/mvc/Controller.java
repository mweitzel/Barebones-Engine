package mvc;

import io.Keyboard;
import io.Frame;

public class Controller {

	private Frame frame;
	private Keyboard keyboard;
	private ModelViewPair mvPair;
	
	public Controller(ModelViewPair mvPair, Frame frame, Keyboard keyboard){
		this.keyboard = keyboard;
		this.frame = frame;
		this.mvPair = mvPair;
		frame.setView(mvPair.getView());
		frame.setKeyboard(keyboard);
	}
	
	public void tick() {
		modelTick();
		paint();
	}

	private void modelTick() {
		mvPair.getModel().tick();
	}

	private void paint() {
		frame.repaint();
	}
}