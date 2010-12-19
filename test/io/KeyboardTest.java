package io;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.awt.Component;
import java.awt.event.KeyEvent;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class KeyboardTest {

	Keyboard keyboard;
	
	@Before
	public void setUp() {
		keyboard = new Keyboard(); 
	}
	
	@Test
	public void constructorMakesMap() {
		for(int i = 0; i < 600; i++)
			assertFalse(keyboard.get(i));
	}
	
	@Test
	public void canSetElementsToValues() {
		for(int i = 0; i < 50; i++) {
			int random = (int) (Math.random()*600);
			keyboard.set(random, true);
			assertTrue(keyboard.get(random));
		}		
	}

	@Test
	public void keyPressedSetsValueToTrue() {
		keyboard.keyPressed(new KeyEvent(mock(Component.class), 0, 0, 0, 234));
		keyboard.keyPressed(new KeyEvent(mock(Component.class), 0, 0, 0, 321));
		assertTrue(keyboard.get(234));
		assertTrue(keyboard.get(321));
	}

	@Test
	public void keyReleasedSetsValueToFalse() {
		keyboard.set(234, true);
		keyboard.set(321, true);
		keyboard.keyReleased(new KeyEvent(mock(Component.class), 0, 0, 0, 234));
		keyboard.keyReleased(new KeyEvent(mock(Component.class), 0, 0, 0, 321));
		assertFalse(keyboard.get(234));
		assertFalse(keyboard.get(321));
	}
}
