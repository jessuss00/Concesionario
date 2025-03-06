package vehiculo.ciclomotor;

import vehiculo.Vehiculo;

public abstract class Ciclomotor extends Vehiculo {

	private int cilindrada;

	public Ciclomotor(String marca, String modelo, int matricula, int cilindrada) {
		super(marca, modelo, matricula);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub

	}

	public abstract void subirCaballito();

	public abstract void bajarCaballito();

}
