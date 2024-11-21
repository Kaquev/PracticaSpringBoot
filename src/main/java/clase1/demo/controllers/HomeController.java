package clase1.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller; //impottando la libreria
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("titulo", "Bienvenido");
        return "home";
    }
}