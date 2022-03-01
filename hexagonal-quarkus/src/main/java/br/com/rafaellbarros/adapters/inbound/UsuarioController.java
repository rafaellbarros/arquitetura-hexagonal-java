package br.com.rafaellbarros.adapters.inbound;

import br.com.rafaellbarros.adapters.inbound.mapper.UsuarioRequestToUsuarioMapper;
import br.com.rafaellbarros.adapters.inbound.request.UsuarioRequest;
import br.com.rafaellbarros.application.core.domain.Usuario;
import br.com.rafaellbarros.application.ports.in.SalvarUsuarioServicePort;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * created by:
 *
 * @author rafael for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 01/03/2022
 */

@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioController {

    @Inject
    SalvarUsuarioServicePort salvarUsuarioServicePort;

    @Inject
    UsuarioRequestToUsuarioMapper usuarioRequestToUsuarioMapper;

    @POST
    public Usuario salvarUsuario(UsuarioRequest usuarioRequest) {
        var usuario = usuarioRequestToUsuarioMapper.mapper(usuarioRequest);
        return salvarUsuarioServicePort.salvarUsuario(usuario, usuarioRequest.getCep());
    }
}
