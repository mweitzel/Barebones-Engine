package initialize;

import io.Frame;

public class Main {

	public static void main(String[] args) {
		ObjectFactory factory = ObjectFactory.getInstance();
		Ticker ticker = factory.ticker();
		setUpWorld(factory.getFrame(), ticker);
	}

	public static void setUpWorld(Frame frame, Ticker ticker) {
		frame.initiate();
		ticker.startTimer();
	}

}
