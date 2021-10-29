package com.mymaquina.dominio;

public class Prueba {
	
	public static void main(String[] args) {
		Refrescos[] ref = new Refrescos[3];
		ref[0]=new Refrescos("cocacola", 0.8, 10);
		ref[1]=new Refrescos("agua", 0.5, 15);
		ref[2]=new Refrescos("zumo", 0.7, 5);
		
		Maquina ma = new Maquina(10, ref);
		
		ma.comprarRefrescos(2, 2.0, 0);
		ma.comprarRefrescos(5, 4.0, 2);
		
		System.out.println(ref[0]);
		
		ma.estadoRefresco(0);
		ma.informeRefrescosVendidos();
	}
}
