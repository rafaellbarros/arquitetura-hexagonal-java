package br.com.rafaellbarros.adapters.outbound;

import br.com.rafaellbarros.adapters.outbound.rest.BuscarEnderecoRest;
import br.com.rafaellbarros.application.core.domain.Endereco;
import br.com.rafaellbarros.application.ports.out.BuscarEnderecoPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 02/03/2022
 */

@Component
@AllArgsConstructor
public class BuscarEnderecoAdapter implements BuscarEnderecoPort {

    private final BuscarEnderecoRest buscarEnderecoRest;


    @Override
    public Endereco buscar(String cep) {
        var endereco = buscarEnderecoRest.buscar(cep);

        return endereco.getBody();
    }
}
