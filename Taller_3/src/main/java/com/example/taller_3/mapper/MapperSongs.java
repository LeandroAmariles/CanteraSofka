package com.example.taller_3.mapper;

import com.example.taller_3.DTOs.SongsDTO;
import com.example.taller_3.entities.Songs;

public interface MapperSongs {

    public Songs DTOtoEntity(SongsDTO songsDTO);

    public SongsDTO EntitytoDTO(Songs song);
}
