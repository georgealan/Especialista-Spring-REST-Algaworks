package com.algaworks.algafoodapi.domain.repository;

import com.algaworks.algafoodapi.domain.model.Cozinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * NÃO ESQUECER, DESAFIO REFATORAR TODOS OS REPOSITÓRIOS PARA SPRING DATA JPA.
 * APAGAR TODAS AS ANTIGAS IMPLEMENTAÇÕES DE REPOSITÓRIOS EM infrastructure.repository
 */

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {
    //List<Cozinha> consultarPorNome(String nome);

}
