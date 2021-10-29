package com.mymaquina.dominio;

public class Maquina {
	private Refrescos[] refrescos;
	private double cambios;
	private int refrescosVendidos;
	private double dineroGanado;
	
	public Maquina(double cambios, Refrescos[]refrescos ) {
		super();
		this.cambios = cambios;
		this.refrescos= refrescos;
		dineroGanado=0.0;
		refrescosVendidos=0;
	}


	public double getCambios() {
		return cambios;
	}


	
	public boolean comprarRefrescos(int cantidad, double dinero, int posicion) {
		boolean a=true;
		if(dinero*cantidad<refrescos[posicion].getPrecio()*cantidad || cantidad>refrescos[posicion].getCantidad()
				|| dinero*cantidad - refrescos[posicion].getPrecio()*cantidad > cambios) {
			a=false;
			System.out.println("No se puede comprar");
		}
		else {
			int valor= refrescos[posicion].getCantidad()-cantidad;
			refrescos[posicion].setCantidad(valor);
			this.cambios+=refrescos[posicion].getPrecio()*cantidad;
			refrescosVendidos+=cantidad;
			dineroGanado+=refrescos[posicion].getPrecio()*cantidad;
		}
		return a;
	}
	
	public void informeRefrescosVendidos() {
		System.out.println("Refrescos vendidos: "+refrescosVendidos+" y Dinero ganado: "+dineroGanado);
	}
	
	public void estadoRefresco(int posicion) {
		System.out.println("Refrescos que quedan en la posicion ("+ posicion+"): "+refrescos[posicion].getCantidad()+" y Dinero que queda en la maquina: "+cambios);
	}
}
