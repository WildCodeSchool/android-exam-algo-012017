public class Escargot{


	
 	public static int nbCoupleEscargot(int mois){

		int nbCouple = 0;

		if(mois == 0)
			return 0;

		else if(mois == 1)
			return 1;

		else if(mois == 2)
			return 1;

		int[] tab = new int[mois];
		tab[0] = tab[1] = 1;

		for(int i = 2; i < mois ; i++){
			tab[i] = tab[i-1] + tab[i-2];
			nbCouple = tab[i];
		}

		return nbCouple;
	}
 }
	

 