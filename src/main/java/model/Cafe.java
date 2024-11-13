package model;

public class Cafe {
	private int cantidadGramos;
	private int mililitrosAgua;
	private Tamano tamano;
	private IngredienteOpcional ingredienteOpcional;

	public int getCantidadGramos() {
		return this.cantidadGramos;
	}

	public void setCantidadGramos(int cantidadGramos) {
		this.cantidadGramos = cantidadGramos;
	}

	public int getMililitrosAgua() {
		throw new UnsupportedOperationException();
	}

	public void setMililitrosAgua(iny mililitrosAgua) {
		throw new UnsupportedOperationException();
	}
}