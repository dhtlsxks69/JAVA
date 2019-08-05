import java.util.ArrayList;

public class Response2 {
	String status;
	String status_message;
	Data1 data = new Data1();
}

class Data1 {
	int movie_count;
	int limit;
	int page_number;
	ArrayList<Movie> movies = new ArrayList<>();
}

class Movie {
	String title;
	double rating;
	int year;
	String medium_cover_image;
}