package vehiculo.coche;

public class Main {

	public static void main(String[] args) {

		Ranchera r1 = new Ranchera("audi", "a4", 1000, Combustible.DIESEL, 100);

		r1.frenarTraseros();
		r1.dejarFrenarTraseros();
		r1.dejarFrenarTraseros();

		
	}

}
