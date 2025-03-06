package vehiculo.camion;


import vehiculo.Vehiculo;

public class Camion extends Vehiculo {
	private int capacidadCarga;
	private int codPaquete;
	private int[] paquetes ;

	
	public Camion(String marca, String modelo, int matricula, int velocidadActual,int capacidadCarga) {
		super(marca, modelo, matricula,velocidadActual);
		this.capacidadCarga=capacidadCarga;
		paquetes = new int[capacidadCarga];
	}
	
	public void cargar(int nPaquetes) {
		if (nPaquetes==0) {
			System.out.println("El camion esta vacio");
		}else {
			for (int i = 1; i < nPaquetes; i++) {
				codPaquete=i;
				paquetes[i]=codPaquete;
			}
			
			System.out.println("Códigos de los paquetes en el camión:");
	        for (int i = 0; i < nPaquetes; i++) {
	            System.out.println(paquetes[i]);
	        }
		}
	}
	
	
	
	

	public int getCapacidadCarga() {
		return capacidadCarga;
	}
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "Camion [capacidadCarga=" + capacidadCarga + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getMatricula()=" + getMatricula() + "]";
	}
	
	
}


