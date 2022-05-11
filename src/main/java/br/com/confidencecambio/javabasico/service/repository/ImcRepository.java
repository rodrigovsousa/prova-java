package br.com.confidencecambio.javabasico.service.repository;

import br.com.confidencecambio.javabasico.domain.Imc;
import br.com.confidencecambio.javabasico.service.dto.ImcDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ImcRepository extends JpaSpecificationExecutor<Imc> {
    Page<ImcDTO> findAll();
}
