package org.example.moviesapp.dataAcess;

import org.example.moviesapp.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
