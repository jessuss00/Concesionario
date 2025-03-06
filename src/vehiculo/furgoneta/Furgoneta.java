package vehiculo.furgoneta;

import vehiculo.Vehiculo;

public abstract class Furgoneta extends Vehiculo {
	private Tipo tipo;
	
	public Furgoneta(String marca, String modelo, int matricula,int velocidadActual, Tipo tipo) {
		super(marca, modelo, matricula, velocidadActual);
		this.tipo=tipo;
	}


	public Tipo getTipo() {
		return tipo;
	}







}
