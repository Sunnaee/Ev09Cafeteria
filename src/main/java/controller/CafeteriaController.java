package controller;

import gestordatos.GestorDatos;
import model.*;


public class CafeteriaController {


	public static Cafeteria cargarDatos(Cafeteria cafeteria) {
		cafeteria.setCafes(GestorDatos.cargarDatosCafes("cafes.json"));
		return cafeteria;
	}

	/**
	 * 
	 * @param cafeteria
	 * @param cafe
	 */
	public static Cafeteria agregarCafe(Cafeteria cafeteria, Cafe cafe) {
		// TODO - implement CafeteriaController.agregarCafe
		throw new UnsupportedOperationException();
	}

	public static void descontinuarCafe(Cafeteria cafeteria, int index) {
		cafeteria.descontinuarCafe(index);
	}

	public static void guardarDatos(Cafeteria cafeteria) {
		GestorDatos.guardarDatosCafes(cafeteria.getCafes(), "cafes.json");
	}

	/**
	 * 
	 * @param cafeteria
	 * @param nombreNuevo
	 * @param direccionNueva
	 * @param redSocialNueva
	 */
	public static void modficarCafeteria(Cafeteria cafeteria, String nombreNuevo, String direccionNueva, String redSocialNueva) {
		// TODO - implement CafeteriaController.modficarCafeteria
		throw new UnsupportedOperationException();
	}

}