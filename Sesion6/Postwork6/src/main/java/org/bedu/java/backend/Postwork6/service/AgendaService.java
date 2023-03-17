package org.bedu.java.backend.Postwork6.service;

import org.bedu.java.backend.Postwork6.model.Persona;
import org.bedu.java.backend.Postwork6.persistence.AgendaMemoryDAO;
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

        if (!validadorTelefono.isValido(persona.getPhone())) {
            return null;
        }
        String telefono = validadorTelefono.limpiaNumero(persona.getPhone());

        persona.setPhone(telefono);

        return agendaDao.registarPersona(persona);
    }

    public Set<Persona> getPersonas() {
        return agendaDao.getPersonas();
    }
}
