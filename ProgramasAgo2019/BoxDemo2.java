// este programa declara dos objetos caja.
class Box {
	double width;
	double height;
	double depth;
}

class BoxDemo2 {
	public static void main(String args[]) {
	Box mybox1 = new Box();
	Box mybox2 = new Box();
	double vol;
	// asigna valores a la variables instancia mybox1's
	mybox1.width = 10;
	mybox1.height = 20;
	mybox1.depth = 15;
	/* asigna diferentes valores las variables instancia mybox2's */
	mybox2.width = 3;
	mybox2.height = 6;
	mybox2.depth = 9;
	// calcular el volumen de la primera caja
	vol = mybox1.width * mybox1.height * mybox1.depth;
	System.out.println("Volumen es " + vol);
	// calcular el volumen de la segunda caja
	vol = mybox2.width * mybox2.height * mybox2.depth;
	System.out.println("Volumen es " + vol);
	}
}
