package guis;

import model.Cafeteria;

import javax.swing.*;

public class VistaAgregar extends JFrame {

    private JPanel mainPanel2;

    public VistaAgregar(Cafeteria cafeteria, VistaCafeteria vistaCafeteria){
        setTitle("Agregar café");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        add(mainPanel2);
    }
}
