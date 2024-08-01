package curso.dio.spring.curso.diospring.service.impl;

import curso.dio.spring.curso.diospring.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);

    void salvarClienteComCep();

    void salvarClienteComCep(Cliente cliente);

    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
