package model;

import java.util.*;
import java.util.ArrayList;
import model.Cafe;

public class Cafeteria {
	private String nombre;
	private String direccion;
	private String redSocial;
	private ArrayList<Cafe> cafes = new ArrayList<Cafe>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRedSocial() {
		return this.redSocial;
	}

	public void setRedSocial(String redSocial) {
		this.redSocial = redSocial;
	}

	public void agregarCafe(Cafe cafe) {
		throw new UnsupportedOperationException();
	}

	public List<Cafe> obtenerListaCafe() {
		throw new UnsupportedOperationException();
	}

	public void descontinuarCafe(Cafe cafe) {
		throw new UnsupportedOperationException();
	}

	public void modificarCafeteria(String nombreNueva, String direccionNueva, String redSocialNueva) {
		throw new UnsupportedOperationException();
	}
}