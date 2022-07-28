package com.example.taller_3.services;

import com.example.taller_3.DTOs.PlayListDTO;

import java.util.List;

public interface PlayListService {

    public List<PlayListDTO> listPlayList();

    public PlayListDTO createNewPlayList(PlayListDTO playListDTO);

    public PlayListDTO deletePlayList(long id);

    public PlayListDTO updatePlayList(long id, PlayListDTO playListDTO);


}
