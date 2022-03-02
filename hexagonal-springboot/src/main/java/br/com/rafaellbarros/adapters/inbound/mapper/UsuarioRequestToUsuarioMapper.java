package br.com.rafaellbarros.adapters.inbound.mapper;

import br.com.rafaellbarros.adapters.inbound.request.UsuarioRequest;
import br.com.rafaellbarros.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 02/03/2022
 */

@Component
public class UsuarioRequestToUsuarioMapper {

    public Usuario mapper(UsuarioRequest usuarioRequest){
        var usuario = new Usuario();
        BeanUtils.copyProperties(usuarioRequest, usuario);
        return usuario;
    }

}
