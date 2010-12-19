package mvc;

public class ModelViewPair {

	private Model model;
	private View view;

	public ModelViewPair(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public View getView() {
		return view;
	}

	public Model getModel() {
		return model;
	}
}
