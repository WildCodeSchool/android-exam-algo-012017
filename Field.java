import java.util.ArrayList;

class Field{

	private static ArrayList<SnailCouple> snails = new ArrayList<SnailCouple>();

	public static int loveMachine(int months){
		snails.clear();
		//On met notre premier couple dans le Champs
		snails.add(new SnailCouple(true));

		//pour chaque mois
		for (int i = 0; i < months ; i++) {
			//on vérifie si il y a des bébé et on les fait grandir
			growBabySnails(snails);

			//Naissances
			birthSnails(snails);
		}

		//retourne le nombre de couple d'escargots
		return snails.size();
	}

	private static void growBabySnails(ArrayList<SnailCouple> snails){
		for (int j=0; j < snails.size() ;j++ ) {
			//Si le couple n'est pas majeur Alors on les fait grandir
				if(!snails.get(j).isMajor()){
					snails.get(j).setMajorityToTrue();
				}
			}
	}

	private static void birthSnails(ArrayList<SnailCouple> snails){
		for (int j =0; j < snails.size() ;j++ ) {
			//Si le couple à plus d'un 1 mois(Major = true) Alors il font un nouveau couple
			if(snails.get(j).isMajor()){
				snails.add(new SnailCouple());
			}
		}
	}
}