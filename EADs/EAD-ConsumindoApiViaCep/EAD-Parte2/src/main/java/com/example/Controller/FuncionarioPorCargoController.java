package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Model.FuncionarioPorCargo;
import com.example.Service.FuncionarioPorCargoService;

import java.util.List;

@RestController
@RequestMapping("/funcionariosPorCargo")
public class FuncionarioPorCargoController {

    @Autowired
    private FuncionarioPorCargoService service;

    @PostMapping
    public ResponseEntity<FuncionarioPorCargo> create(@RequestBody FuncionarioPorCargo fpc) {
        return ResponseEntity.ok(service.save(fpc));
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioPorCargo>> getAll(
            @RequestParam(required = false) Long cargoId,
            @RequestParam(required = false) Long funcionarioId) {

        if (cargoId != null) {
            return ResponseEntity.ok(service.findByCargoId(cargoId));
        } else if (funcionarioId != null) {
            return ResponseEntity.ok(service.findByFuncionarioId(funcionarioId));
        }

        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioPorCargo> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioPorCargo> update(
            @PathVariable Long id,
            @RequestBody FuncionarioPorCargo atualizado) {

        return service.findById(id).map(fpc -> {
            atualizado.setId(fpc.getId());
            return ResponseEntity.ok(service.save(atualizado));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}