package br.com.rafaellbarros.adapters.outbound.repository;

import br.com.rafaellbarros.adapters.inbound.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 02/03/2022
 */

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, UUID> {
}