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
	}

	public void actionPerformed(ActionEvent e) {
		controller.tick();
	}

	public void setAndStartTimer(Timer timer) {
		this.timer = timer;
		timer.start();
	}
	
}
