package com.seduc2.oasis.Controller;

import com.seduc2.oasis.Entity.MusicaEntity;
import com.seduc2.oasis.Service.MusicaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/musicas")
public class MusicaController {

    private final MusicaService service;

    public MusicaController(MusicaService service) {
        this.service = service;
    }

    @GetMapping
    public List<MusicaEntity> mostrar() {
        return service.listar();
    }

    @PostMapping
    public void criar(@RequestBody MusicaEntity m) {
        service.salvar(m);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable int id, @RequestBody MusicaEntity m) {
        service.alterar(id, m);
    }
}
