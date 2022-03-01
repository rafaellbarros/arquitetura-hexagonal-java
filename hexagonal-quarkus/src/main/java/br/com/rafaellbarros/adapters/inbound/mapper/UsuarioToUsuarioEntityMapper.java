package br.com.rafaellbarros.adapters.inbound.mapper;

import br.com.rafaellbarros.adapters.inbound.entity.UsuarioEntity;
import br.com.rafaellbarros.application.core.domain.Usuario;
import org.mapstruct.Mapper;

/**
 * created by:
 *
 * @author rafael for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 01/03/2022
 */

@Mapper(componentModel = "cdi")
public interface UsuarioToUsuarioEntityMapper {

    UsuarioEntity mapper(Usuario usuario);
}
