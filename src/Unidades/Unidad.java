package Unidades;

public abstract class Unidad {
	private double x;
	private double salud;
	private double ataqueBase;
	private double[] rango = new double[2];
	
	public Unidad(double saludInicial, double ataqueBase, double[] rango) {
		this.salud = saludInicial;
		this.ataqueBase = ataqueBase;
		this.x = 0;
		this.rango = rango;
	}
	
	public Unidad(double saludInicial, double ataqueBase, double[] rango, double x) {
		this.salud = saludInicial;
		this.ataqueBase = ataqueBase;
		this.x = x;
		this.rango = rango;
	}
	
	public double[] getRango() {
		return rango;
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
	
	public abstract void atacar(Unidad unidad);
	public abstract void recibirAtaque(double ataque);
	public abstract void descansar();
}
