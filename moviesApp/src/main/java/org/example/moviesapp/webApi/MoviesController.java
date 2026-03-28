package org.example.moviesapp.webApi;

import lombok.AllArgsConstructor;
import org.example.moviesapp.business.abstracts.MovieService;
import org.example.moviesapp.business.request.CreateMovieRequest;
import org.example.moviesapp.business.request.UpdateMovieRequest;
import org.example.moviesapp.business.response.GetAllMoviesResponse;
import org.example.moviesapp.business.response.GetByIdMovieResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/movies")
@AllArgsConstructor
public class MoviesController {

    private MovieService movieService;

    @PostMapping("/add")
    @ResponseStatus(code=HttpStatus.CREATED)
    public void add(@RequestBody() CreateMovieRequest movieRequest)
    {
        this.movieService.add(movieRequest);
    }

    @GetMapping("/getAll")
    public List<GetAllMoviesResponse> getAll()
    {
        return this.movieService.getAll();
    }

    @GetMapping("{id}")
    public GetByIdMovieResponse getById(@PathVariable int id)
    {
        return movieService.getById(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateMovieRequest updateMovieRequest)
    {
        this.movieService.update(updateMovieRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id)
    {
        this.movieService.delete(id);
    }


}
