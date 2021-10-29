package com.mymaquina.dominio;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pruebitas {

	private Maquina m;

	@Test
	public void ComprarSinQueHayaProductos() {
		
		Refrescos[] ref = new Refrescos[3];
		ref[0]=new Refrescos("cocacola", 0.8, 0);//no hay productos
		ref[1]=new Refrescos("agua", 0.5, 0);
		ref[2]=new Refrescos("zumo", 0.7, 0);
		
		m= new Maquina(10, ref);
		boolean esperado=false;
		boolean resulado= m.comprarRefrescos(1, 1, 0);
		if(esperado!=resulado) {
			fail("Error porque no habia productos");
		}
	}
	
	@Test
	public void ComprarSinQueHayaCambios() {
		
		Refrescos[] ref = new Refrescos[3];
		ref[0]=new Refrescos("cocacola", 0.8, 10);
		ref[1]=new Refrescos("agua", 0.5, 10);
		ref[2]=new Refrescos("zumo", 0.7, 10);
		
		m= new Maquina(0, ref);//no hay cambios
		boolean esperado=false;
		boolean resulado= m.comprarRefrescos(1, 1, 0);
		if(esperado!=resulado) {
			fail("Error porque no habia cambios");
		}
	}
	
	@Test
	public void ComprarSinMeterSuficienteDinero() {
		
		Refrescos[] ref = new Refrescos[3];
		ref[0]=new Refrescos("cocacola", 0.8, 10);
		ref[1]=new Refrescos("agua", 0.5, 10);
		ref[2]=new Refrescos("zumo", 0.7, 10);
		
		m= new Maquina(10, ref);
		boolean esperado=false;
		boolean resulado= m.comprarRefrescos(1, 0.5, 0);//no suficiente dinero
		if(esperado!=resulado) {
			fail("Error porque habias metido menos dinero");
		}
	}
	
	@Test
	public void ComprarConTodoBien() {
		
		Refrescos[] ref = new Refrescos[3];
		ref[0]=new Refrescos("cocacola", 0.8, 10);
		ref[1]=new Refrescos("agua", 0.5, 10);
		ref[2]=new Refrescos("zumo", 0.7, 10);
		
		m= new Maquina(10, ref);
		boolean esperado=true;
		boolean resulado= m.comprarRefrescos(1, 1.5, 1);
		double cambioEsperado= 10.5;
		double cambioResultado= m.getCambios();
		if(esperado!=resulado || cambioEsperado!= cambioResultado) {
			fail("Error porque esta todo bien");
		}
		else {
			System.out.println(ref[1]);
		}
	}
	
	@Test
	public void RecargarProductosNegativos() {
		
		Refrescos[] ref = new Refrescos[3];
		ref[0]=new Refrescos("cocacola", 0.8, 10);
		ref[1]=new Refrescos("agua", 0.5, 10);
		ref[2]=new Refrescos("zumo", 0.7, 10);
		
		m= new Maquina(10, ref);
		
		boolean esperado=false;
		boolean resulado= ref[1].recargarRefrescos(-5);//no se puede cargar negativo

		if(esperado!=resulado) {
			fail("Error porque habias metido refrescos negativos");
		}
	}
	
	@Test
	public void RecargarProductosPositivo() {
		
		Refrescos[] ref = new Refrescos[3];
		ref[0]=new Refrescos("cocacola", 0.8, 10);
		ref[1]=new Refrescos("agua", 0.5, 10);
		ref[2]=new Refrescos("zumo", 0.7, 10);
		
		m= new Maquina(10, ref);
		
		boolean esperado=true;
		boolean resulado= ref[1].recargarRefrescos(5);// cargar positivo

		if(esperado!=resulado) {
			fail("Error porque habias recargado bien");
		}
		else {
			System.out.println(ref[1]);
		}
	}
	

}
