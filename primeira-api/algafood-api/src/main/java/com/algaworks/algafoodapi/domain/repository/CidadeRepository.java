package com.algaworks.algafoodapi.domain.repository;

import com.algaworks.algafoodapi.domain.model.Cidade;

import java.util.List;

public interface CidadeRepository {
    List<Cidade> todas();

    Cidade porId(Long id);

    Cidade adicionar(Cidade cidade);

    void remover(Cidade cidade);
}
