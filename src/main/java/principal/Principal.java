package principal;

import controller.CafeteriaController;
import guis.VistaCafeteria;
import model.Cafe;
import model.Cafeteria;

public class Principal {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Cafeteria cafeteria = new Cafeteria();
        CafeteriaController.cargarDatos(cafeteria);
        VistaCafeteria vistaCafeteria = new VistaCafeteria(cafeteria);
        vistaCafeteria.setVisible(true);
    }
}
