class Foo {

	public static int countSnail(int mois){

		int result = 0;

		if(mois == 0)
			return 0;
		else if(mois == 1)
			return 1;
		else if(mois == 2)
			return 1;

		int[] suite = new int[mois];
		suite[0] = suite [1] = 1;

		for(int i = 2; i < mois ; i++){
			suite[i] = suite[i-1] + suite[i-2];
			result = suite[i];
		}
		return result;
	}
 }