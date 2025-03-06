package vehiculo.ciclomotor;

public class Quad extends Ciclomotor {

	private String tamaño;
  private boolean ruedaDelanteraElevada;
	
	public Quad(String marca, String modelo, int matricula, int cilindrada, String tamaño) {
		super(marca, modelo, matricula, cilindrada);
		this.tamaño=tamaño;
    this.ruedaDelanteraElevada = false;
	}

	@Override
	public String toString() {
		return "Quad [tamaño=" + tamaño + ", getCilindrada()=" + getCilindrada() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getMatricula()=" + getMatricula() + "]";
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
