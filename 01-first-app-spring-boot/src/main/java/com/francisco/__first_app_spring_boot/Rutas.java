package com.francisco.__first_app_spring_boot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Rutas {
    public final Logger logger= LoggerFactory.getLogger(Rutas.class);
    @GetMapping("/hola")
    String miPrimeraRuta(){
        return "Hola mundo desde Spring Controller 😀";
    }

    @GetMapping("/libro/{id}/editorial/{editorial}")
    String leerLibro(
            @PathVariable int id,
            @PathVariable String editorial){
        return "Leyendo el libro con el id: " + id + " y el editorial: " + editorial;
    }

    @GetMapping("/libro2/{id}")
    String leerLibro2(
            @PathVariable int id,
            @RequestParam String year,
            @RequestParam String editorial){
        return "Leyendo el libro con el id: " + id + " y year: " + year + " y editorial: " + editorial;
    }


    @PostMapping("/libro")
    String guardarLibro(@RequestBody Map<String, Object> libro){
        libro.keySet().forEach(llave ->{
            logger.debug("Llave {}, Valor {}", llave, libro.get(llave));
            
        });
        return "Libro guardado";
    }

}
