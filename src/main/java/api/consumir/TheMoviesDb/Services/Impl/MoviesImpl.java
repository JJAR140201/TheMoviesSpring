package api.consumir.TheMoviesDb.Services.Impl;

import api.consumir.TheMoviesDb.Models.MoviesModels;
import api.consumir.TheMoviesDb.Services.MoviesServices;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Service("MovieServices")
public class MoviesImpl implements MoviesServices {

    // Creating a logger object.
    public static final Logger logger = (Logger) LoggerFactory.getLogger(MoviesImpl.class);

    // Injecting the RestTemplate class into the MoviesImpl class.
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ResponseEntity<List<MoviesModels>> searchMovies() {
        logger.info("Iniciando Busqueda de pelicula");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<MoviesModels> entity = new HttpEntity<>(headers);

        ResponseEntity<List<MoviesModels>> response = restTemplate.exchange(
                "https://api.themoviedb.org/3/search/movie?api_key=19eeb79824e73188417a3488a1133fbe",
                HttpMethod.GET, entity, new ParameterizedTypeReference<List<MoviesModels>>() {
                });
        logger.info("Response {}");
        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    }
}
