import junit.framework.*;
import org.junit.Test;

public class SnailTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
    	assertEquals(true, true);
	}

	@Test
	public void test5mois() throws Exception {
		assertEquals(5, Foo.countSnail(5));

	}
	@Test
	public void test10mois() throws Exception {
		assertEquals(55, Foo.countSnail(10));
	}
	@Test
	public void test12mois() throws Exception {
		assertEquals(144, Foo.countSnail(12));
	}
}