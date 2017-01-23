import junit.framework.*;
import org.junit.Test;

public class MyTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
    	assertEquals(true, true);
 	}
 	@Test
	public void testMot() throws Exception {
    	assertEquals("ts", Mot.trie("ts"));
 	}
 	
}