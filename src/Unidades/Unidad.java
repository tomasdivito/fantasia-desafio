package Unidades;

public abstract class Unidad {
	private double salud;
	private double ataqueBase;
	
	public Unidad(double saludInicial, double ataqueBase) {
		this.salud = saludInicial;
		this.ataqueBase = ataqueBase;
	}
	
	public double getSalud() {
		return salud;
	}
	
	public void setSalud(double salud) {
		this.salud = salud;
	}
	
	public double getAtaque() {
		return ataqueBase;
	}
	
	public abstract void atacar(Unidad unidad);
	public abstract void recibirAtaque(double ataque);
	public abstract void descansar();
}
