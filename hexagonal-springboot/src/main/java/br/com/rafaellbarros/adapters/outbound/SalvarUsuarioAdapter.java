package br.com.rafaellbarros.adapters.outbound;

import br.com.rafaellbarros.adapters.inbound.mapper.EnderecoToEnderecoEntityMapper;
import br.com.rafaellbarros.adapters.inbound.mapper.UsuarioEntityToUsuarioMapper;
import br.com.rafaellbarros.adapters.inbound.mapper.UsuarioToUsuarioEntityMapper;
import br.com.rafaellbarros.adapters.outbound.repository.UsuarioRepository;
import br.com.rafaellbarros.application.core.domain.Usuario;
import br.com.rafaellbarros.application.ports.out.SalvarUsuarioPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 02/03/2022
 */

@Component
@AllArgsConstructor
public class SalvarUsuarioAdapter implements SalvarUsuarioPort {

    private final UsuarioRepository usuarioRepository;

    private final UsuarioToUsuarioEntityMapper usuarioToUsuarioEntityMapper;

    private final UsuarioEntityToUsuarioMapper usuarioToUsuarioEntitymMapper;

    private final EnderecoToEnderecoEntityMapper enderecoToEnderecoEntityMapper;

    @Override
    @Transactional
    public Usuario salvar(Usuario usuario) {
        var usuarioEntity = usuarioToUsuarioEntityMapper.mapper(usuario);
        var enderecoEntity = enderecoToEnderecoEntityMapper.mapper(usuario.getEndereco());
        usuarioEntity.setEndereco(enderecoEntity);
        return usuarioToUsuarioEntitymMapper.mapper(usuarioRepository.save(usuarioEntity));
    }
}