package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

import com.example.demo.models.Persona;
import com.example.demo.service.PersonaService;

@Controller
public class IndexController {

    @Autowired
    private PersonaService personaService;


    @GetMapping({"/index", "/", "", "/home"})
    public String index(Model model, @AuthenticationPrincipal User user) {

        Iterable<Persona> personas = personaService.listarPersonas();

        model.addAttribute("personas", personas);

        return "index";
    }

    @GetMapping({"/agregar"})
    public String agregar(Persona persona) {


        return "Modificar";
    }

    @PostMapping({"/guardar"})
    public String guardar(@Valid Persona persona, Errors errores) {

        if (errores.hasErrors()) {
            return "modificar";
        }
        personaService.guardar(persona);
        return "redirect:/";
    }

    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model) {

        persona = personaService.encontarPersona(persona);

        model.addAttribute("persona", persona);

        return "modificar";

    }

    @GetMapping("/eliminar/{idPersona}")
    public String eliminar(Persona persona) {

        personaService.eliminar(persona);

        return "redirect:/";

    }

}