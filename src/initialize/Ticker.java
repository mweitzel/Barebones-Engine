package initialize;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import mvc.Controller;



public class Ticker implements ActionListener {

	Timer timer;
	Controller controller;
	
	public Ticker(Controller controller){
		this.controller = controller;
		startTimer();
	}

	private void startTimer() {
		timer = new Timer(20, this); //how do I create this and inject it when Ticker is the thing that needs the events
		timer.start();
	}

	public void actionPerformed(ActionEvent e) {
		controller.tick();
	}
	
}
