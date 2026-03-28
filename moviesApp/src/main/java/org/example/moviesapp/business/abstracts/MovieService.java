package org.example.moviesapp.business.abstracts;

import org.example.moviesapp.business.request.CreateMovieRequest;
import org.example.moviesapp.business.request.UpdateMovieRequest;
import org.example.moviesapp.business.response.GetAllMoviesResponse;
import org.example.moviesapp.business.response.GetByIdMovieResponse;

import java.util.List;

public interface MovieService {

    List<GetAllMoviesResponse> getAll();

    GetByIdMovieResponse getById(int id);

    void add(CreateMovieRequest createMovieRequest);

    void update(UpdateMovieRequest updateMovieRequest);

    void delete(int id);

}
