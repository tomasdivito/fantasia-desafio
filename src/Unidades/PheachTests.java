package Unidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class PheachTests {
	
	@Test
	public void inicializarClase() {
		Pheach p = new Pheach();
		Pheach p2 = new Pheach(10);

		assertEquals(false, p.atacar(p2));
		assertEquals(false, p.atacar(p2));
	}
	
	public void unoDeCadaCuatroLoVaAErrar() {
		Pheach p = new Pheach();
		Pheach p2 = new Pheach(2);
		
		assertEquals(false, p.atacar(p2));
		assertEquals(true, p.atacar(p2));
		assertEquals(true, p.atacar(p2));
		assertEquals(true, p.atacar(p2));
		assertEquals(false, p.atacar(p2));
	}
	
	public void noPuedeAtacarFueraDeRango() {
		Pheach p = new Pheach();
		Pheach p2 = new Pheach(3);

		assertEquals(false, p.atacar(p2));
		assertEquals(false, p.atacar(p2));
	}
	
	public void puedeAtacarEnRango() {
		Pheach p = new Pheach();
		Pheach p2 = new Pheach(2);
		
		assertEquals(false, p.atacar(p2));
		assertEquals(true, p.atacar(p2));
	}
	
	public void serAtacadoActivaEnfurece() {
		Pheach p = new Pheach();
		assertEquals(false, p.getEnfurecido());
		p.recibirAtaque(10);
		assertEquals(true, p.getEnfurecido());
	}
	
	public void errarNoQuitaLoEnfurecido() {
		Pheach p = new Pheach();
		Pheach p2 = new Pheach(2);
		
		p.recibirAtaque(10);
		p.atacar(p2);
		assertEquals(true, p.getEnfurecido());
		p.atacar(p2);
		assertEquals(false, p.getEnfurecido());
	}
	
	public void atacarDeberiaQuitarLoEnfurecido() {
		Pheach p = new Pheach();
		Pheach p2 = new Pheach(2);
	}
	
	public void erraUnAtaqueEn4() {
		Pheach p = new Pheach();
	}
}
