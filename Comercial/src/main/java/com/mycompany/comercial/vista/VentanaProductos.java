package com.mycompany.comercial.vista;

import com.mycompany.comercial.modelo.Producto;
import com.mycompany.comercial.servicio.ProductoService;
import com.mycompany.comercial.util.ValidacionException;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VentanaProductos extends JFrame {

    private final ProductoService servicio;

    private JTextField txtNombre;
    private JTextField txtPrecio;
    private JTextField txtStock;
    private JButton btnGuardar;
    private JButton btnLimpiar;
    private JTable tabla;
    private DefaultTableModel modeloTabla;

    public VentanaProductos(ProductoService servicio) {
        this.servicio = servicio;
        initComponents();
        cargarTabla();
    }

    private void initComponents() {
        setTitle("Sistema Comercial - Productos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 450);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Panel del formulario
        JPanel panelForm = new JPanel(new GridLayout(4, 2, 8, 8));
        panelForm.setBorder(BorderFactory.createTitledBorder("Datos del producto"));

        txtNombre = new JTextField();
        txtPrecio = new JTextField();
        txtStock = new JTextField();
        btnGuardar = new JButton("Guardar");
        btnLimpiar = new JButton("Limpiar");

        panelForm.add(new JLabel("Nombre:"));
        panelForm.add(txtNombre);
        panelForm.add(new JLabel("Precio (Gs.):"));
        panelForm.add(txtPrecio);
        panelForm.add(new JLabel("Stock:"));
        panelForm.add(txtStock);
        panelForm.add(btnGuardar);
        panelForm.add(btnLimpiar);

        // Tabla
        modeloTabla = new DefaultTableModel(
                new Object[]{"ID", "Nombre", "Precio", "Stock"}, 0) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        tabla = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(BorderFactory.createTitledBorder("Listado de productos"));

        add(panelForm, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        // Eventos
        btnGuardar.addActionListener(e -> guardar());
        btnLimpiar.addActionListener(e -> limpiar());
    }

    private void guardar() {
        try {
            String nombre = txtNombre.getText();
            double precio = Double.parseDouble(txtPrecio.getText().trim().replace(',', '.'));
            int stock = Integer.parseInt(txtStock.getText().trim());

            servicio.guardar(nombre, precio, stock);

            JOptionPane.showMessageDialog(this,
                    "Producto guardado correctamente.",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            cargarTabla();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "El precio y el stock deben ser valores numéricos.",
                    "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (ValidacionException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Error de validación", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void limpiar() {
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtNombre.requestFocus();
    }

    private void cargarTabla() {
        modeloTabla.setRowCount(0);
        for (Producto p : servicio.listar()) {
            modeloTabla.addRow(new Object[]{
                p.getId(), p.getNombre(), p.getPrecio(), p.getStock()
            });
        }
    }
}