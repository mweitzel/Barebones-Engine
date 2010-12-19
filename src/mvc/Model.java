package mvc;

import io.Keyboard;


public class Model {
	
	private Keyboard keyboard;
	private SharedObject sharedObject;
	
	public Model(Keyboard keyboard, SharedObject sharedObject) {
		this.keyboard = keyboard;
		this.sharedObject = sharedObject;
	}

	public void tick(){
		/*
		 * using input and logic specific to this model,
		 * do things to the sharedObject's drawable items
		 * so the view can inform the player it has been done
		 */
	}
}
