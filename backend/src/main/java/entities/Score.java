package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_score")
public class Score {
    @EmbeddedId
    private ScorePK id = new ScorePK(); // como o score é basedo no user e no movie, é uma pk composta, e usamos o ScorePK para fazer essa junção
    private Double value;


    public Score() {}

    public void setMovie(Movie movie) {
        id.setMovie(movie); // set movie in score pk
    }
    public void setUser(User user) {
        id.setUser(user);
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public ScorePK getId() {
        return id;
    }

    public void setId(ScorePK id) {
        this.id = id;
    }
}
