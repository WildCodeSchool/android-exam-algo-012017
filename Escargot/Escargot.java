import static java.lang.System.out;
public class Escargot {
	public static  int resCouple(int mois){
		int couple = 1;
		int newBebe = 0;
		for(int i = 1; i <= mois; i ++){
			
			int modulo = i%2;
			if(modulo != 0){
				System.out.println(modulo);
			}else if (modulo == 0){
				newBebe = couple;
				System.out.println(modulo);
			}
			couple = couple + newBebe;
			newBebe = 0;		
		}
		System.out.println(couple);
		return couple;
		
	}

}