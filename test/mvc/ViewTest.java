package mvc;

import static org.junit.Assert.*;
import io.Frame;

import org.junit.Test;

public class ViewTest {
	
	@Test
	public void constructs() {
		View view = new View((Frame)null, (SharedObject)null);
		assertNotNull(view);
	}
	
}
