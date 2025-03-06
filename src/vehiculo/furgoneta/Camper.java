package vehiculo.furgoneta;

public class Camper extends Furgoneta {
	

	private String descripcion;

	
	public Camper(String marca, String modelo, int matricula, Tipo tipo,String descripcion) {
		super(marca, modelo, matricula, tipo);
		this.descripcion=descripcion;
	}


	@Override
	public String toString() {
		return "Camper [descripcion=" + descripcion + ", getTipo()=" + getTipo() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getMatricula()=" + getMatricula() + "]";
	}
	
	
	
}
