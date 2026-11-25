package com.seduc2.oasis.Repository;

import com.seduc2.oasis.Entity.MusicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends JpaRepository<MusicaEntity, Integer> {
}
