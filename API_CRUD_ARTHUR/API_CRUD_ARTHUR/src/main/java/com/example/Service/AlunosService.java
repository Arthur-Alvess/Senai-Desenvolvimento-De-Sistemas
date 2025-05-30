package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.AlunosModel;
import com.example.Repository.AlunosRepository;

@Service
public class AlunosService {

    @Autowired
    private AlunosRepository repository;

    public List<AlunosModel> listarTodos(){
        return repository.findAll();
    }

    public Optional<AlunosModel> buscarPorId(Long id){
        return repository.findById(id);
    }

    public AlunosModel criar(AlunosModel alunosModel){
        return repository.save(alunosModel);
    }

    public AlunosModel atualizar(Long id, AlunosModel alunosModel){
        return repository.save(alunosModel);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
