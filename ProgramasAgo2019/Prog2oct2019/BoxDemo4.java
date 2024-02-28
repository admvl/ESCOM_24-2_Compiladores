// ahora, volume() regresa el volumen de una caja.
class Box {
	double width;
	double height;
	double depth;
	// calcular y regresar el volumen
	double volume() {
		return width * height * depth;
	}
}

class BoxDemo4 {
public static void main(String args[]) {
	Box mybox1 = new Box();
	Box mybox2 = new Box();
	double vol;
	// asignar valores a la variable instancia mybox1's
	mybox1.width = 10;
	mybox1.height = 20;
	mybox1.depth = 15;
	/* asignar diferentes valores a la variable instancia mybox2's */
	mybox2.width = 3;
	mybox2.height = 6;
	mybox2.depth = 9;
	// get volumen de la primera caja
	vol = mybox1.volume();
	System.out.println("Volumen es " + vol);
	// get volume de la segunda caja
	vol = mybox2.volume();
	System.out.println("Volumen es " + vol);
	}
}
