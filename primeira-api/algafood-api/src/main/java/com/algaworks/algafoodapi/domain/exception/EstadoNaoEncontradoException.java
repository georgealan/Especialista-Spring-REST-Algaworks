package com.algaworks.algafoodapi.domain.exception;

/**
 * Classes de exception granulares e especificas podem se beneficiar de passar como parâmetro o texto
 * da exception em construtores, por ela ser bem especifica vale a pena setar uma mensagem fixa em um dos
 * construtores.
 */
public class EstadoNaoEncontradoException extends EntidadeNaoEncontradaException {

    private static final long serialVersionUID = 1L;

    public EstadoNaoEncontradoException(String message) {
        super(message);
    }

    public EstadoNaoEncontradoException(Long estadoId) {
        this(String.format("Não existe um cadastro de estado com o id %d", estadoId));
    }
}
