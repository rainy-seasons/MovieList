package dev.ash.MovieList;

import lombok.Data;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "movies")
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

	@Id
	private ObjectId id;
	private String imdbId;
	private String title;
	private String releaseDate;
	private String trailerLink;
	private String poster;
	private List<String> genres;
	private List<String> backdrops;
	@DocumentReference // Store only the ID's
	private List<Review> reviewIds;
}
