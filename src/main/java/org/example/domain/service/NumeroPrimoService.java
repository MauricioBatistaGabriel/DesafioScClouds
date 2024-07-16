package org.example.domain.service;

import java.util.List;

public interface NumeroPrimoService {

    List<Integer> numerosPrimosRecursivo(Integer numeroPrimoMaximo, Integer numeroDivisor, List<Integer> numerosPrimos);
    List<Integer> numerosPrimosLinear(Integer numeroPrimoMaximo);
}
