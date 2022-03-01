package br.com.rafaellbarros.adapters.outbound.rest;

import br.com.rafaellbarros.application.core.domain.Endereco;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * created by:
 *
 * @author rafael for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 01/03/2022
 */

@Path("/ws")
@RegisterRestClient(baseUri = "https://viacep.com.br")
public interface BuscarEnderecoRest {

    @GET
    @Path("/{cep}/json")
    Endereco buscar(@PathParam("cep")String cep);
}
