package vehiculo.furgoneta;

import vehiculo.ciclomotor.Moto;

public class Camper extends Furgoneta {
	

	private String descripcion;

	
	public Camper(String marca, String modelo, int matricula,int velocidadActual, Tipo tipo,String descripcion) {
		super(marca, modelo, matricula, velocidadActual, tipo);
		this.descripcion=descripcion;
	}
	
	
	@Override
	public void acelerar() {
		do {
			System.out.println("Dale a la furgo compi");
			System.out.println(getVelocidadActual());
			setVelocidadActual(getVelocidadActual()+5);
			System.out.println(getVelocidadActual());
		} while (getVelocidadActual()<120);
		
	}


	@Override
	public String toString() {
		return "Camper [descripcion=" + descripcion + ", getTipo()=" + getTipo() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getMatricula()=" + getMatricula() + "]";
	}
	@Override
	public boolean equals(Object otro) {// compara this con otro
		Camper camper = (Camper) otro;
		boolean iguales;
		if (this.getMarca() == (camper.getMarca()) && this.getModelo() == camper.getModelo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}
	
	
}
