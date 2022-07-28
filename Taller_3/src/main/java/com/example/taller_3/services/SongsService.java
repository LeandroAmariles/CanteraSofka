package com.example.taller_3.services;

import com.example.taller_3.DTOs.SongsDTO;

import java.util.List;

public interface SongsService {

    public SongsDTO addSongToLibrary(SongsDTO song);

    public List<SongsDTO> assignSongToPlayList(Long idPlayList, List<SongsDTO> songsDTOS);

    public List<SongsDTO> listSongs();

    public SongsDTO deleteSong(long id);

    public SongsDTO updateSong(long id, SongsDTO songsDTO);
}
