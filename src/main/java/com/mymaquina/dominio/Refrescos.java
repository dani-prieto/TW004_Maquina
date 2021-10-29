package com.mymaquina.dominio;

public class Refrescos {

	private String nombre;
	private double precio;
	private int cantidad;
	

	public Refrescos(String nombre, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}


	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String getNombre() {
		return nombre;
	}


	public double getPrecio() {
		return precio;
	}
	
	public boolean recargarRefrescos(int cantidad) {
		boolean t= true;
		if(cantidad<0) {
			System.out.println("no se puede recargar negativo");
			t=false;
		}else {
			this.cantidad= (cantidad+this.cantidad);
		}
		return t;
	}


	@Override
	public String toString() {
		return "Refrescos [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
	


	
}
