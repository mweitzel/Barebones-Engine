package initialize;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ObjectFactoryTest {

	ObjectFactory factory;
	
	@Before
	public void setUp() {
		factory = ObjectFactory.getInstance();
	}
	
	@Test
	public void tickerGivesMeTicker() {
		Ticker ticker = factory.ticker();
		assertEquals(Ticker.class, ticker.getClass());
	}
	
}
