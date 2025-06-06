package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.ImagensModel;
import com.example.Service.ImagensService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/imagens")

public class ImagensController {

    @Autowired
    private ImagensService service;

    @GetMapping
    public List<ImagensModel> listartodos(){
        return service.listarTodos();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ImagensModel> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id).map(ResponseEntity::ok)
                            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ImagensModel criarImagemModel(@RequestBody ImagensModel imagensModel){
        return service.criar(imagensModel);
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
    public ResponseEntity<ImagensModel> atualizar(@PathVariable Long id, @RequestBody ImagensModel imagensModel) {
        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        imagensModel.setId(id);
        return ResponseEntity.ok(service.atualizar(id, imagensModel));
    }

}
