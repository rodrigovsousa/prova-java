package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.service.dto.ImcDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class ImcService {

    private final Logger log = LoggerFactory.getLogger(ImcService.class);


    @Transactional
    public Double calc(ImcDTO imcDTO){
        log.debug("BMI calculation : {}");
        Double imc = imcDTO.getWeight() / Math.pow(imcDTO.getHeight(), 2);
        return imc;
    }

}
