package vehiculo.coche;

public class Sedan extends Coche {
	private int puertas;
	private boolean frenosTraseros;

	public Sedan(String marca, String modelo, int matricula, Combustible combustible, int puertas) {
		super(marca, modelo, matricula, combustible);
		this.puertas = puertas;
		this.frenosTraseros = false;
	}

	@Override
	public String toString() {
		return "Sedan [puertas=" + puertas + ", getCombustible()=" + getCombustible() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getMatricula()=" + getMatricula() + "]";
	}

	@Override
	public void frenarTraseros() {
		if (frenosTraseros == false) {
			System.out.println("El coche esta empezando ha derrapando");
			frenosTraseros = true;
		} else {
			System.out.println("El coche ya esta derrapando");
		}
	}

	@Override
	public void dejarFrenarTraseros() {
		if (frenosTraseros == true) {
			System.out.println("El coche ha dejado de derrapar");
			frenosTraseros = false;
		} else {
			System.out.println("El coche no esta derrapando");

		}
	}
}
