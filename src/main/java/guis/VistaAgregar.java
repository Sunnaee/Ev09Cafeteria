package guis;

import controller.CafeteriaController;
import model.Cafe;
import model.Cafeteria;
import model.IngredienteOpcional;
import model.Tamano;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaAgregar extends JFrame {

    private JPanel mainPanel2;
    private JTextField textNombre;
    private JTextField textGramos;
    private JTextField textMililitros;
    private JComboBox<String> campoTamano;
    private JComboBox<String> campoIngredienteOpcional;
    private JLabel nombre;
    private JLabel gramos;
    private JLabel mililitros;
    private JLabel tamano;
    private JLabel ingredienteOpcional;
    private JButton confirmarButton;

    public VistaAgregar(Cafeteria cafeteria, VistaCafeteria vistaCafeteria){
        setTitle("Agregar café");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        add(mainPanel2);

        for (Tamano tamano : Tamano.values()) {
            campoTamano.addItem(tamano.toString());
        }

        for (IngredienteOpcional ingrediente : IngredienteOpcional.values()) {
            campoIngredienteOpcional.addItem(ingrediente.toString());
        }
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarCafe(cafeteria);
                vistaCafeteria.cargarDatos(cafeteria);
                dispose();
            }
        });
    }

    public void guardarCafe(Cafeteria cafeteria) {
        String nombre = textNombre.getText();
        int gramos = Integer.parseInt(textGramos.getText());
        int mililitros = Integer.parseInt(textMililitros.getText());
        String tamano = (String) campoTamano.getSelectedItem();
        String ingrediente = (String) campoIngredienteOpcional.getSelectedItem();
        Tamano tamanoSel = Tamano.valueOf(tamano);
        IngredienteOpcional ingredienteSel = IngredienteOpcional.valueOf(ingrediente);

        Cafe cafeNuevo = new Cafe(nombre,gramos,mililitros,tamanoSel,ingredienteSel);

        CafeteriaController.agregarCafe(cafeteria,cafeNuevo);
    }

}
