public class Snail {
	
	public static int main(int mois){

		int result = 0;

		if(mois == 0)
			return 0;

		else if(mois == 1)
			return 1;

		else if(mois == 2)
			return 1;

		int[] n = new int[mois];
		n[0] = n [1] = 1;

		for(int i = 2; i < mois ; i++){
			n[i] = n[i-1] + n[i-2];
			result = n[i];
		}
		return result;
	}
}
