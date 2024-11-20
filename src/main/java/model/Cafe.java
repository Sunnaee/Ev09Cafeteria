package model;

public class Cafe {

	private String nombre;
	private int cantidadGramos;
	private int mililitrosAgua;
	private Tamano tamano;
	private IngredienteOpcional ingredienteOpcional;

	public Cafe(String nombre, int cantidadGramos, int mililitrosAgua, Tamano tamano, IngredienteOpcional ingredienteOpcional) {
		this.nombre = nombre;
		this.cantidadGramos = cantidadGramos;
		this.mililitrosAgua = mililitrosAgua;
		this.tamano = tamano;
		this.ingredienteOpcional = ingredienteOpcional;
	}

	public Cafe(){
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadGramos() {
		return this.cantidadGramos;
	}

	public void setCantidadGramos(int cantidadGramos) {
		this.cantidadGramos = cantidadGramos;
	}

	public int getMililitrosAgua() {
		return this.mililitrosAgua;
	}

	public void setMililitrosAgua(int mililitrosAgua) {
		this.mililitrosAgua = mililitrosAgua;
	}

	public Tamano getTamano(){
		return this.tamano;
	}

	public IngredienteOpcional getIngredienteOpcional(){
		return this.ingredienteOpcional;
	}
}