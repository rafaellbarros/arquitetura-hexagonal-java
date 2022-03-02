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
public class UsuarioEntityToUsuarioMapper {

    public Usuario mapper(UsuarioEntity usuarioEntity){
        var usuario = new Usuario();
        BeanUtils.copyProperties(usuarioEntity, usuario);
        return usuario;
    }

}
