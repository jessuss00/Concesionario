package vehiculo.coche;

public class Sedan extends Coche {
	private int puertas;
	
	public Sedan(String marca, String modelo, int matricula, Combustible combustible,int puertas) {
		super(marca, modelo, matricula, combustible);
		this.puertas=puertas;
	}

	@Override
	public String toString() {
		return "Sedan [puertas=" + puertas + ", getCombustible()=" + getCombustible() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getMatricula()=" + getMatricula() + "]";
	}

	
	
}
