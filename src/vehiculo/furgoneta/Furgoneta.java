package vehiculo.furgoneta;

import vehiculo.Vehiculo;

public class Furgoneta extends Vehiculo {
	private Tipo tipo;
	
	public Furgoneta(String marca, String modelo, int matricula, Tipo tipo) {
		super(marca, modelo, matricula);
		this.tipo=tipo;
	}

	
	

	public Tipo getTipo() {
		return tipo;
	}




	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}

}
