package br.cefetrj.projetospringboot.dto.input;

import java.time.LocalDate;
import br.cefetrj.projetospringboot.model.Pessoa;
import lombok.Data;

@Data 
public class CadastroPessoaDTOInput {

    private Long id;
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Pessoa build() {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(this.id);
        pessoa.setNome(this.nome);
        pessoa.setCpf(this.cpf);
        pessoa.setDataNascimento(LocalDate.parse(this.dataNascimento));
        return pessoa;
    }

}
