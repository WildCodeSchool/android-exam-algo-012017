import junit.framework.*;
import org.junit.Test;

public class MyTest extends TestCase {

  @Test
  public void testTrue() throws Exception {
    assertEquals(true, true);
  }

  @Test
  public void testSnailCouple2Months() throws Exception{
  	assertEquals(3, Field.loveMachine(2));
  }

  @Test
  public void testSnailCouple6Months() throws Exception{
  	assertEquals(13, Field.loveMachine(5));
  }

}
