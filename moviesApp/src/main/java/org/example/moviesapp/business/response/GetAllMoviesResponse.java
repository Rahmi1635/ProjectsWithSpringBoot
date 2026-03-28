package org.example.moviesapp.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllMoviesResponse {

    private int id;
    private String name;
    private int duration;

}
