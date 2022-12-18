package api.consumir.TheMoviesDb.Services;

import api.consumir.TheMoviesDb.Models.MoviesModels;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MoviesServices {
    ResponseEntity<List<MoviesModels>> searchMovies();
}
