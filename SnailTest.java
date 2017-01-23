import junit.framework.*;
import org.junit.Test;

public class SnailTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
    	assertEquals(true, true);
	}

	@Test
	public void test5month() throws Exception {
		assertEquals(5, Snail.main(5));

	}
	@Test
	public void test10month() throws Exception {
		assertEquals(55, Snail.main(10));
	}
	@Test
	public void test20month() throws Exception {
		assertEquals(6765, Snail.main(20));
	}
}