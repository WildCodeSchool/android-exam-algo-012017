import java.util.*;

class Foo {

	public static int countSnail(int months) {

		int result = 0;

		if (months == 0)
			return 0; 

	  	else if (months == 1) {
    		return 1;
      }

    	else if (months == 2) {
        	return 2;
      }

		int[] suiteFibo = new int[months];
		suiteFibo[0] = suiteFibo [1] = 1;

		for(int i = 2; i < months ; i++) {
			suiteFibo[i] = suiteFibo[i-1] + suiteFibo[i-2];
			result = suiteFibo[i];
		}

		return result;
	}

}