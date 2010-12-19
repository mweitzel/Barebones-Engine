package io;



import java.awt.event.KeyEvent;
import java.util.HashMap;

public class Keyboard {

	public Keyboard(){
		setUp();
	}
	
	public HashMap<Integer, Boolean> buttonMap = new HashMap<Integer, Boolean>();
	
	void setUp(){
		for(int i = 0; i < 600; i++)
			buttonMap.put(/*KeyEvent.VK_A-VK_?*/i, false);
	}
	
	public void keyPressed(KeyEvent e) {
		
		int eventKey = e.getKeyCode();

		for(Object key: buttonMap.keySet()){
			int keyInt = (Integer)(key);
			if(keyInt == eventKey)
				buttonMap.put(keyInt, true);
		}
	}	
	
	public void keyReleased(KeyEvent e) {
		int eventKey = e.getKeyCode();

		for(Object key: buttonMap.keySet()){
			int keyInt = (Integer)key;
			if(keyInt == eventKey)
				buttonMap.put(keyInt, false);
		}		
	}
	
	public boolean get(int key){
		return buttonMap.get(key);
	}
	
	public void set(int key, boolean value){
		buttonMap.put(key, value);
	}
}