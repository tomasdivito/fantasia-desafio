package Unidades;

public abstract class Unidad {
	private double saludInicial;
	private double ataqueBase;
	
	public Unidad(double saludInicial, double ataqueBase) {
		this.saludInicial = saludInicial;
		this.ataqueBase = ataqueBase;
	}
	
	public abstract void atacar(Unidad unidad);
	public abstract void recibirAtaque(double ataque);
	public abstract void descansar();
}
