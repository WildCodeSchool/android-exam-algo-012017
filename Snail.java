import java.util.*;

class Snail {
	private String name;
	private int age;
	private static int leftSnaill = 0;
	private static List<Snail> snailList= new ArrayList<Snail>();

	public Snail(){
		this.age = 0;
		this.snailList.add(this);
	}
	public Snail(String name){
		this.name = name;
		this.age = 0;
		this.leftSnaill ++;
		this.snailList.add(this);
	}
	public void grow(){
		this.age ++;

		if (this.age > 1) {
			
		}
		
	}

	private void copulate(){
		if (leftSnaill >0) {
				leftSnaill --;
				new Snail();
			}
	}
	public static void growAll(){
		int countBabies = -1;
		for (int i = 0; i < snailList.size(); i++ ) {
			if (snailList.get(i).getAge() > 0){
				snailList.get(i).copulate();
				countBabies ++;
			}
				snailList.get(i).grow();
			}

		
		leftSnaill = snailList.size() - countBabies;
	}
	public static int getTotalCouple(){
		
		return (snailList.size()/ 2);
	}
	private int getAge(){ return this.age;}
}