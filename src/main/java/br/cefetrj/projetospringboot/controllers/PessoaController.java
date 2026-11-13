package br.cefetrj.projetospringboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cefetrj.projetospringboot.dto.input.CadastroPessoaDTOInput;
import br.cefetrj.projetospringboot.model.Pessoa;
import br.cefetrj.projetospringboot.service.PessoaService;

@RestController 
@RequestMapping("/pessoa")
public class PessoaController {
    @Autowired 
    private PessoaService pessoaService;
    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody CadastroPessoaDTOInput input) {
            this.pessoaService.save(input.build());
            return ResponseEntity.ok("Pessoa salva com sucesso!");      
    }  
    @PutMapping 
    public ResponseEntity<String> atualizar(@RequestBody CadastroPessoaDTOInput input) {
        this.pessoaService.update(input.build());
        return ResponseEntity.ok("Pessoa atualizada com sucesso!");
    }
    @GetMapping 
    public ResponseEntity<List<Pessoa>> listarTodos() {
        return ResponseEntity.ok(this.pessoaService.findAll());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable("id") Long id) {
        this.pessoaService.delete(id);
        return ResponseEntity.ok("Pessoa deletada com sucesso!");
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pessoaService.findById(id));
    }
}