package Unidades;

public class Pheach extends Unidad {
	private int contadorErrados = 0;
	private boolean enfurecido = false;
	
	public Pheach() {
		super(138, 28, 1, 2);
	}
	
	public Pheach(double ubicacion) {
		super(138, 28, 1, 2, ubicacion);
	}
	
	public boolean getEnfurecido() {
		return enfurecido;
	}

	@Override
	public boolean atacar(Unidad unidad) {
		double ataqueTotal = this.getAtaque();
		if (contadorErrados % 4 == 0) {
			contadorErrados++;
			return false;
		}
		
		if (enfurecido) {
			ataqueTotal *= 3;
			enfurecido = false;
		}
		
		contadorErrados++;
		return false;
	}

	@Override
	public void recibirAtaque(double ataque) {
		enfurecido = true;
		
	}

	@Override
	public void descansar() {
		// TODO Auto-generated method stub
		
	}
}
