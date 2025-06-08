package com.examplo.livrariaapi.service;

import com.examplo.livrariaapi.model.Livro;
import com.examplo.livrariaapi.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public List<Livro> listar() { return repository.findAll(); }
    public Livro buscar(Long id) { return repository.findById(id).orElse(null); }
    public Livro salvar(Livro livro) { return repository.save(livro); }
    public Livro atualizar(Long id, Livro livro) {
        livro.setId(id);
        return repository.save(livro);
    }
    public void deletar(Long id) { repository.deleteById(id); }
}
