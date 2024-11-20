package guis;

import controller.CafeteriaController;
import model.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaCafeteria extends JFrame {
    private JPanel mainPanel;
    private JTable tablaCafes;
    private JButton agregarCafeButton;
    private JButton guardarDatosButton;
    private JButton modificarCafeteriaButton;
    private JButton descontinuarCafeButton;

    public VistaCafeteria(Cafeteria cafeteria){
        setTitle("Cafetería ^^");
        setSize(850, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        add(mainPanel);

        String[] columnas = { "Nombre", "Cantidad de gramos", "Mililitros de agua", "Tamaño", "Ingrediente opcional" };

        DefaultTableModel model = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaCafes.setModel(model);
        cargarDatos(cafeteria);

        agregarCafeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAgregar vistaAgregar = new VistaAgregar(cafeteria, VistaCafeteria.this);
                vistaAgregar.setVisible(true);
            }
        });

        modificarCafeteriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaModificar vistaModificar = new VistaModificar(cafeteria,VistaCafeteria.this);
                vistaModificar.setVisible(true);
            }
        });

        descontinuarCafeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tablaCafes.getSelectedRow();
                if (filaSeleccionada != -1 ) {
                    eliminarCafe(cafeteria, filaSeleccionada);
                    cargarDatos(cafeteria);
                } else {
                    JOptionPane.showMessageDialog(VistaCafeteria.this, "Seleccione un café para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        guardarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CafeteriaController.guardarDatos(cafeteria);
                JOptionPane.showMessageDialog(VistaCafeteria.this, "Datos guardados correctamente.", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public void cargarDatos(Cafeteria cafeteria) {
        DefaultTableModel model = (DefaultTableModel) tablaCafes.getModel();
        model.setRowCount(0);
        for (Cafe cafe : cafeteria.getCafes()) {
            model.addRow(new Object[] { cafe.getNombre(), cafe.getCantidadGramos(), cafe.getMililitrosAgua(), cafe.getTamano(), cafe.getIngredienteOpcional() });
        }
    }

    private void eliminarCafe(Cafeteria cafeteria, int selectedRow) {
        int index = selectedRow;
        try {
            CafeteriaController.descontinuarCafe(cafeteria, index);
            JOptionPane.showMessageDialog(this, "Café eliminado correctamente.", "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (IndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el café.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
