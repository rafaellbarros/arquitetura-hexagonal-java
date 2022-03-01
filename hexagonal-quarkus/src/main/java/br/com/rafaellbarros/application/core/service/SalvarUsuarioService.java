package br.com.rafaellbarros.application.core.service;

import br.com.rafaellbarros.application.core.domain.Usuario;

import br.com.rafaellbarros.application.ports.in.SalvarUsuarioServicePort;
import br.com.rafaellbarros.application.ports.out.BuscarEnderecoPort;
import br.com.rafaellbarros.application.ports.out.SalvarUsuarioPort;

/**
 * created by:
 *
 * @author rafael for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 01/03/2022
 */

public class SalvarUsuarioService implements SalvarUsuarioServicePort {

    private final SalvarUsuarioPort salvarUsuarioPort;
    private final BuscarEnderecoPort buscarEnderecoPort;

    public SalvarUsuarioService(SalvarUsuarioPort salvarUsuarioPort, BuscarEnderecoPort buscarEnderecoPort) {
        this.salvarUsuarioPort = salvarUsuarioPort;
        this.buscarEnderecoPort = buscarEnderecoPort;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario,  String cep) {
        var endereco =  buscarEnderecoPort.buscar(cep);
        usuario.setEndereco(endereco);
        return salvarUsuarioPort.salvar(usuario);
    }

}
