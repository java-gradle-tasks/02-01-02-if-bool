public class MyAdulthood {

	public static void metodus(boolean userFrendly) {
		System.out.println("Felnottkor meghatarozas!");
		System.out.print("Adja meg hany eves:");
		Scanner in=new Scanner(System.in);
		int year=in.nextInt();
    	System.out.println("On felnottkoru!");
	}

	public static void main(final String[] args) {
		// Write your solution here
		metodus(true);
	}
}
