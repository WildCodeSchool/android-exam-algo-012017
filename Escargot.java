
public class Escargot{

	int months;
	public static int couples(int months){
		int snailsCouple = 1;
		for (int i = 1;i <= months ; i++) {
			snailsCouple = snailsCouple + snailsCouple;

		}
		return snailsCouple;
	}
}