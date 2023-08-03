package pl.piotrowski.ksb2aop.movies;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {
    private final List<Movie> movieList;

    public MovieRepository() {
        this.movieList = new ArrayList<>();

        Movie barbie = new Movie(1,
                "Barbie",
                "24-07-2023",
                "Greta Gerwig");
        Movie theSilenceOfTheLambs = new Movie(2,
                "The silence of the lambs",
                "14-02-1991",
                "Jonathan Demme");

        movieList.add(barbie);
        movieList.add(theSilenceOfTheLambs);
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public boolean isMovieExist(Movie movie) {
        return movieList.contains(movie);
    }
}
