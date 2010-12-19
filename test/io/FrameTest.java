package io;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.awt.Component;
import java.awt.Panel;

import javax.swing.JFrame;

import org.junit.Test;

public class FrameTest {

	@Test
	public void initiateCallsCorrectFunctions() {
		Keyboard mockedKeyboard = mock(Keyboard.class);
		
		Frame frame = new Frame(mockedKeyboard);
		Frame spyFrame = spy(frame);
		
		//this throws errors something fierce!
		System.out.println("spying on final methods..");
		spyFrame.initiate();

		verify(spyFrame).add((Component) anyObject());
		verify(spyFrame).setUndecorated(true);
		verify(spyFrame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		verify(spyFrame).setSize(1024, 600);
		verify(spyFrame).setLocationRelativeTo(null);
		verify(spyFrame).setTitle((String) anyObject());
		verify(spyFrame).setResizable(false);
		verify(spyFrame).setVisible(true);
	}
	
}
