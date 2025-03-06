package vehiculo.ciclomotor;

public class Moto extends Ciclomotor {

	private String tipo;
	private boolean ruedaDelanteraElevada;


	
	public Moto(String marca, String modelo, int matricula, int velocidadActual, int cilindrada,String tipo) {
		super(marca, modelo, matricula, cilindrada,  velocidadActual);
		this.tipo=tipo;
    this.ruedaDelanteraElevada = false;

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

}
