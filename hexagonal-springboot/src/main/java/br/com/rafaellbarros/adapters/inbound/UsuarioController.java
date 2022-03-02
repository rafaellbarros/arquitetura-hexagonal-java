package br.com.rafaellbarros.adapters.inbound;

import br.com.rafaellbarros.adapters.inbound.mapper.UsuarioRequestToUsuarioMapper;
import br.com.rafaellbarros.adapters.inbound.request.UsuarioRequest;
import br.com.rafaellbarros.application.core.domain.Usuario;
import br.com.rafaellbarros.application.ports.in.SalvarUsuarioServicePort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 02/03/2022
 */

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {

    private final SalvarUsuarioServicePort salvarUsuarioServicePort;

    private final UsuarioRequestToUsuarioMapper usuarioRequestToUsuarioMapper;

    @PostMapping
    public Usuario salvarUsuario(@RequestBody UsuarioRequest usuarioRequest){
        var usuario = usuarioRequestToUsuarioMapper.mapper(usuarioRequest);
        return salvarUsuarioServicePort.salvarUsuario(usuario, usuarioRequest.getCep());
    }

}