// este programa usa un metodo parametrizado.
class Box {
	double width;
	double height;
	double depth;
	// calcular y regresar el volumen

	double volume() {
	return width * height * depth;
	}

	// sets las dimensiones de las cajas
	void setDim(double w, double h, double d) {
	width = w;
	height = h;
	depth = d;
	}
}

class BoxDemo5 {
	public static void main(String args[]) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;

		// inicializar cada caja
		mybox1.setDim(10, 20, 15);
		mybox2.setDim(3, 6, 9);

		// get volumen de la primera caja
		vol = mybox1.volume();
		System.out.println("Volumen es " + vol);

		// get volumen de la segunda caja
		vol = mybox2.volume();
		System.out.println("Volumen es " + vol);
	}
}

