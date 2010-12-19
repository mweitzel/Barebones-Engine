package mvc;

import static org.mockito.Mockito.*;
import io.Frame;
import io.Keyboard;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

public class ControllerTest {
	
	Model mockedModel;
	ModelViewPair mvPair;
	Frame mockedFrame;
	Keyboard mockedKeyboard;
	
	Controller controller;
	
	@Before
	public void setUp() {
		mockedModel = mock(Model.class);
		mvPair = new ModelViewPair(mockedModel, mock(View.class));
		mockedFrame = mock(Frame.class);
		mockedKeyboard = mock(Keyboard.class);
		
		controller = new Controller(mvPair, mockedFrame, mockedKeyboard);
	}

	@Test
	public void viewIsSetOnFrame() {
		verify(mockedFrame).setView(mvPair.getView());
	}

	@Test
	public void callsTickFunctionForModelAndView() {		
		controller.tick();
		
		verify(mockedModel).tick();
		verify(mockedFrame).repaint();
	}

	@Test
	public void modelIsTickedBeforePainted() {		
		controller.tick();
		
		InOrder inOrder = inOrder(mockedModel, mockedFrame);
		 
		inOrder.verify(mockedModel).tick();
		inOrder.verify(mockedFrame).repaint();
	}
}