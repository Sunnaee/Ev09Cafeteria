package model;

public enum IngredienteOpcional {
	CREMA("Crema"),
	LECHE("Leche"),
	CHOCOLATE("Chocolate");
	private String ingredienteOpcional;

	public String getIngredienteOpcional() {
		return this.ingredienteOpcional;
	}

	private IngredienteOpcional(String ingredienteOpcional){
		this.ingredienteOpcional = ingredienteOpcional;
	}
}