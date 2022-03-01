package br.com.rafaellbarros.application.ports.in;

import br.com.rafaellbarros.application.core.domain.Usuario;

/**
 * created by:
 *
 * @author rafael for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 01/03/2022
 */

public interface SalvarUsuarioServicePort {

    Usuario salvarUsuario(Usuario usuario, String cep);

}
