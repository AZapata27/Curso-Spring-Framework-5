package com.andres.databindingforms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/form")
    public String Form(Model model){
        model.addAttribute("titulo", "Formulario");
        return "form1";
    }

    @PostMapping("/form")
    public String procesar(Model model, @RequestParam String username,@RequestParam String password, @RequestParam String email){


        model.addAttribute("titulo", "Resultado del formulario");
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        model.addAttribute("email", email);
        return "resultado1";
    }
}
