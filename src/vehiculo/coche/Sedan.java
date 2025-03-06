package vehiculo.coche;

public class Sedan extends Coche {
	private int puertas;
  private boolean frenosTraseros;
	
	public Sedan(String marca, String modelo, int matricula,int velocidadActual, Combustible combustible,int puertas) {
		super(marca, modelo, matricula, velocidadActual, combustible);
		this.puertas=puertas;
	}
	
	@Override
	public void acelerar() {
		do {
			System.out.println("Dale a la sedan compi");
			System.out.println(getVelocidadActual());
			setVelocidadActual(getVelocidadActual()+5);
			System.out.println(getVelocidadActual());
		} while (getVelocidadActual()<120);
		
	}

	@Override
	public String toString() {
		return "Sedan [puertas=" + puertas + ", getCombustible()=" + getCombustible() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getMatricula()=" + getMatricula() + "]";
	}

	@Override
	public void frenarTraseros() {
		if (frenosTraseros == false) {
			System.out.println("El coche esta empezando ha derrapando");
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
