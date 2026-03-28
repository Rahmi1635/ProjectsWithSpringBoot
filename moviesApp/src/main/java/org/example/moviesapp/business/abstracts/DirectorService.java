package org.example.moviesapp.business.abstracts;

import org.example.moviesapp.business.request.CreateDirectorRequest;
import org.example.moviesapp.business.request.UpdateDirectorRequest;
import org.example.moviesapp.business.response.GetAllDirectorsResponse;
import org.example.moviesapp.business.response.GetByIdDirectorResponse;

import java.util.List;

public interface DirectorService {

    List<GetAllDirectorsResponse> getAll();

    GetByIdDirectorResponse getById(int id);

    void add(CreateDirectorRequest createDirectorRequest);

    void update(UpdateDirectorRequest updateDirectorRequest);

}
