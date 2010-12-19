package mvc;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ModelViewPairTest {
	
	Model mockedModel;
	View mockedView;
	
	@Before
	public void setUp() {
		mockedModel = mock(Model.class);
		mockedView = mock(View.class);
	}
	
	@Test
	public void constructs() {
		ModelViewPair mvPair= new ModelViewPair(mockedModel, mockedView);
		assertNotNull(mvPair);
	}
	
}
