import junit.framework.*;
import org.junit.Test;

//Impossible de rentré le resultat pour 120 mois 
// pour trouver les resultat en fonction des mois utilisation de : https://www.les-suites.fr/fibonacci/valeurs-des-5000-premiers-termes-de-la-suite-fibonacci.htm

public class MyTest extends TestCase {

  @Test
  public void testTrue() throws Exception {
    assertEquals(true, true);
  }

  @Test
  public void test3() throws Exception {
    assertEquals(2, Escargot.nbCoupleEscargot(3));
  }

  @Test
	public void test6() throws Exception {
		assertEquals(8, Escargot.nbCoupleEscargot(6));
	}

	@Test
	public void test28() throws Exception {
		assertEquals(317811, Escargot.nbCoupleEscargot(28));
	}

		@Test
	public void test31() throws Exception {
		assertEquals(1346269, Escargot.nbCoupleEscargot(31));
	}
}
 