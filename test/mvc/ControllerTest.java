package mvc;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import io.Frame;
import io.Keyboard;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

public class ControllerTest {

	@Test
	public void callsTickFunctionForModelAndView() {
		Model mockedModel = mock(Model.class);
		ModelViewPair mvPair = new ModelViewPair(mockedModel, mock(View.class));
		Frame mockedFrame = mock(Frame.class);
		Keyboard mockedKeyboard = mock(Keyboard.class);
		
		Controller controller = new Controller(mvPair, mockedFrame, mockedKeyboard);
		
		controller.tick();
		
		verify(mockedModel).tick();
		verify(mockedFrame).repaint();
	}

	@Test
	public void modelIsTickedBeforePainted() {
		Model mockedModel = mock(Model.class);
		ModelViewPair mvPair = new ModelViewPair(mockedModel, mock(View.class));
		Frame mockedFrame = mock(Frame.class);
		Keyboard mockedKeyboard = mock(Keyboard.class);
		
		Controller controller = new Controller(mvPair, mockedFrame, mockedKeyboard);
		
		controller.tick();
		
		InOrder inOrder = inOrder(mockedModel, mockedFrame);
		 
		inOrder.verify(mockedModel).tick();
		inOrder.verify(mockedFrame).repaint();
	}
//
//	@Test
//	public void 
	
}