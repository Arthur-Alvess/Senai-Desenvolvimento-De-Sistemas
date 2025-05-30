package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Model.AlunosModel;

public interface AlunosRepository extends JpaRepository<AlunosModel, Long> {
}