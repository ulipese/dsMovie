package controllers;

import DTO.MovieDTO;
import DTO.ScoreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import services.MovieService;
import services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public MovieDTO saveScore (@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = scoreService.saveScore(dto);
        return movieDTO;
    }
}
