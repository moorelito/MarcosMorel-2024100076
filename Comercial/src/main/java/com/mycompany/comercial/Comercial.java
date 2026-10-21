package com.mycompany.comercial;

import com.mycompany.comercial.dao.ProductoDAO;
import com.mycompany.comercial.dao.ProductoDAOMemoria;
import com.mycompany.comercial.servicio.ProductoService;
import com.mycompany.comercial.vista.VentanaProductos;
import javax.swing.SwingUtilities;

public class Comercial {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ProductoDAO dao = new ProductoDAOMemoria();
            ProductoService servicio = new ProductoService(dao);
            VentanaProductos ventana = new VentanaProductos(servicio);
            ventana.setVisible(true);
        });
    }
}










