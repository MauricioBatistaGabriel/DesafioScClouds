package org.example.domain.service.impl;

import org.example.domain.exception.RegraNegocioException;
import org.example.domain.service.NumeroPrimoService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class NumeroPrimoServiceImpl implements NumeroPrimoService {

    @Override
    public List<Integer> numerosPrimosRecursivo(Integer numeroPrimoMaximo, Integer numeroTestado, List<Integer> numerosPrimos) {
        validaEntradaDados(numeroPrimoMaximo);
        Integer booleanPrimo = 1;

        if( numeroTestado <= numeroPrimoMaximo){

            for (Integer index = 2; index < numeroTestado; index++){

                if (numeroTestado % index == 0){
                    booleanPrimo = 0;
                }

            }
            if (booleanPrimo == 1){
                numerosPrimos.add(numeroTestado);
            }
            numerosPrimosRecursivo(numeroPrimoMaximo, numeroTestado + 1, numerosPrimos);
        }

        return numerosPrimos;
    }

    @Override
    public List<Integer> numerosPrimosLinear(Integer numeroPrimoMaximo) {
        validaEntradaDados(numeroPrimoMaximo);

        Integer numeroTestado = 2;
        List<Integer> numerosPrimos = new ArrayList<>();

        for (Integer numeroTestes = 1; numeroTestes < numeroPrimoMaximo; numeroTestes++){
            Integer booleanPrimo = 1;

            if (numeroTestado <= numeroPrimoMaximo){

                for (Integer index = 2; index < numeroTestado; index++){

                    if (numeroTestado % index == 0){
                        booleanPrimo = 0;
                    }

                }
            }
            if (booleanPrimo == 1){
                numerosPrimos.add(numeroTestado);
            }

            numeroTestado += 1;
        }

        return numerosPrimos;
    }

    public Integer validaEntradaDados(Integer numeroMaximo){
        if(numeroMaximo > 1){
            return numeroMaximo;
        }
        else {
            throw new RegraNegocioException("Escreva um número maior que 1");
        }
    }
}
