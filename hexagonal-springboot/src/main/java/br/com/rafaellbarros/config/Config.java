package br.com.rafaellbarros.config;

import br.com.rafaellbarros.adapters.outbound.BuscarEnderecoAdapter;
import br.com.rafaellbarros.adapters.outbound.SalvarUsuarioAdapter;
import br.com.rafaellbarros.application.core.service.SalvarUsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 02/03/2022
 */


@Configuration
public class Config {

    @Bean
    public SalvarUsuarioService salvarUsuarioService(SalvarUsuarioAdapter salvarUsuarioAdapter, BuscarEnderecoAdapter buscarEnderecoAdapter){
        return new SalvarUsuarioService(salvarUsuarioAdapter, buscarEnderecoAdapter);
    }
}
