package org.example.moviesapp.business.concretes;

import lombok.AllArgsConstructor;
import org.example.moviesapp.business.abstracts.MovieService;
import org.example.moviesapp.business.request.CreateMovieRequest;
import org.example.moviesapp.business.request.UpdateMovieRequest;
import org.example.moviesapp.business.response.GetAllMoviesResponse;
import org.example.moviesapp.business.response.GetByIdMovieResponse;
import org.example.moviesapp.core.mappers.ModelMapperService;
import org.example.moviesapp.dataAcess.DirectorRepository;
import org.example.moviesapp.dataAcess.MovieRepository;
import org.example.moviesapp.entities.Director;
import org.example.moviesapp.entities.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MovieManager implements MovieService {

    private MovieRepository movieRepository;
    private ModelMapperService modelMapperService;
    private DirectorRepository directorRepository;

    @Override
    public List<GetAllMoviesResponse> getAll() {

        List<Movie> movies=movieRepository.findAll();

        List<GetAllMoviesResponse> movieResponse=movies.stream()
                .map(movie -> this.modelMapperService.forResponse().map(movie, GetAllMoviesResponse.class))
                .collect(Collectors.toList());

        return movieResponse;
    }

    @Override
    public void add(CreateMovieRequest createMovieRequest) {

        Director director=directorRepository.findById(createMovieRequest.getDirectorId()).orElseThrow();

        Movie movie=new Movie();
        movie.setName(createMovieRequest.getName());
        movie.setDuration(createMovieRequest.getDuration());
        movie.setDirector(director);

        movieRepository.save(movie);
    }

    @Override
    public GetByIdMovieResponse getById(int id) {
        Movie movie=this.movieRepository.findById(id).orElseThrow();
        GetByIdMovieResponse movieResponse=this.modelMapperService.forResponse().map(movie,GetByIdMovieResponse.class);
        return movieResponse;
    }

    @Override
    public void update(UpdateMovieRequest updateMovieRequest) {

        Movie movie=this.modelMapperService.forRequest().map(updateMovieRequest,Movie.class);
        movieRepository.save(movie);
    }

    @Override
    public void delete(int id) {

        this.movieRepository.deleteById(id);

    }
}
