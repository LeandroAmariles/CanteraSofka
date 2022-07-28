package com.example.taller_3.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class PlayList {

    @Id
    private long id;

   @OneToMany
   private List<Songs> songsList;
}
