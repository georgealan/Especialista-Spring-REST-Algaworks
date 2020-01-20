package com.algaworks.algafoodapi.jpa;

import com.algaworks.algafoodapi.AlgafoodApiApplication;
import com.algaworks.algafoodapi.domain.model.Restaurante;
import com.algaworks.algafoodapi.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaRestauranteMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE).run(args);

        RestauranteRepository restaurantes = applicationContext.getBean(RestauranteRepository.class);

        List<Restaurante> todosRestaurantes = restaurantes.todas();

        for (Restaurante restaurante : todosRestaurantes) {
            System.out.printf("%s - %f - %s\n", restaurante.getNome(), restaurante.getTaxaFrete(),
                    restaurante.getCozinha().getNome());
        }
    }
}
