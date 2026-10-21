package com.mycompany.comercial.servicio;

import com.mycompany.comercial.dao.ProductoDAO;
import com.mycompany.comercial.modelo.Producto;
import com.mycompany.comercial.util.ValidacionException;
import java.util.List;

public class ProductoService {

    private final ProductoDAO dao;

    public ProductoService(ProductoDAO dao) {
        this.dao = dao;
    }

    public void guardar(String nombre, double precio, int stock) throws ValidacionException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new ValidacionException("El nombre del producto es obligatorio.");
        }
        if (precio <= 0) {
            throw new ValidacionException("El precio debe ser mayor a 0.");
        }
        if (stock < 0) {
            throw new ValidacionException("El stock no puede ser negativo.");
        }

        Producto producto = new Producto(0, nombre.trim(), precio, stock);
        dao.insertar(producto);
    }

    public List<Producto> listar() {
        return dao.listar();
    }
}

