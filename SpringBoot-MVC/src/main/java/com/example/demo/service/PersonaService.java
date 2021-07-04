package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Persona;


public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontarPersona(Persona persona);

}
