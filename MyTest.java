import junit.framework.*;
import org.junit.Test;

public class MyTest extends TestCase {

  @Test
  public void testTrue() throws Exception {
    assertEquals(true, true);
  }

  @Test
  public void testSnailCouple() throws Exception{
  	assertEquals(1, Field.loveMachine(1));
  	assertEquals(1, Field.loveMachine(2));
  	assertEquals(2, Field.loveMachine(3));
  	assertEquals(3, Field.loveMachine(4));
  	assertEquals(5, Field.loveMachine(5));
  	assertEquals(8, Field.loveMachine(6));
  	assertEquals(13, Field.loveMachine(7));
  }

}
