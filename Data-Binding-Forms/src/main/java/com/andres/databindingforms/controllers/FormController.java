package com.andres.databindingforms.controllers;

import com.andres.databindingforms.models.entity.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @GetMapping("/form")
    public String Form(Model model){
        model.addAttribute("titulo", "Formulario");
        return "form1";
    }

    @PostMapping("/form")
    public String procesar(Usuario usuario,Model model){

        model.addAttribute("titulo", "Resultado del formulario");
        model.addAttribute("usuario", usuario);
        return "resultado1";
    }
}
