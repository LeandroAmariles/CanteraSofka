package com.example.taller_3.servicesIMP;

import com.example.taller_3.DTOs.PlayListDTO;
import com.example.taller_3.repository.PlayListRepository;
import com.example.taller_3.services.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayListServiceimpl implements PlayListService {

    @Autowired
    private PlayListRepository playListRepository;


    @Override
    public List<PlayListDTO> listPlayList() {
        return null;
    }

    @Override
    public PlayListDTO createNewPlayList(PlayListDTO playListDTO) {
        return null;
    }

    @Override
    public PlayListDTO deletePlayList(long id) {
        return null;
    }

    @Override
    public PlayListDTO updatePlayList(long id, PlayListDTO playListDTO) {
        return null;
    }
}
