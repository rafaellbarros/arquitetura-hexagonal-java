package br.com.rafaellbarros.adapters.outbound.rest;

import br.com.rafaellbarros.application.core.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 02/03/2022
 */

@FeignClient(name = "buscaCep", url = "https://viacep.com.br")
public interface BuscarEnderecoRest {

 @GetMapping( "/ws/{cep}/json")
 ResponseEntity<Endereco> buscar(@PathVariable String cep);

}