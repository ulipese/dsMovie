package controllers;

import DTO.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import services.MovieService;

@RestController
@RequestMapping(value = "/movies")
@CrossOrigin
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public Page<MovieDTO> findAll(Pageable pageable) {
        return movieService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public MovieDTO findById(@PathVariable Long id) {
        return movieService.findById(id);
    }
}
