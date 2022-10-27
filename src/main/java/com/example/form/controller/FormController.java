package com.example.form.controller;

import com.example.form.models.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes("usuario")
public class FormController {

    @GetMapping("/form")
    public String form (Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Danny");
        usuario.setNombre("Tenemea");
        usuario.setIdentificador("0107648776");
        model.addAttribute("titulo", "registrar Usuario");
        model.addAttribute("usuario", usuario);
        return "form";
    }

    @PostMapping("/form")
    public String procesar (@Valid Usuario usuario,BindingResult result, Model model, SessionStatus status) {

        model.addAttribute("titulo", "Registrado form");
        if(result.hasErrors()) {
            return "form";
        }
        model.addAttribute("usuario", usuario);
        status.setComplete();
        return "resultado";
    }
}
