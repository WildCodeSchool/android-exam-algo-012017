import junit.framework.*;
import org.junit.Test;
import org.junit.*;
import java.util.*;

public class MyTest extends TestCase {

  @Test
  public void testTrue() throws Exception {
    assertEquals(true, true);

  }

  @Test
  public void testSnailfewFirst() throws Exception {
    assertEquals(1, 1, Foo.countSnail(1));
    assertEquals(2, 2, Foo.countSnail(3));
    assertEquals(5, 5, Foo.countSnail(5));
    assertEquals(8, 8, Foo.countSnail(6));

  }  

  @Test
  public void testSnail10() throws Exception {
    assertEquals(55, 55, Foo.countSnail(10));

  }

  @Test
  public void testSnail25() throws Exception {
    assertEquals(75025, 75025, Foo.countSnail(25));
    
  }

}