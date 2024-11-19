package gestordatos;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Cafe;
import model.Cafeteria;
import java.io.File;

import java.util.ArrayList;
import java.util.List;

public class GestorDatos {

	private static final ObjectMapper mapper = new ObjectMapper();

	public static List<Cafe> cargarDatosCafes(String nombreArchivo) {
		try {
			return mapper.readValue(new File(nombreArchivo),
					mapper.getTypeFactory().constructCollectionType(ArrayList.class, Cafe.class));
		} catch (Exception e) {
			System.err.println("Error al leer los cafes desde " + nombreArchivo + ": " + e.getMessage());
			return null;
		}
	}

	public static void guardarDatosCafes(List<Cafe> cafes, String nombreArchivo) {
		try {
			mapper.writeValue(new File(nombreArchivo), cafes);
		} catch (Exception e) {
			System.err.println("Error al guardar los cafes en " + nombreArchivo + ": " + e.getMessage());
		}
	}

	public static void guardarDatosCafeteria(Cafeteria cafeteria, String nombreArchivo) {
		try {
			mapper.writeValue(new File(nombreArchivo), cafeteria);
		} catch (Exception e) {
			System.err.println("Error al guardar la cafeteria en " + nombreArchivo + ": " + e.getMessage());
		}
	}

	public static Cafeteria cargarDatosCafeteria(String nombreArchivo) {
		try {
			return mapper.readValue(new File(nombreArchivo), Cafeteria.class);
		} catch (Exception e) {
			System.err.println("Error al leer el personaje desde " + nombreArchivo + ": " + e.getMessage());
			return null;
		}
	}

}