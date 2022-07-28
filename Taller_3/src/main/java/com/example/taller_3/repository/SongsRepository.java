package com.example.taller_3.repository;

import com.example.taller_3.entities.Songs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongsRepository extends JpaRepository<Songs,Long> {
}
