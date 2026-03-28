package org.example.moviesapp.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateMovieRequest {

    private String name;
    private int duration;
    private int directorId;

}
