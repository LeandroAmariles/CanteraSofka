package com.example.taller_3.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Songs {

    @Id
    private long id;
    private String title;
    private Date date;
    private int duration;
    private String gender;
    private String image;
    private String description;
    @ManyToOne
    private PlayList playList;

}
