package com.seduc2.oasis.Service;

import com.seduc2.oasis.Entity.MusicaEntity;
import com.seduc2.oasis.Repository.MusicaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {

    private final MusicaRepository repo;

    public MusicaService(MusicaRepository repo) {
        this.repo = repo;
    }

    public List<MusicaEntity> listar() {
        return repo.findAll();
    }

    public void salvar(MusicaEntity m) {

        MusicaEntity musica = new MusicaEntity();

        musica.setNome(m.getNome());
        musica.setArtista(m.getArtista());
        musica.setAlbum(m.getAlbum());
        musica.setGenero(m.getGenero());
        musica.setDuracao(m.getDuracao());

        repo.save(musica);
    }

    public void deletar(int id) {
        repo.deleteById(id);
    }

    @Transactional
    public void alterar(int id, MusicaEntity m) {

        MusicaEntity musica = repo.getReferenceById(id);

        musica.setNome(m.getNome());
        musica.setArtista(m.getArtista());
        musica.setAlbum(m.getAlbum());
        musica.setGenero(m.getGenero());
        musica.setDuracao(m.getDuracao());
    }
}