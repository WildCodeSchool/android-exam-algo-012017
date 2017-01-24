class SnailCouple{
	//wheeeeeeeeee !!!
	private boolean major = false;

	//Constructors
	public SnailCouple(){}//bébé
	
	public SnailCouple(boolean majority){
		this.major = majority;
	}

	public void setMajorityToTrue(){
		this.major = true;
	}

	public boolean isMajor(){
		return this.major;
	}

}