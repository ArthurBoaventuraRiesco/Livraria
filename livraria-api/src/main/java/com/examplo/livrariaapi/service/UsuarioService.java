package com.examplo.livrariaapi.service;

import com.examplo.livrariaapi.model.Usuario;
import com.examplo.livrariaapi.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> listar() { return repository.findAll(); }
    public Usuario buscar(Long id) { return repository.findById(id).orElse(null); }
    public Usuario salvar(Usuario usuario) { return repository.save(usuario); }
    public Usuario atualizar(Long id, Usuario usuario) {
        usuario.setId(id);
        return repository.save(usuario);
    }
    public void deletar(Long id) { repository.deleteById(id); }
}