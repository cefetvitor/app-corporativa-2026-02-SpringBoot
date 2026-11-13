package br.cefetrj.projetospringboot.dto.output;

import br.cefetrj.projetospringboot.model.Pessoa;
import lombok.Data;

@Data 
public class PessoaDTOOutput {

    private Long id;

    private String nome;

    private String cpf;

    private String dataNascimento;

    public PessoaDTOOutput(Pessoa pessoa) {
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.cpf = pessoa.getCpf();
        this.dataNascimento = pessoa.getDataNascimento().toString();
    }
}