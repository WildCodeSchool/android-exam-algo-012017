import junit.framework.*;
import org.junit.Test;

public class SnailTest extends TestCase {
	@Test
	public void testInit() throws Exception{

	Snail bobby = new Snail("Bobby");
	Snail billy = new Snail("Billy");

	assertEquals(1, Snail.getTotalCouple());
	Snail.growAll();
	Snail.growAll();
	assertEquals(2, Snail.getTotalCouple());
	Snail.growAll();
	assertEquals(3, Snail.getTotalCouple());
	Snail.growAll();
	assertEquals(5, Snail.getTotalCouple());
	Snail.growAll();
	assertEquals(8, Snail.getTotalCouple());


}
}