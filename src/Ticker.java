

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;


public class Ticker implements ActionListener {

	Timer timer;
	Controller controller;
	
	public Ticker(Controller controller){
		this.controller = controller;
		timer = new Timer(20, this);   // how do I inject a timer if I need this to be what catches its events?
		timer.start();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.tick();
	}
	
}
