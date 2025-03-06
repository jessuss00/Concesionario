package vehiculo;

public abstract class Vehiculo {

	private String marca;
	private String modelo;
	private int matricula;
	
	

	public Vehiculo(String marca, String modelo, int matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}
	public abstract void acelerar();
	

	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getMatricula() {
		return matricula;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + "]";
	}
	
	

}
