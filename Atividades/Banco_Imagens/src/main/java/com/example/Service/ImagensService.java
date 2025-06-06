package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.ImagensModel;
import com.example.Repository.ImagensRepository;

@Service
public class ImagensService {

    @Autowired
    private ImagensRepository repository;

    public List<ImagensModel> listarTodos(){
        return repository.findAll();
    }

    public Optional<ImagensModel> buscarPorId(Long id){
        return repository.findById(id);
    }

    public ImagensModel criar(ImagensModel alunosModel){
        return repository.save(alunosModel);
    }

    public ImagensModel atualizar(Long id, ImagensModel imagensModel){
        return repository.save(imagensModel);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
