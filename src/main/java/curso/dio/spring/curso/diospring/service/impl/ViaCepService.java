package curso.dio.spring.curso.diospring.service.impl;

import curso.dio.spring.curso.diospring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Endereco consultar(@PathVariable("cep")String cep);


    Endereco consultarCep(String cep);
}
