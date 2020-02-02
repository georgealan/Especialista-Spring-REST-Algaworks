package com.algaworks.algafoodapi.infrastructure.repository;

import com.algaworks.algafoodapi.domain.model.Cozinha;
import com.algaworks.algafoodapi.domain.repository.CozinhaRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cozinha> listar(){
        return manager.createQuery("from Cozinha", Cozinha.class).getResultList();
    }

    @Override
    public Cozinha porId(Long id){
        return manager.find(Cozinha.class, id);
    }

    @Transactional
    @Override
    public Cozinha adicionar(Cozinha cozinha){
        return manager.merge(cozinha);
    }

    @Transactional
    @Override
    public void remover(Long id){
        Cozinha cozinha = porId(id);

        if (cozinha == null){
            throw new EmptyResultDataAccessException(1);
        }

        manager.remove(cozinha);
    }
}
