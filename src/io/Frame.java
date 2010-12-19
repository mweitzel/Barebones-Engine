package io;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import mvc.View;


public class Frame extends JFrame {

   	Object panel;
   	View view;
   	Keyboard keyboard;
	
    public Frame() {
    	addPanel();
    	setSpecifics();
    }

	public void addPanel() {
		panel = new Panel();
    	add((Component)panel);
	}
	
	public void setSpecifics() {
		setUndecorated(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1024, 600);
        setLocationRelativeTo(null);
        setTitle("Bare");
        setResizable(false);
        setVisible(true);
        setAlwaysOnTop(true);
    }

	public class Panel extends JPanel{

		public Panel() {
	    	addKeyListener(new TAdapter());
	       	setFocusable(true);
	        setBackground(Color.BLACK);
	        setDoubleBuffered(true);
	    }
	
	    public void addNotify() {
	        super.addNotify();
	    }
	    
	    public void paint(Graphics graphics) {
	    	super.paint(graphics);
	    	drawMouseXY((Graphics2D)graphics);
	    	Toolkit.getDefaultToolkit().sync();
	    	graphics.dispose();
	    }
					
	    private void drawMouseXY(Graphics2D graphics2D) {
	    	graphics2D.setColor(Color.WHITE);
	    	try{
	    		String mouseXY = ""+getMousePosition().x + ", " +getMousePosition().y;
	    		graphics2D.drawString(mouseXY, 10, 10);
	    	}
	    	catch(Exception e){}
	    }
	}

	public void removeFrame() {
		panel = null;
	}
	  
	public void setKeyboard(Keyboard keyboard){
		this.keyboard = keyboard;
	}
	
	public void setView(View view) {
		this.view = view;
	}

	private class TAdapter extends KeyAdapter {
		public void keyReleased(KeyEvent e) {
			keyboard.keyReleased(e);
		}
		public void keyPressed(KeyEvent e) {
			keyboard.keyPressed(e);
		}
	}

}
