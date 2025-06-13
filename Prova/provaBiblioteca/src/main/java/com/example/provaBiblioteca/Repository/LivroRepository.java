package com.example.provaBiblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.provaBiblioteca.Model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
