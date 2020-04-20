package com.analise.credito.module.application.factories;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Getter
public class DependencyFactory {

    @Value("${URL_SERVICO_CADASTRO_CLIENTE}")
    private String urlServicoCadastroCliente;
}
