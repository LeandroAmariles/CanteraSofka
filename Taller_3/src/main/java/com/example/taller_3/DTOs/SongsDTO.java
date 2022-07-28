package com.example.taller_3.DTOs;

import com.example.taller_3.entities.PlayList;
import lombok.Data;

import java.util.Date;

@Data
public class SongsDTO {

    private long id;
    private String title;
    private Date date;
    private int duration;
    private String gender;
    private String image;
    private String description;
    private PlayList playList;
}
