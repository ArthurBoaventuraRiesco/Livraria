package com.examplo.livrariaapi.repository;

import com.examplo.livrariaapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
