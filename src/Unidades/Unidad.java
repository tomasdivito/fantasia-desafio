package Unidades;

public abstract class Unidad {
	private double x;
	private double salud;
	private double ataqueBase;
	private double rangoMinimo;
	private double rangoMaximo;
	
	public Unidad(double saludInicial, double ataqueBase, double rangoMinimo, double rangoMaximo) {
		this.salud = saludInicial;
		this.ataqueBase = ataqueBase;
		this.x = 0;
		this.rangoMinimo = rangoMinimo;
		this.rangoMaximo = rangoMaximo;
	}
	
	public Unidad(double saludInicial, double ataqueBase, double rangoMinimo, double rangoMaximo, double x) {
		this.salud = saludInicial;
		this.ataqueBase = ataqueBase;
		this.x = x;
		this.rangoMinimo = rangoMinimo;
		this.rangoMaximo = rangoMaximo;
	}
	
	public double getRangoMinimo() {
		return rangoMinimo;
	}
	
	public double getRangoMaximo() {
		return rangoMaximo;
	}
	
	public double getUbicacion() {
		return x;
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
	
	public abstract boolean atacar(Unidad unidad);
	public abstract void recibirAtaque(double ataque);
	public abstract void descansar();
}
