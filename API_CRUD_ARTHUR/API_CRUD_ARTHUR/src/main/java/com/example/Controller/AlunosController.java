package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.AlunosModel;
import com.example.Service.AlunosService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/alunos")

public class AlunosController {

    @Autowired
    private AlunosService service;

    @GetMapping
    public List<AlunosModel> listartodos(){
        return service.listarTodos();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<AlunosModel> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id).map(ResponseEntity::ok)
                            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AlunosModel criarAlunosModel(@RequestBody AlunosModel alunosModel){
        return service.criar(alunosModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        if (!service.buscarPorId(id).isPresent()){
            return ResponseEntity.notFound().build();
        } else {
            service.deletar(id);
            return ResponseEntity.noContent().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunosModel> atualizar(@PathVariable Long id, @RequestBody AlunosModel alunosModel) {
        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        alunosModel.setId(id);
        return ResponseEntity.ok(service.atualizar(id, alunosModel));
    }

}
