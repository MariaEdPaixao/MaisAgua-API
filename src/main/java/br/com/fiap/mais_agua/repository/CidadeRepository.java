package br.com.fiap.mais_agua.repository;

import br.com.fiap.mais_agua.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

    List<Cidade> findByEstadoId(Integer estadoId);
}
