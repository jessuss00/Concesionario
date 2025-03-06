package vehiculo.coche;

import vehiculo.ciclomotor.Moto;

public class Ranchera extends Coche {
	private int capacidadMaletero;
	private boolean frenosTraseros;

	public Ranchera(String marca, String modelo, int matricula,int velocidadActual, Combustible combustible, int capacidadMaletero) {
		super(marca, modelo, matricula, velocidadActual,combustible);
		this.capacidadMaletero=capacidadMaletero;

	}
	@Override
	public void acelerar() {
		do {
			System.out.println("Dale al rancherita compi");
			System.out.println(getVelocidadActual());
			setVelocidadActual(getVelocidadActual()+5);
			System.out.println(getVelocidadActual());
		} while (getVelocidadActual()<120);
		
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
	@Override
	public boolean equals(Object otro) {// compara this con otro
		Ranchera ranchera = (Ranchera) otro;
		boolean iguales;
		if (this.getMarca() == (ranchera.getMarca()) && this.getModelo() == ranchera.getModelo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}

}
