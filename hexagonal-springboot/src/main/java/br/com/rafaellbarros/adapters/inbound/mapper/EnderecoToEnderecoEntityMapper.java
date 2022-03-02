package br.com.rafaellbarros.adapters.inbound.mapper;

import br.com.rafaellbarros.adapters.inbound.entity.EnderecoEntity;
import br.com.rafaellbarros.application.core.domain.Endereco;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 02/03/2022
 */

@Component
public class EnderecoToEnderecoEntityMapper {

    public EnderecoEntity mapper(Endereco endereco){
        var enderecoEntity = new EnderecoEntity();
        BeanUtils.copyProperties(endereco, enderecoEntity);
        return enderecoEntity;
    }

}
