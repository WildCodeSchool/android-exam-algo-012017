import junit.framework.*;
import org.junit.Test;
import java.util.*;

public class MyTest extends TestCase {

  @Test
  public void testTrue() throws Exception {
    assertEquals(true, true);
  }

  @Test
  public void testDifferentsMois() throws Exception {
  		assertTrue(Arrays.equals(new int[]{1}, Escargot.count(1)));
  		assertTrue(Arrays.equals(new int[]{1, 1}, Escargot.count(2)));
  		assertTrue(Arrays.equals(new int[]{1, 1, 2, 3, 5, 8}, Escargot.count(6)));
  }
}  