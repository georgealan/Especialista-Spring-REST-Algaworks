package com.algaworks.algafoodapi.core.validation;

import org.springframework.beans.BeanUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ValidationException;
import java.math.BigDecimal;

public class ValorZeroIncluiDescricaoValidator implements ConstraintValidator<ValorZeroIncluiDescricao, Object> {

    private String valorField;
    private String descricaoField;
    private String descricaoObrigatoria;

    @Override
    public void initialize(ValorZeroIncluiDescricao constraint) {
        this.valorField = constraint.valorField();
        this.descricaoField = constraint.descricaoField();
        this.descricaoObrigatoria = constraint.descricaoObrigatoria();
    }

    @Override
    public boolean isValid(Object objetoValidacao, ConstraintValidatorContext constraintValidatorContext) {
        boolean valido = true;

        try {
            /**
             * A Classe BeanUtils é uma classe que podemos buscar valores em tempo de execução, utilizando
             * reflection do Java, o Spring facilita utilizar reflection de uma forma mais simples do que
             * diretamente pelo Java Core.
             *
             * Com esse código estamos capturando o valor do input atribuido na propriedade do Objeto que
             * propositalmente definimos aqui no método como sendo do tipo Object, para ser de forma generica tendo em
             * vista que futuramente poderemos utilizar esse método em outros Classes e não em um fixo.
             *
             * O valor é capturado através do método .get() das prpriedades da Classe, os métodos padrão de .get(), .setter()
             */
            BigDecimal valor = (BigDecimal) BeanUtils.getPropertyDescriptor(objetoValidacao.getClass(), valorField)
                    .getReadMethod().invoke(objetoValidacao);

            String descricao = (String) BeanUtils.getPropertyDescriptor(objetoValidacao.getClass(), descricaoField)
                    .getReadMethod().invoke(objetoValidacao);

            if (valor != null && BigDecimal.ZERO.compareTo(valor) == 0 && descricao != null) {
                valido = descricao.toLowerCase().contains(this.descricaoObrigatoria.toLowerCase());
            }

        } catch (Exception e) {
            throw new ValidationException(e);
        }

        return valido;
    }
}
