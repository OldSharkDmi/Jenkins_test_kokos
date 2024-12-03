package org.example.kokos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KokosController {

    @GetMapping("/")
    public String showButton() {
        return "index";
    }
}