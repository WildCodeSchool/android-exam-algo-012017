import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;
public class MerlinTest extends TestCase {
	@Test
	public void charctTest() throws Exception{

		Assert.assertArrayEquals( new String[]{"abc", "bac","cab", "cba"}, PastaLetter.findPossibilities("abc") );
}
}