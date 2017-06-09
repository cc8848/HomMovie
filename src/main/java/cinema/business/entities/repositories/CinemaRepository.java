package cinema.business.entities.repositories;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cinema.business.entities.Cinema;

public class CinemaRepository {
    private static final CinemaRepository INSTANCE = new CinemaRepository();
    private final Map<Integer,Cinema> cinemasById;

    public static CinemaRepository getInstance() {
        return INSTANCE;
    }
   
    private CinemaRepository() {
        super();
        this.cinemasById = new LinkedHashMap<Integer, Cinema>();
    }
    
    public void addCinema(Cinema cinema) {
    	this.cinemasById.put(cinema.getId(), cinema);
    }

    public void deleteCinema(Cinema cinema) {
    	this.cinemasById.remove(cinema.getId());
    }
    
    public List<Cinema> findAll() {
        return new ArrayList<Cinema>(this.cinemasById.values());
    }
    
    public Cinema findById(final Integer id) {
        return this.cinemasById.get(id);
    }
    
}
