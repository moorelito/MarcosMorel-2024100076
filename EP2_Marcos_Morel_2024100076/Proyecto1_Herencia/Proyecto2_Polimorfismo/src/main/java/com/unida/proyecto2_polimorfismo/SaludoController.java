package com.unida.proyecto2_polimorfismo;

import org.springframework.stereotype.Controller;

@Controller // Anotación para declarar el controlador web
public class SaludoController {

    public String mostrar() {
        return "saludo";
    }
}

