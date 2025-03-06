package vehiculo.coche;

public class Ranchera extends Coche {
	private int capacidadMaletero;

	public Ranchera(String marca, String modelo, int matricula, Combustible combustible, int capacidadMaletero) {
		super(marca, modelo, matricula, combustible);
		this.capacidadMaletero=capacidadMaletero;
	}

	@Override
	public String toString() {
		return "Ranchera [capacidadMaletero=" + capacidadMaletero + ", getCombustible()=" + getCombustible()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getMatricula()=" + getMatricula()
				+ "]";
	}
	
	

}
