package guis;

import model.Cafeteria;

import javax.swing.*;

public class VistaCafeteria extends JFrame {
    private JPanel mainPanel;
    private JTable table1;
    private JButton agregarCafeButton;
    private JButton guardarDatosButton;
    private JButton modificarCafeteriaButton;
    private JButton descontinuarCafeButton;

    public VistaCafeteria(Cafeteria cafeteria){
        setTitle("Cafetería ^^");
        setSize(650, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        add(mainPanel);

        String[] columnas = { "Nombre", "Cantidad de gramos", "Mililitros de agua", "Tamaño", "Ingredientes opcionales" };

    }
}
