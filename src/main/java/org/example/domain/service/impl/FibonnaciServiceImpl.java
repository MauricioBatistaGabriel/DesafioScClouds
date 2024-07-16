package org.example.domain.service.impl;

import org.example.domain.exception.RegraNegocioException;
import org.example.domain.service.FibonnaciService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FibonnaciServiceImpl implements FibonnaciService {

    @Override
    public Integer sequenciaFibonnaciRecursiva(Integer indexFibonnaci, List<Integer> numerosFibonnaci) {
        validaEntradaDados(indexFibonnaci);

        if(numerosFibonnaci.size() <= indexFibonnaci){
            Integer a = numerosFibonnaci.get(numerosFibonnaci.size() - 2);
            Integer b = numerosFibonnaci.get(numerosFibonnaci.size() - 1);
            numerosFibonnaci.add(a + b);

            sequenciaFibonnaciRecursiva(indexFibonnaci, numerosFibonnaci);
        }

        return numerosFibonnaci.get(indexFibonnaci);
    }

    @Override
    public Integer sequenciaFibonnaciLinear(Integer indexFibonnaci) {
        validaEntradaDados(indexFibonnaci);

        List<Integer> numerosFibonnaci = new ArrayList<>();
        numerosFibonnaci.add(0);
        numerosFibonnaci.add(1);

        for (int index = 2; index <= indexFibonnaci; index++) {
            int a = numerosFibonnaci.get(index - 2);
            int b = numerosFibonnaci.get(index - 1);
            numerosFibonnaci.add(a + b);
        }

        return numerosFibonnaci.get(indexFibonnaci);
    }

    public Integer validaEntradaDados(Integer indexFibonnaci){
        if(indexFibonnaci >= 0){
            return indexFibonnaci;
        }
        else {
            throw new RegraNegocioException("Escreva um número maior que -1");
        }
    }
}
