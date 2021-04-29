package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.Persona;

@Controller
public class IndexController {

	
	
	@GetMapping({"/index","/","","/home"})
	public String index(ModelMap model){
		model.addAttribute("titulo", "Hola Spring Framework");

		Persona persona = new Persona();
		persona.setNombre("juan");
		persona.setApellido("perez");
		persona.setEmail("jperez@mail.com");
		persona.setTelefono("3118571088");

		Persona persona2 = new Persona();
		persona2.setNombre("karmenza");
		persona2.setApellido("hermeleginda");
		persona2.setEmail("kherme@mail.com");
		persona2.setTelefono("3147723109");

		List<Persona> personas = new ArrayList<>();
		personas.add(persona);
		personas.add(persona2);
		
		model.addAttribute("personas",personas);

		return "index";
	}
	
}