package com.example.provaBiblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.provaBiblioteca.Model.Bibliotecario;

public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Long>{

}
