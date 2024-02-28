public class incremento {

	public static void main(String[] args) {

		int x = 1;

		System.out.println("Before the call, x is " + x);
		incremento(x);


		System.out.println("after the call, x is " + x);

	}


	public static void incremento(int n) {
		n++;
		System.out.println("n inside the method is " + n);
	}
}
