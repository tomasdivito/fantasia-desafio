package Unidades;

public class Pheach extends Unidad {
	public Pheach() {
		super(138, 28, 1, 2);
	}
	
	public Pheach(double ubicacion) {
		super(138, 28, 1, 2, ubicacion);
	}

	@Override
	public boolean atacar(Unidad unidad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void recibirAtaque(double ataque) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descansar() {
		// TODO Auto-generated method stub
		
	}
}
