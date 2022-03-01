package br.com.rafaellbarros.adapters.outbound;

import br.com.rafaellbarros.adapters.outbound.rest.BuscarEnderecoRest;
import br.com.rafaellbarros.application.core.domain.Endereco;
import br.com.rafaellbarros.application.ports.out.BuscarEnderecoPort;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * created by:
 *
 * @author rafael for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 01/03/2022
 */

@ApplicationScoped
public class BuscarEnderecoAdapter implements BuscarEnderecoPort {

    @Inject
    @RestClient
    BuscarEnderecoRest buscarEnderecoRest;

    @Override
    public Endereco buscar(String cep) {
        return buscarEnderecoRest.buscar(cep);
    }
}
