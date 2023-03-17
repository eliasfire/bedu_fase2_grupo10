package org.bedu.java.backend.Postwork6.persistence;


import org.bedu.java.backend.Postwork6.model.Persona;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@Repository
public class AgendaMemoryDAO {


    private static final SortedSet<Persona> personas = new TreeSet<>();

    public Persona registarPersona(Persona persona) {
        personas.add(persona);
        return persona;
    }

    public Set<Persona> getPersonas() {
        return personas;
    }
}
