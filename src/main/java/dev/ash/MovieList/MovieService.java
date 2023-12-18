package dev.ash.MovieList;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;
	public List<Movie> allMovies() {
		return movieRepository.findAll();
	}
}
