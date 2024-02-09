package despliegeejemplo.despliegeejemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class depliegueController {

    @GetMapping("/nombre")
    public String getNombre(){
        return "mi nombre es camilo";
    }
}
