package com.examplo.livrariaapi.repository;

import com.examplo.livrariaapi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
