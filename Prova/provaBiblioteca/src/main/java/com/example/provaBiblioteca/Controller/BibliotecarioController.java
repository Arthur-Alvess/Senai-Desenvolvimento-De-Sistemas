package com.example.provaBiblioteca.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.provaBiblioteca.Model.Bibliotecario;
import com.example.provaBiblioteca.Service.BibliotecarioService;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/bibliotecario")
public class BibliotecarioController {

    private final BibliotecarioService service;

    @Autowired
    public BibliotecarioController(BibliotecarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Bibliotecario> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bibliotecario> getById(@PathVariable Long id) {
        return service.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Bibliotecario create(@RequestBody Bibliotecario bibliotecario) {
        return service.salvar(bibliotecario);
    }


    @PutMapping
    public Bibliotecario update(@RequestBody Bibliotecario bibliotecario) {
        return service.atualizar(bibliotecario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    

}
