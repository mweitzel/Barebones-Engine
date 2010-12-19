package initialize;

import static org.mockito.Mockito.*;

import javax.swing.Timer;

import mvc.Controller;

import org.junit.Test;

public class TickerTest {

	@Test
	public void actionsPerformedCallsControllerTick() {
		Controller controller = mock(Controller.class);
		Ticker ticker = new Ticker(controller);
		
		ticker.actionPerformed(null);
		verify(controller).tick();
	}
	
	@Test
	public void startTimerStartsTimer() {
		Timer timer = mock(Timer.class);
		Ticker ticker = new Ticker((Controller)null);
		ticker.setTimer(timer);
		
		ticker.startTimer();
		verify(timer).start();
	}
	
}
