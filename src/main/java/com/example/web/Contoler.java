package com.example.web;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.demo.Individuo;

import lombok.extern.slf4j.Slf4j;
import mx.exeample.dao.IndividuoDao;

@Controller
@Slf4j
public class Contoler {
    
    @Autowired
    private IndividuoDao individuoDao;
    @GetMapping("/")
    public String index(Model model){

     Iterable<Individuo> individuos = individuoDao.findAll();
        

        log.info("Estoy  ejecutando  esto desde MVC");
        model.addAttribute("individuos",individuos);
        return "index";
    }
}



