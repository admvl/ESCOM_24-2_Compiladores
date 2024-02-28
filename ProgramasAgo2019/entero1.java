public class entero1 {

	private static int m, n;
	
	public static int entero1(int x, int y) {
		m = x;
		n = y;
		return 0;
	}	

	public static void main(String[] args) {

		entero1(0, 100);  //Llamada de constructor im 			
		System.out.println("OBJETO1");
		//ent1.imprimir();
		System.out.println("m = " + m + "," + "n = " + n);
		
		entero1(25, 75); //LLamada de cons ex
		System.out.println("OBJETO2");
		//ent2.imprimir();
		System.out.println("n = " + m + "," + "n = " + n);
	}
}
