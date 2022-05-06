package com.algaworks.algafoodapi;


import com.algaworks.algafoodapi.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafoodapi.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafoodapi.domain.model.Cozinha;
import com.algaworks.algafoodapi.domain.service.CadastroCozinhaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolationException;

@SpringBootTest
class CadastroCozinhaIT {
    @Autowired
    private CadastroCozinhaService cadastroCozinha;
    private Cozinha novaCozinha = new Cozinha();

    @Test
    public void deve_cadastrar_cozinha_com_sucesso() {
        // Cenário
        novaCozinha.setNome("Chinesa");

        // Ação
        novaCozinha = cadastroCozinha.salvar(novaCozinha);

        // Validação
        Assertions.assertNotNull(novaCozinha);
        Assertions.assertNotNull(novaCozinha.getId());
    }

    @Test
    public void deve_falhar_quando_cadastrar_cozinha_sem_nome() {
        novaCozinha.setNome(null);

        ConstraintViolationException erroEsperado =
                Assertions.assertThrows(ConstraintViolationException.class, () -> {
                    cadastroCozinha.salvar(novaCozinha);
                });

        Assertions.assertNotNull(erroEsperado);
    }

    @Test
    public void deve_falhar_quando_excluir_cozinha_em_uso() {
        EntidadeEmUsoException erroEsperado =
                Assertions.assertThrows(EntidadeEmUsoException.class, () -> {
                    cadastroCozinha.excluir(1L);
                });

        Assertions.assertNotNull(erroEsperado);
    }

    @Test
    public void deve_falhar_quando_excluir_cozinha_Inexistente() {
        EntidadeNaoEncontradaException erroEsperado =
                Assertions.assertThrows(EntidadeNaoEncontradaException.class, () -> {
                    cadastroCozinha.excluir(100L);
                });

        Assertions.assertNotNull(erroEsperado);
    }


}
