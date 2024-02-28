/* Aqui, Box usa un constructor para inicializar las
dimensiones de un box.
*/
class Box {
	double width;
	double height;
	double depth;

	// Este es el constructor para Box.
	Box() {
		System.out.println("Construyendo el Box");
		width = 10;
		height = 10;
		depth = 10;
	}

	// calcula y regresa el volumen
	double volume() {
		return width * height * depth;
	}
}

class BoxDemo6 {
	public static void main(String args[]) {

	// declara, gestiona, e inicializa el objeto Box
	Box mybox1 = new Box();
	Box mybox2 = new Box();
	double vol;

	// get el volumen del primer box
	vol = mybox1.volume();
	System.out.println("Volumen es " + vol);

	// get el volumen del segundo box
	vol = mybox2.volume();
	System.out.println("Volumen es " + vol);
	}
}

