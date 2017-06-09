package cinema.business.entities.repositories;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cinema.business.entities.Movie;


public class MovieRepository {
    private static final MovieRepository INSTANCE = new MovieRepository();
    private final Map<Integer,Movie>moviesById;

    public static MovieRepository getInstance() {
        return INSTANCE;
    }

    private MovieRepository() {
        super();
        this.moviesById = new LinkedHashMap<Integer, Movie>();
    }
    
    public void addMovie(Movie movie) {
    	this.moviesById.put(movie.getId(), movie);
    }

    public void deleteMovie(Movie movie) {
    	this.moviesById.remove(movie.getId());
    }
    
    public List<Movie> findAll() {
        return new ArrayList<Movie>(this.moviesById.values());
    }
    
    public Movie findById(final Integer id) {
        return this.moviesById.get(id);
    }
    
}
