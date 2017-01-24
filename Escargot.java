import static java.lang.System.out;
public class Escargot {
	public static  int resCouple(int mois){
		int couple = 1;
		for(int i = 0; i < mois; i ++){
			couple = couple + couple;		
		}
		System.out.println(couple);
		return couple;
		
	}

}