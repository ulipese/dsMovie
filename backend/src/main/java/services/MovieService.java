package services;

import DTO.MovieDTO;
import entities.Movie;
import repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = movieRepository.findAll(pageable);
        Page<MovieDTO> page = result.map(movie -> new MovieDTO(movie));
        return page;
    }

    public MovieDTO findById(Long id) {
        Movie result = movieRepository.findById(id).get();
        MovieDTO movieDTO = new MovieDTO(result);
        return movieDTO;
    }
}

