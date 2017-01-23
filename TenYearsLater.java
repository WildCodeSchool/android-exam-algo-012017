class TenYearsLater {
	public static void main(String[] args) {

		Snail bobby = new Snail("Bobby");
		Snail billy = new Snail("Billy");
		for (int i = 0;i < 120 ; i++) {

			Snail.growAll();
			
		}
		System.out.print(Snail.getTotalCouple());
	}
}