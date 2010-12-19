package mvc;

import io.Keyboard;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

public class ModelTest {

	Model model;
	Keyboard mockedKeyboard;
	SharedObject mockedSharedObject;
	
	@Before
	public void setUp() {
		mockedKeyboard = mock(Keyboard.class);
		mockedSharedObject = mock(SharedObject.class);
		
		model = new Model(mockedKeyboard, mockedSharedObject);
	}
	
	@Test
	public void constructs() {
		assertNotNull(model);
	}
	
}
