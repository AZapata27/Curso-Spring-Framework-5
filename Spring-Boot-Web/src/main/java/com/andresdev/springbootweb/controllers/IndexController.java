package com.andresdev.springbootweb.controllers;

import com.andresdev.springbootweb.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @GetMapping(value = {"/index", "/", "/home"})
    public String index(ModelMap model) {

        model.addAttribute("title", "Titulo Hola Spring");

        return "index";
    }

    @GetMapping(value = "/perfil")
    public String perfil(ModelMap model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Andres");
        usuario.setApellido("Zapata");

        model.addAttribute("title", "Perfil de usuario: " + usuario.getNombre());

        model.addAttribute("usuario", usuario);

        return "perfil";
    }

    @GetMapping(value = "/listar")
    public String listar(ModelMap model) {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Andres", "Guzman", "andresg@correo.com"));
        usuarios.add(new Usuario("Fernando", "Arcila", "fernandoa@correo.com"));
        usuarios.add(new Usuario("Carlos", "Camargo", "carlosc@correo.com"));
        model.addAttribute("title", "Listado de usuarios");
        model.addAttribute("usuarios", usuarios);
        return "listar";

    }

}
