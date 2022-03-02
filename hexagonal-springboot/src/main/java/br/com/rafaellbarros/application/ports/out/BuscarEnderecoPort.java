package br.com.rafaellbarros.application.ports.out;

import br.com.rafaellbarros.application.core.domain.Endereco;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 02/03/2022
 */

public interface BuscarEnderecoPort {

    Endereco buscar(String cep);

}
