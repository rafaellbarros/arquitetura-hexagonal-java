package br.com.rafaellbarros.adapters.inbound.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 02/03/2022
 */

@Getter
@Setter
public class UsuarioRequest {

    private String nome;

    private String instagram;

    private String linkedin;

    private String github;

    private LocalDate dataNascimento;

    private String cep;

}
