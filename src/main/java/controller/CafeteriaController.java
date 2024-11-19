package controller;

import gestordatos.GestorDatos;
import model.*;


public class CafeteriaController {


	public static Cafeteria cargarDatos(Cafeteria cafeteria) {
		cafeteria.setCafes(GestorDatos.cargarDatosCafes("cafes.json"));
		return cafeteria;
	}

	public static Cafeteria agregarCafe(Cafeteria cafeteria, Cafe cafe) {
		cafeteria.agregarCafe(cafe);
		return cafeteria;
	}

	public static void descontinuarCafe(Cafeteria cafeteria, int index) {
		cafeteria.descontinuarCafe(index);
	}

	public static void guardarDatos(Cafeteria cafeteria) {
		GestorDatos.guardarDatosCafes(cafeteria.getCafes(), "cafes.json");
	}

	public static Cafeteria modificarCafeteria(Cafeteria cafeteria, String nombreNuevo, String direccionNueva, String redSocialNueva) {
		cafeteria.setNombre(nombreNuevo);
		cafeteria.setDireccion(direccionNueva);
		cafeteria.setRedSocial(redSocialNueva);
		return cafeteria;
	}

}