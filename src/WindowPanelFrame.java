import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class WindowPanelFrame extends JFrame {

   	Object panel;
   	View view;
   	Keyboard keyboard;
	
    public WindowPanelFrame() {
    	addPanel();
    	setSpecifics();
    }

	public void addPanel() {
		panel = new WindowPanel();
    	add((Component)panel);
	}
	
	public void setSpecifics() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("Bare");
        setResizable(false);
        setVisible(true);
	}

	public class WindowPanel extends JPanel{

		public WindowPanel() {
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
	    	view.drawInGameGraphics((Graphics2D)graphics);
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
