package vehiculo.furgoneta;

import vehiculo.Vehiculo;

public class Furgoneta extends Vehiculo {
	private Tipo tipo;
	
	public Furgoneta(String marca, String modelo, int matricula,int velocidadActual, Tipo tipo) {
		super(marca, modelo, matricula, velocidadActual);
		this.tipo=tipo;
	}

	
	

	public Tipo getTipo() {
		return tipo;
	}




	@Override
	public void acelerar() {
		do {
			System.out.println("Dale a la furgo compi");
			setVelocidadActual(getVelocidadActual()+1);
		} while (getVelocidadActual()<=120);
		
	}

}
