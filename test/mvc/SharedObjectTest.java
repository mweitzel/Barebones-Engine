package mvc;

import static org.junit.Assert.*;

import org.junit.Test;

public class SharedObjectTest {

	@Test
	public void constructs() {
		SharedObject object = new SharedObject();
		assertNotNull(object);
	}
	
}
