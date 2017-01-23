import junit.framework.*;
import org.junit.Test;

public class Mytest extends TestCase{

	@Test
		public void testTrue() throws Exception {
    	assertEquals(true, true);
  	}

	@Test 
		public void test1() throws Exception {
		assertEquals(4, Escargot.couples(2));
	}
}