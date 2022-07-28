package com.example.taller_3.servicesIMP;

import com.example.taller_3.DTOs.SongsDTO;
import com.example.taller_3.entities.PlayList;
import com.example.taller_3.entities.Songs;
import com.example.taller_3.mapperIMPL.MapperSongIMPL;
import com.example.taller_3.repository.PlayListRepository;
import com.example.taller_3.repository.SongsRepository;
import com.example.taller_3.services.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SongsServiceImpl implements SongsService {

    @Autowired
    private SongsRepository songsRepository;

    @Autowired
    private PlayListRepository playListRepository;

    private MapperSongIMPL mapper;

    @Override
    public SongsDTO addSongToLibrary(SongsDTO song) {
        Songs songNew = songsRepository.save(mapper.DTOtoEntity(song));
        return song;
    }

    @Override
    public List<SongsDTO> assignSongToPlayList(Long id, List<SongsDTO> songsDTOS) {
        PlayList playList = playListRepository.findById(id).orElseThrow();
        return null;
    }

    @Override
    public List<SongsDTO> listSongs() {
        List<Songs> list = songsRepository.findAll();
        List<SongsDTO> list2= list.stream().map((x) -> mapper.EntitytoDTO(x)).collect(Collectors.toList());
        return list2;

    }

    @Override
    public SongsDTO deleteSong(long id) {
        return null;
    }

    @Override
    public SongsDTO updateSong(long id, SongsDTO songsDTO) {
        return null;
    }
}
