package com.mycompany.comercial.dao;

import com.mycompany.comercial.modelo.Producto;
import java.util.List;

public interface ProductoDAO {

    void insertar(Producto producto);

    List<Producto> listar();
}


