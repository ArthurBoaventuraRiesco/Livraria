package com.examplo.livrariaapi.controller;

import com.examplo.livrariaapi.model.Livro;
import com.examplo.livrariaapi.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Livro> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Livro buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PostMapping
    public Livro salvar(@RequestBody Livro livro) {
        return service.salvar(livro);
    }

    @PutMapping("/{id}")
    public Livro atualizar(@PathVariable Long id, @RequestBody Livro livro) {
        return service.atualizar(id, livro);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
