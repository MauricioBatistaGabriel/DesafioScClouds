package org.example.domain.controller;

import org.example.domain.service.NumeroPrimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/numeroprimo")
public class NumeroPrimoController {

    @Autowired
    private NumeroPrimoService numeroPrimoService;

    @GetMapping("/recursivo/{numeroPrimoMaximo}")
    public List<Integer> numeroPrimoRecursivo(@PathVariable Integer numeroPrimoMaximo){
        Integer numeroTestado = 2;
        List<Integer> numerosPrimos = new ArrayList<>();
        return numeroPrimoService.numerosPrimosRecursivo(numeroPrimoMaximo, numeroTestado, numerosPrimos);
    }

    @GetMapping("/linear/{numeroPrimoMaximo}")
    public List<Integer> numeroPrimoLinear(@PathVariable Integer numeroPrimoMaximo){
        return numeroPrimoService.numerosPrimosLinear(numeroPrimoMaximo);
    }
}
