public class entero {
	private int m,n;

	public entero(int a, int b); //Declaracion de Constructor

	public entero(int x, int y) {
		this.m = x;
		this.n = y;
	}
	

	public static void main(String[] args) {

		public void imprimir(void) {
		return System.out.println("m =" + this.m);
		return System.out.println("n =" + this.n);
		}
		entero ent1 = entero(0, 100);  //Llamada de constructor im 			
		entero ent2 = entero(25, 75); //LLamada de cons ex

		System.out.println("OBJETO1");
		//cout << "\nOBJETO1" << "\n";
		ent1.imprimir();
	
		System.out.println("OBJETO2");
		//cout << "\nOBJETO2" << "\n";
		ent2.imprimir();
	}
}
