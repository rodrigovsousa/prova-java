package br.com.confidencecambio.javabasico.web.rest;

import br.com.confidencecambio.javabasico.service.ImcService;
import br.com.confidencecambio.javabasico.service.dto.ImcDTO;
import br.com.confidencecambio.javabasico.service.repository.ImcRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class ImcResource {

    private final Logger log = LoggerFactory.getLogger(ImcResource.class);

    private final ImcRepository imcRepository;
    private final ImcService imcService;


    public ImcResource(
            ImcRepository imcRepository,
            ImcService imcService
    ) {
        this.imcRepository = imcRepository;
        this.imcService = imcService;
    }

    @PostMapping("/imcs")
    public Double saveImc(@Valid @RequestBody ImcDTO imcDTO) throws Exception {
        log.debug("REST request to save BMI calculation : {}", imcDTO);
        if (imcDTO.getId() != null) {
            throw new Exception("Could not create a new BMI");
        }
        Double result = imcService.calc(imcDTO);
        return result;
    }

    @GetMapping("/imcs")
    public ResponseEntity<List<ImcDTO>> getAllImcs() {
        log.debug("REST request to get BMI : {}");
        Page<ImcDTO> page = imcRepository.findAll();
        return ResponseEntity.ok().body(page.getContent());
    }
}
