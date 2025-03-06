package vehiculo.camion;

import vehiculo.Vehiculo;

public class Camion extends Vehiculo {
	private int capacidadCarga;
	
	public Camion(String marca, String modelo, int matricula,int capacidadCarga) {
		super(marca, modelo, matricula);
		this.capacidadCarga=capacidadCarga;
	}
	public void cargar() {}
	

	public int getCapacidadCarga() {
		return capacidadCarga;
	}
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "Camion [capacidadCarga=" + capacidadCarga + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getMatricula()=" + getMatricula() + "]";
	}
	
	
}


