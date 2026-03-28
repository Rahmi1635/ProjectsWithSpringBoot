package org.example.moviesapp.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Table(name="types")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @ManyToMany(mappedBy = "types")
    private List<Movie> movies;


}
