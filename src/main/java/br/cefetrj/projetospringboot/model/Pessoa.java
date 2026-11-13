package br.cefetrj.projetospringboot.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity 
@Data 
@EqualsAndHashCode(callSuper = true)
public class Pessoa extends EntityGeneric{

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private LocalDate dataUltimoAcesso;
}
