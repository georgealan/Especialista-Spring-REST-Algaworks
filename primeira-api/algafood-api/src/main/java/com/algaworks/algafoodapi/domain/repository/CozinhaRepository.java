package com.algaworks.algafoodapi.domain.repository;

import com.algaworks.algafoodapi.domain.model.Cozinha;

import java.util.List;

public interface CozinhaRepository {
    List<Cozinha> listar();

    Cozinha porId(Long id);

    Cozinha adicionar(Cozinha cozinha);

    void remover(Long id);
}
