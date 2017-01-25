public class Escargot{

public static int[] count(int nbMois){

		if(nbMois == 0)
			return new int[]{};

		else if(nbMois == 1)
			return new int[]{1};

		else if(nbMois == 2)
			return new int[]{1,1};

		int[] nbCoupleEscargot = new int[nbMois];
		nbCoupleEscargot[0] = nbCoupleEscargot [1] = 1;

		for(int i = 2; i < nbMois ; i++){
			nbCoupleEscargot[i] = nbCoupleEscargot[i-1] + nbCoupleEscargot[i-2];
		}
		return nbCoupleEscargot;
	}
}