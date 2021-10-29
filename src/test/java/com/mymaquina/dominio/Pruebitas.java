package com.mymaquina.dominio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
			fail("Error porque no habia productos");
		}
	}

}
