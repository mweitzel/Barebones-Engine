package mvc;


import io.Frame;

import java.awt.Graphics2D;
import java.awt.image.ImageObserver;


public class View {

	private ImageObserver imageObserver;
	private SharedObject sharedObject;

	public View(Frame frame, SharedObject sharedObject) {
		imageObserver = frame;
		this.sharedObject = sharedObject;
	}

	void drawInGameGraphics(Graphics2D graphics){
		/* arrayOfDrawable = sharedObject.getDrawable();
		 * for(0 through arrayOfDrawable.size())
		 *     graphics.drawImage(arrayOfDrawable[i], aod[i].getX(), aod[i].getY(), imageObserver)
		 */
	}

}
