package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {}