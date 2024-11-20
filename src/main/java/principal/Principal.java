package principal;

import controller.CafeteriaController;
import guis.VistaCafeteria;
import model.Cafe;
import model.Cafeteria;
import model.IngredienteOpcional;
import model.Tamano;

public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.run();
    }

    public void run(){
        Cafeteria cafeteria = new Cafeteria();
        cafeteria = CafeteriaController.cargarCafeteria();
//        Cafe cafe1 = new Cafe("Cafe1",100,100, Tamano.PEQUENO, IngredienteOpcional.CHOCOLATE);
//        Cafe cafe2 = new Cafe("Cafe2",200,200, Tamano.GRANDE, IngredienteOpcional.LECHE);
//        cafeteria.agregarCafe(cafe1);
//        cafeteria.agregarCafe(cafe2);
//        CafeteriaController.guardarDatos(cafeteria);

        CafeteriaController.cargarDatos(cafeteria);
        VistaCafeteria vistaCafeteria = new VistaCafeteria(cafeteria);
        vistaCafeteria.setVisible(true);
    }
}
