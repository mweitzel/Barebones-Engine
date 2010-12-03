



public class ModelViewPair {

	public Model model;
	public View view;

	public ModelViewPair(Keyboard input, WindowPanelFrame windowPanelFrame) {
		model = new Model(input);
		view = new View(windowPanelFrame);
	}
}
