package com.example.taller_3.mapperIMPL;

import com.example.taller_3.DTOs.SongsDTO;
import com.example.taller_3.entities.Songs;
import com.example.taller_3.mapper.MapperSongs;

public class MapperSongIMPL implements MapperSongs {
    @Override
    public Songs DTOtoEntity(SongsDTO songsDTO) {
        Songs song = new Songs();
        song.setId(songsDTO.getId());
        song.setDate(songsDTO.getDate());
        song.setDescription(songsDTO.getDescription());
        song.setDuration(songsDTO.getDuration());
        song.setGender(songsDTO.getGender());
        song.setImage(songsDTO.getImage());
        song.setTitle(song.getTitle());
        song.setPlayList(songsDTO.getPlayList());
        return song;
    }

    @Override
    public SongsDTO EntitytoDTO(Songs song) {
        SongsDTO songD = new SongsDTO();
        songD.setDate(song.getDate());
        songD.setDescription(song.getDescription());
        songD.setDuration(song.getDuration());
        songD.setGender(song.getGender());
        songD.setImage(song.getImage());
        songD.setId(song.getId());
        songD.setTitle(song.getTitle());
        songD.setPlayList(song.getPlayList());
        return songD;
    }
}
