package org.example.moviesapp.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdDirectorResponse {

    private int id;
    private String name;

    private List<MovieSummaryResponse> movies;

}
