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
	
	public void recargarRefrescos(int cantidad) {
		this.cantidad= (cantidad+this.cantidad);
	}


	@Override
	public String toString() {
		return "Refrescos [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
	


	
}
