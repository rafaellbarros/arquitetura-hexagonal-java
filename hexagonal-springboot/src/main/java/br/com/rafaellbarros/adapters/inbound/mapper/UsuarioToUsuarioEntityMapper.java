package br.com.rafaellbarros.adapters.inbound.mapper;

import br.com.rafaellbarros.adapters.inbound.entity.UsuarioEntity;
import br.com.rafaellbarros.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 02/03/2022
 */

@Component
public class UsuarioToUsuarioEntityMapper {

    public UsuarioEntity mapper(Usuario usuario){
        var usuarioEntity = new UsuarioEntity();
        BeanUtils.copyProperties(usuario, usuarioEntity);
        return usuarioEntity;
    }

}