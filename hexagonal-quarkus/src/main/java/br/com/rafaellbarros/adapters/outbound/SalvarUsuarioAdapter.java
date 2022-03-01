package br.com.rafaellbarros.adapters.outbound;

import br.com.rafaellbarros.adapters.inbound.mapper.EnderecoToEnderecoEntityMapper;
import br.com.rafaellbarros.adapters.inbound.mapper.UsuarioEntityToUsuarioMapper;
import br.com.rafaellbarros.adapters.inbound.mapper.UsuarioToUsuarioEntityMapper;
import br.com.rafaellbarros.adapters.outbound.repository.UsuarioRepository;
import br.com.rafaellbarros.application.core.domain.Usuario;
import br.com.rafaellbarros.application.ports.out.SalvarUsuarioPort;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

/**
 * created by:
 *
 * @author rafael for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 01/03/2022
 */

@ApplicationScoped
public class SalvarUsuarioAdapter implements SalvarUsuarioPort {

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    EnderecoToEnderecoEntityMapper enderecoToEnderecoEntityMapper;

    @Inject
    UsuarioToUsuarioEntityMapper usuarioToUsuarioEntityMapper;

    @Inject
    UsuarioEntityToUsuarioMapper usuarioEntityToUsuarioMapper;

    @Override
    @Transactional
    public Usuario salvar(Usuario usuario) {
        final var usuarioEntity = usuarioToUsuarioEntityMapper.mapper(usuario);
        final var enderecoEntity = enderecoToEnderecoEntityMapper.mapper(usuario.getEndereco());

        usuarioEntity.setEndereco(enderecoEntity);
        usuarioRepository.persist(usuarioEntity);
        return usuarioEntityToUsuarioMapper.mapper(usuarioEntity);
    }
}
