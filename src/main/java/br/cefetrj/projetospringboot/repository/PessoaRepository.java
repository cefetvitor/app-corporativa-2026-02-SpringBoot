package br.cefetrj.projetospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cefetrj.projetospringboot.model.Pessoa;

@Repository 
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
    public Pessoa findFirstByCpf(String cpf);

    //Named Query Spring Data
    public Pessoa findByNomeContains(String nome);
}