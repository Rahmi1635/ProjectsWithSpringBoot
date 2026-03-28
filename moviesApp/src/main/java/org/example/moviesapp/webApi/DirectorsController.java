package org.example.moviesapp.webApi;

import lombok.AllArgsConstructor;
import org.example.moviesapp.business.abstracts.DirectorService;
import org.example.moviesapp.business.request.CreateDirectorRequest;
import org.example.moviesapp.business.request.UpdateDirectorRequest;
import org.example.moviesapp.business.response.GetAllDirectorsResponse;
import org.example.moviesapp.business.response.GetByIdDirectorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/directors")
@AllArgsConstructor
public class DirectorsController {

    private DirectorService directorService;

    @GetMapping("/getAll")
    public List<GetAllDirectorsResponse> getAll()
    {
        return this.directorService.getAll();
    }

    @GetMapping("{id}")
    public GetByIdDirectorResponse getById(@PathVariable int id)
    {
        return this.directorService.getById(id);
    }

    @PostMapping("/add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody CreateDirectorRequest createDirectorRequest)
    {
        this.directorService.add(createDirectorRequest);
    }

    @PutMapping
    public void update(@RequestBody UpdateDirectorRequest updateDirectorRequest)
    {
        this.directorService.update(updateDirectorRequest);
    }

}
