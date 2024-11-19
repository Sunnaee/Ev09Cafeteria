package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {

    Cafeteria cafeteria = new Cafeteria("Cafeteria", "Direccion", "RedSocial");
    Cafe cafe1 = new Cafe("Cafe", 10, 10, Tamano.PEQUENO, IngredienteOpcional.CHOCOLATE);
    Cafe cafe2 = new Cafe("Cafe2", 20, 20, Tamano.MEDIANO, IngredienteOpcional.CREMA);
    List<Cafe> cafes = new ArrayList<>();

    @BeforeEach
    void setUp() {
        cafes.add(cafe1);
        cafes.add(cafe2);
    }

    @Test
    void agregarCafe() {
        cafeteria.agregarCafe(cafe1);
        assertEquals(1, cafeteria.getCafes().size());
        cafeteria.agregarCafe(cafe2);
        assertEquals(2, cafeteria.getCafes().size());
    }

    @Test
    void getCafes() {
        cafeteria.agregarCafe(cafe1);
        cafeteria.agregarCafe(cafe2);
        assertIterableEquals(cafes, cafeteria.getCafes());
    }

    @Test
    void descontinuarCafe() {
        cafeteria.agregarCafe(cafe1);
        cafeteria.agregarCafe(cafe2);
        cafeteria.descontinuarCafe(0);
        assertEquals(1, cafeteria.getCafes().size());
        cafeteria.descontinuarCafe(0);
        assertEquals(0, cafeteria.getCafes().size());
    }

    @Test
    void modificarCafeteria() {
        cafeteria.modificarCafeteria("Cafeteria2", "Direccion2", "RedSocial2");
        assertEquals("Cafeteria2", cafeteria.getNombre());
        assertEquals("Direccion2", cafeteria.getDireccion());
        assertEquals("RedSocial2", cafeteria.getRedSocial());
    }
}