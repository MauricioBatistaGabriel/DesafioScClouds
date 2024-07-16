package org.example.domain.service;

import java.util.List;

public interface FibonnaciService {

    Integer sequenciaFibonnaciRecursiva(Integer indexFibonnaci, List<Integer> numerosFibonnaci);
    Integer sequenciaFibonnaciLinear(Integer n);
}
