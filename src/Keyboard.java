


import java.awt.event.KeyEvent;
import java.util.HashMap;

public class Keyboard {

	public Keyboard(){
		setUp();
	}
	
	public HashMap buttonMap = new HashMap();
	void setUp(){
		buttonMap.put(KeyEvent.VK_A, false);
		buttonMap.put(KeyEvent.VK_B, false);
		buttonMap.put(KeyEvent.VK_C, false);
		buttonMap.put(KeyEvent.VK_D, false);
		buttonMap.put(KeyEvent.VK_E, false);
		buttonMap.put(KeyEvent.VK_F, false);
		buttonMap.put(KeyEvent.VK_G, false);
		buttonMap.put(KeyEvent.VK_H, false);
		buttonMap.put(KeyEvent.VK_I, false);
		buttonMap.put(KeyEvent.VK_J, false);
		buttonMap.put(KeyEvent.VK_K, false);
		buttonMap.put(KeyEvent.VK_L, false);
		buttonMap.put(KeyEvent.VK_M, false);
		buttonMap.put(KeyEvent.VK_N, false);
		buttonMap.put(KeyEvent.VK_O, false);
		buttonMap.put(KeyEvent.VK_P, false);
		buttonMap.put(KeyEvent.VK_Q, false);
		buttonMap.put(KeyEvent.VK_R, false);
		buttonMap.put(KeyEvent.VK_S, false);
		buttonMap.put(KeyEvent.VK_T, false);
		buttonMap.put(KeyEvent.VK_U, false);
		buttonMap.put(KeyEvent.VK_V, false);
		buttonMap.put(KeyEvent.VK_W, false);
		buttonMap.put(KeyEvent.VK_X, false);
		buttonMap.put(KeyEvent.VK_Y, false);
		buttonMap.put(KeyEvent.VK_Z, false);
		buttonMap.put(KeyEvent.VK_1, false);
		buttonMap.put(KeyEvent.VK_2, false);
		buttonMap.put(KeyEvent.VK_3, false);
		buttonMap.put(KeyEvent.VK_4, false);
		buttonMap.put(KeyEvent.VK_5, false);
		buttonMap.put(KeyEvent.VK_6, false);
		buttonMap.put(KeyEvent.VK_7, false);
		buttonMap.put(KeyEvent.VK_8, false);
		buttonMap.put(KeyEvent.VK_9, false);
		buttonMap.put(KeyEvent.VK_0, false);
		buttonMap.put(KeyEvent.VK_CONTROL, false);
		buttonMap.put(KeyEvent.VK_SHIFT, false);
		buttonMap.put(KeyEvent.VK_SPACE, false);
		buttonMap.put(KeyEvent.VK_TAB, false);
		buttonMap.put(KeyEvent.VK_ESCAPE, false);
		buttonMap.put(KeyEvent.VK_ALT, false);
		buttonMap.put(KeyEvent.VK_UP, false);
		buttonMap.put(KeyEvent.VK_DOWN, false);
		buttonMap.put(KeyEvent.VK_LEFT, false);
		buttonMap.put(KeyEvent.VK_RIGHT, false);
		buttonMap.put(KeyEvent.VK_ENTER, false);
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
		return (Boolean)buttonMap.get(key);
	}
	
	public void set(int key, boolean value){
		(buttonMap).put(key, value);
	}
}