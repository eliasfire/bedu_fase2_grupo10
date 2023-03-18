package org.bedu.java.backend.sesion7.service;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class ValidadorTel {

    public String limpiaNumero(String telefono){
        return telefono.replaceAll("[^0-9]", "");
    }
}
