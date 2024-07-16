package org.example.domain.controller;

import org.example.domain.service.FibonnaciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/fibonnaci")
public class FibonnaciController {

    @Autowired
    private FibonnaciService fibonnaciService;

    @GetMapping("/recursiva/{indexFibonnaci}")
    public Integer sequenciaFibonnaciRecursiva(@PathVariable Integer indexFibonnaci){
        List<Integer> numerosFibonnaci = new ArrayList<>();
        numerosFibonnaci.add(0);
        numerosFibonnaci.add(1);
        return fibonnaciService.sequenciaFibonnaciRecursiva(indexFibonnaci, numerosFibonnaci);
    }

    @GetMapping("/linear/{indexFibonnaci}")
    public Integer sequenciaFibonnaciLinear(@PathVariable Integer indexFibonnaci){
        return fibonnaciService.sequenciaFibonnaciLinear(indexFibonnaci);
    }
}
