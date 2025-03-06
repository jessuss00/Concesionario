package vehiculo.ciclomotor;

public class Quad extends Ciclomotor {

	private String tamaño;
	private boolean ruedaDelanteraElevada;

	public Quad(String marca, String modelo, int matricula, int velocidadActual, int cilindrada, String tamaño) {
		super(marca, modelo, matricula, cilindrada,  velocidadActual);
		this.tamaño = tamaño;
		this.ruedaDelanteraElevada = false;
	}
	
	@Override
	public void acelerar() {
		do {
			System.out.println("Dale al puño compi");
			System.out.println(getVelocidadActual());
			setVelocidadActual(getVelocidadActual()+5);
			System.out.println(getVelocidadActual());
		} while (getVelocidadActual()<120);
		
	}

	@Override
	public String toString() {
		return "Quad [tamaño=" + tamaño + ", getCilindrada()=" + getCilindrada() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getMatricula()=" + getMatricula() + "]";
	}

	@Override
	public void subirCaballito() {
		if (ruedaDelanteraElevada == false) {
			System.out.println("La moto acaba de empezar a hacer el caballito");
			ruedaDelanteraElevada = true;
		} else {
			System.out.println("La moto ya esta haciendo el caballito");
		}
	}  

	@Override
	public void bajarCaballito() {
		if (ruedaDelanteraElevada == true) {
			System.out.println("La moto ha dejado de hacer el caballito");
			ruedaDelanteraElevada = false;
		} else {
			System.out.println("La moto no esta haciendo el caballito");

		}
	}
	
	@Override
	public boolean equals(Object otro) {// compara this con otro
		Quad quad = (Quad) otro;
		boolean iguales;
		if (this.getMarca() == (quad.getMarca()) && this.getModelo() == quad.getModelo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}
	
}
