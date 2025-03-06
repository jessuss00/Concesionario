package vehiculo;

public abstract class Vehiculo {

	private String marca;
	private String modelo;
	private int matricula;
	private int velocidadActual;
	
	

	public Vehiculo(String marca, String modelo, int matricula, int velocidadActual) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.velocidadActual=velocidadActual;
	}
	public abstract void acelerar();
	
	

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public int getVelocidadActual() {
		return velocidadActual;
	}
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
