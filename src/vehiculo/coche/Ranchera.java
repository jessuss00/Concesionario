package vehiculo.coche;

public class Ranchera extends Coche {
	private int capacidadMaletero;
	private boolean frenosTraseros;

	public Ranchera(String marca, String modelo, int matricula, Combustible combustible, int capacidadMaletero) {
		super(marca, modelo, matricula, combustible);
		this.capacidadMaletero = capacidadMaletero;
		this.frenosTraseros = false;

	}

	@Override
	public String toString() {
		return "Ranchera [capacidadMaletero=" + capacidadMaletero + ", getCombustible()=" + getCombustible()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getMatricula()=" + getMatricula()
				+ "]";
	}

	@Override
	public void frenarTraseros() {
		if (frenosTraseros == false) {
			System.out.println("El coche esta empezando ha derrapar");
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
