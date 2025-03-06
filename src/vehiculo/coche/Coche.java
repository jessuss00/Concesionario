package vehiculo.coche;

import vehiculo.Vehiculo;

public abstract class Coche extends Vehiculo {

	private Combustible combustible;

	public Coche(String marca, String modelo, int matricula, Combustible combustible) {
		super(marca, modelo, matricula);
		this.combustible = combustible;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub

	}

	public abstract void frenarTraseros();

	public abstract void dejarFrenarTraseros();

}
