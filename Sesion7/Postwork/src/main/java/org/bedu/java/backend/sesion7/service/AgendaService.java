package org.bedu.java.backend.sesion7.service;

import org.bedu.java.backend.sesion7.model.Persona;
import org.bedu.java.backend.sesion7.persistence.AgendaMemoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class AgendaService {

    private final ValidadorTel validadorTelefono;
    private final AgendaMemoryDAO agendaDao;

    @Autowired
    public AgendaService(ValidadorTel validadorTelefono, AgendaMemoryDAO agendaDao) {
        this.validadorTelefono = validadorTelefono;
        this.agendaDao = agendaDao;
    }

    public Persona guardaPersona(Persona persona) {

        String telefono = validadorTelefono.limpiaNumero(persona.getTelefono());

        persona.setTelefono(telefono);

        return agendaDao.guardaPersona(persona);
    }

    public Set<Persona> getPersonas() {
        return agendaDao.getPersonas();
    }
}
