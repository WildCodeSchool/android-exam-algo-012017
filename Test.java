import junit.framework.*;
import org.junit.Test;

public class Test extends TestCase {
  @Test
  public void testTrue() throws Exception {
    assertEquals(true, true);

  }
  @Test
  public void test1() throws Exception {
  	assertEquals(440, Foo.nbescargots(2));
  }
}
