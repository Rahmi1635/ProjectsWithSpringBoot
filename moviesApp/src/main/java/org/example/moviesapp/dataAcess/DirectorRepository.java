package org.example.moviesapp.dataAcess;

import org.example.moviesapp.entities.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director,Integer> {
}
