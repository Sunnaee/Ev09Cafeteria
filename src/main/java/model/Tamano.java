package model;

public enum Tamano {
	PEQUENO("Pequeño"),
	MEDIANO("Mediano"),
	GRANDE("Grande");
	private String tamano;

	public String getTamano() {
		return this.tamano;
	}

	private Tamano(String tamano){
		this.tamano = tamano;
	}
}