
public class Escargot{

	public static int couples(int months){
		int snailsCouple = 1;
		for (int i = 2;i <= months ; i = i+2) {
			snailsCouple = snailsCouple + snailsCouple;

		}
		return snailsCouple;
	}

}