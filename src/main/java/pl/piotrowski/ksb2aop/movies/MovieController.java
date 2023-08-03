package pl.piotrowski.ksb2aop.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    MovieRepository movieRepository;

    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getMoviesList() {
        return new ResponseEntity<>(movieRepository.getMovieList(), HttpStatus.OK);
    }

    @SendCreatedMovieConfirmationMail
    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        if (movieRepository.isMovieExist(movie)) {
            return new ResponseEntity<>(HttpStatus.ALREADY_REPORTED);
        }

        movieRepository.addMovie(movie);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }
}
