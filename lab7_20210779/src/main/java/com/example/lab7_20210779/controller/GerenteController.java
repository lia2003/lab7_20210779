package com.example.lab7_20210779.controller;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import com.example.lab7_20210779.entity.*; //todas las entidades
import com.example.lab7_20210779.repository.*; //todos los repositorios
import org.springframework.web.bind.annotation.*; //postmapping, getmapping
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;
import java.util.Optional;
//import javax.validation.Valid; no lo acepta ni con las dependencias en el pom ni con el proyecto creado con esto
import org.springframework.validation.BindingResult;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/gerente")
public class GerenteController {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private movieprojectionsRepository movieprojectionsRepository;
    @GetMapping("/listar")
    public String listarProyecciones(Model model) {
        List<MovieProjections> listaProyecciones = movieprojectionsRepository.findAll();
        model.addAttribute("listaProyecciones", listaProyecciones);
        return "artistas"; // Asegúrate que la vista existe
    }

}

