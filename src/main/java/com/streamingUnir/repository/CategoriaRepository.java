package com.streamingUnir.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.streamingUnir.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
