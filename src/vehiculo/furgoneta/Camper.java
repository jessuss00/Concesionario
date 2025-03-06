package vehiculo.furgoneta;

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
	
	
	
}
