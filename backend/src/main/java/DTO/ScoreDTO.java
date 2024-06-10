package DTO;

import entities.Movie;
import entities.User;

public class ScoreDTO {
    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;
    private String email;
    private User user;

    // Construtor padrão
    public ScoreDTO() {}

    // Construtor com parâmetros
    public ScoreDTO(Long id, String title, Double score, Integer count, String image, String email) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.count = count;
        this.image = image;
        this.email = email;
    }

    // Construtor que recebe uma entidade Movie
    public ScoreDTO(Movie movie) {
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.score = movie.getScore();
        this.count = movie.getCount();
        this.image = movie.getImage();
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
