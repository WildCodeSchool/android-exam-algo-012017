import junit.framework.*;
import org.junit.Test;

public class MyTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
    	assertEquals(true, true);
 	}
 	@Test
 	public void testEscargot() throws Exception{
 		assertEquals(1, Escargot.resCouple(1));
 	}
 	@Test
 	public void testEscargot1() throws Exception{
 		assertEquals(16, Escargot.resCouple(4));
 	}
 	@Test
 	public void testEscargot2() throws Exception{
 		assertEquals(1024, Escargot.resCouple(10));
 	}
}