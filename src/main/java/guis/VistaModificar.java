package guis;

import controller.CafeteriaController;
import model.Cafeteria;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaModificar extends JFrame {


    private JPanel panelModificar;
    private JLabel textNuevoNombre;
    private JTextField ingresoNuevoNombre;
    private JLabel textNuevaDireccion;
    private JTextField ingresoNuevaDireccion;
    private JLabel textNuevaRedSocial;
    private JTextField ingresoNuevaRedSocial;
    private JTable tablaCafeteria;
    private JButton confirmarCambiosButton;

    public VistaModificar(Cafeteria cafeteria, VistaCafeteria vistaCafeteria){
        setSize(600, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        add(panelModificar);

        String[] columnas = {"Nombre", "Dirección", "Red Social"};

        DefaultTableModel model = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaCafeteria.setModel(model);
        cargarDatosCafeteria(cafeteria);
        confirmarCambiosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modificarCafeteria(cafeteria);
                cargarDatosCafeteria(cafeteria);
                dispose();
            }
        });
    }

    public void modificarCafeteria(Cafeteria cafeteria) {
        String nombreNuevo = ingresoNuevoNombre.getText();
        String direccion = ingresoNuevaDireccion.getText();
        String redSocial = ingresoNuevaRedSocial.getText();
        CafeteriaController.modificarCafeteria(cafeteria, nombreNuevo, direccion, redSocial);
        CafeteriaController.guardarCafeteria(cafeteria);
    }

    public void cargarDatosCafeteria (Cafeteria cafeteria) {
        DefaultTableModel model = (DefaultTableModel) tablaCafeteria.getModel();
        model.setRowCount(0);
        model.addRow(new Object[] { cafeteria.getNombre(), cafeteria.getDireccion(), cafeteria.getRedSocial() });
    }


}
