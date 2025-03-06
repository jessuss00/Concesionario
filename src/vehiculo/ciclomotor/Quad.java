package vehiculo.ciclomotor;

public class Quad extends Ciclomotor {
	private String tamaño;
	
	public Quad(String marca, String modelo, int matricula, int cilindrada, String tamaño) {
		super(marca, modelo, matricula, cilindrada);
		this.tamaño=tamaño;
	}

	@Override
	public String toString() {
		return "Quad [tamaño=" + tamaño + ", getCilindrada()=" + getCilindrada() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getMatricula()=" + getMatricula() + "]";
	}
	
	

	
}
