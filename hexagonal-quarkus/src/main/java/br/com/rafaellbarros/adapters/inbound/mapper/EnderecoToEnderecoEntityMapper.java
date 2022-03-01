package br.com.rafaellbarros.adapters.inbound.mapper;

import br.com.rafaellbarros.adapters.inbound.entity.EnderecoEntity;
import br.com.rafaellbarros.application.core.domain.Endereco;
import org.mapstruct.Mapper;

/**
 * created by:
 *
 * @author rafael for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 01/03/2022
 */

@Mapper(componentModel = "cdi")
public interface EnderecoToEnderecoEntityMapper {

    EnderecoEntity mapper(Endereco endereco);

}
