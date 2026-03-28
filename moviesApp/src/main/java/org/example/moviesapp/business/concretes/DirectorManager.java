package org.example.moviesapp.business.concretes;

import lombok.AllArgsConstructor;
import org.example.moviesapp.business.abstracts.DirectorService;
import org.example.moviesapp.business.request.CreateDirectorRequest;
import org.example.moviesapp.business.request.UpdateDirectorRequest;
import org.example.moviesapp.business.response.GetAllDirectorsResponse;
import org.example.moviesapp.business.response.GetByIdDirectorResponse;
import org.example.moviesapp.business.response.MovieSummaryResponse;
import org.example.moviesapp.core.mappers.ModelMapperService;
import org.example.moviesapp.dataAcess.DirectorRepository;
import org.example.moviesapp.entities.Director;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DirectorManager implements DirectorService {

    private DirectorRepository directorRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllDirectorsResponse> getAll() {

        List<Director> directors=directorRepository.findAll();

        List<GetAllDirectorsResponse> directorsResponse=directors.stream()
                .map(director -> this.modelMapperService.forResponse().map(director,GetAllDirectorsResponse.class))
                .collect(Collectors.toList());

        return directorsResponse;

    }

    @Override
    public GetByIdDirectorResponse getById(int id) {

        Director director=this.directorRepository.findById(id).orElseThrow();

        GetByIdDirectorResponse getByIdDirectorResponse = this.modelMapperService.forResponse().map(director, GetByIdDirectorResponse.class);

        getByIdDirectorResponse.setMovies(
                director.getMovies().stream()
                        .map(movie -> new MovieSummaryResponse(
                                movie.getId(),
                                movie.getName(),
                                movie.getDuration()
                        ))
                        .toList()

        );

        return getByIdDirectorResponse;
    }

    @Override
    public void add(CreateDirectorRequest createDirectorRequest) {

        Director director=this.modelMapperService.forRequest().map(createDirectorRequest,Director.class);
        this.directorRepository.save(director);

    }

    @Override
    public void update(UpdateDirectorRequest updateDirectorRequest) {

        Director director=this.modelMapperService.forRequest().map(updateDirectorRequest,Director.class);
        this.directorRepository.save(director);

    }
}
