package vehiculo.ciclomotor;

public class Moto extends Ciclomotor {
	

	private String tipo;
	
	public Moto(String marca, String modelo, int matricula, int cilindrada,String tipo) {
		super(marca, modelo, matricula, cilindrada);
		this.tipo=tipo;
	}
}
