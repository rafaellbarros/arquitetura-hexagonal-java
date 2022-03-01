package br.com.rafaellbarros.config;

import br.com.rafaellbarros.application.core.service.SalvarUsuarioService;
import br.com.rafaellbarros.application.ports.out.BuscarEnderecoPort;
import br.com.rafaellbarros.application.ports.out.SalvarUsuarioPort;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;

/**
 * created by:
 *
 * @author rafael for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 01/03/2022
 */

@Dependent
public class Config {

    @Default
    public SalvarUsuarioService salvarUsuarioService(SalvarUsuarioPort salvarUsuarioPort,
                                                     BuscarEnderecoPort buscarEnderecoPort) {
        return new SalvarUsuarioService(salvarUsuarioPort, buscarEnderecoPort);
    }
}
