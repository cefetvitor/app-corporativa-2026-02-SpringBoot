package br.cefetrj.projetospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cefetrj.projetospringboot.model.Pessoa;
import br.cefetrj.projetospringboot.repository.PessoaRepository;

@Service 
public class PessoaService extends GenericService<Pessoa>{

    private PessoaRepository pessoaRepository;

    @Autowired 
    public PessoaService(PessoaRepository repository) {
        super(repository);
        this.pessoaRepository = repository;
    }

    public Pessoa procuraPeloCpf(String cpf) {
        return this.pessoaRepository.findFirstByCpf(cpf);
    }
}