package com.mycompany.comercial.dao;

import com.mycompany.comercial.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOMemoria implements ProductoDAO {

    private final List<Producto> productos = new ArrayList<>();
    private int siguienteId = 1;

    @Override
    public void insertar(Producto producto) {
        producto.setId(siguienteId++);
        productos.add(producto);
    }

    @Override
    public List<Producto> listar() {
        return new ArrayList<>(productos);
    }
}