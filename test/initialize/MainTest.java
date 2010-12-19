package initialize;

import static org.mockito.Mockito.*;
import io.Frame;

import org.junit.Test;
import org.mockito.InOrder;

public class MainTest {

	@Test
	public void startTimerStartsTimer() {
		Ticker ticker = mock(Ticker.class);
		Frame frame = mock(Frame.class);
		
		Main.setUpWorld(frame, ticker);
		
		InOrder inOrder = inOrder(frame, ticker);
		
		inOrder.verify(frame).initiate();
		inOrder.verify(ticker).startTimer();
	}
	
}
