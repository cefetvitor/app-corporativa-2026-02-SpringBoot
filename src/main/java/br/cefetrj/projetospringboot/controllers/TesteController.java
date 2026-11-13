package br.cefetrj.projetospringboot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @PostMapping
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("Teste");
    }
    
    @PostMapping("/2")
    public ResponseEntity<String> teste2() {
        return ResponseEntity.ok("Teste 2");
    }

    @GetMapping 
    public ResponseEntity<String> teste3() {
        return ResponseEntity.ok("Teste GET");
    }
}
