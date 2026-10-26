package com.pietrofilla.projetomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute(
                "nomeSistema",
                "Locadora DriveNow"
        );
        model.addAttribute(
                "mensagemBoasVindas",
                "Gestão de frotas e locações!"
        );
        return "index"; // -> templates/index.html
    }
}
