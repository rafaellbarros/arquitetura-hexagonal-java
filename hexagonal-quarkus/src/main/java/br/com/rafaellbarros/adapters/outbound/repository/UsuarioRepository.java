package br.com.rafaellbarros.adapters.outbound.repository;

import br.com.rafaellbarros.adapters.inbound.entity.UsuarioEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * created by:
 *
 * @author rafael for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 01/03/2022
 */

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<UsuarioEntity> {

}
