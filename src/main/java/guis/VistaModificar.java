package guis;

import model.Cafeteria;

import javax.swing.*;

public class VistaModificar extends JFrame {


    private JPanel mainPanel3;

    public VistaModificar(Cafeteria cafeteria, VistaCafeteria vistaCafeteria){
        setTitle("Modificar cafetería");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        add(mainPanel3);
    }
}
