package code1_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Movie {
    private int movieId;
    private String movieName;
    private int movieRating;
    private int numberOfActors;
    private List<String> actors;
    
    // Constructor
    public Movie(int movieId, String movieName, int movieRating, int numberOfActors, List<String> actors) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.numberOfActors = numberOfActors;
        this.actors = actors;
    }
    
    // Getters and Setters
    public int getMovieId() {
        return movieId;
    }
    
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    
    public String getMovieName() {
        return movieName;
    }
    
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    
    public int getMovieRating() {
        return movieRating;
    }
    
    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }
    
    public int getNumberOfActors() {
        return numberOfActors;
    }
    
    public void setNumberOfActors(int numberOfActors) {
        this.numberOfActors = numberOfActors;
    }
    
    public List<String> getActors() {
        return actors;
    }
    
    public void setActors(List<String> actors) {
        this.actors = actors;
    }
}

class NoActorFoundException extends Exception {
    public NoActorFoundException(String message) {
        super(message);
    }
}

class MovieService {
    
    // Task 1: Fetch List of Movies Based on the Actor
    public List<Movie> findListMovie(List<Movie> movies, String actorName) {
        List<Movie> result = new ArrayList<>();
        
        for (Movie movie : movies) {
            for (String actor : movie.getActors()) {
                if (actor.equalsIgnoreCase(actorName)) {
                    result.add(movie);
                    break; // Found actor in this movie, no need to check other actors
                }
            }
        }
        
        if (result.isEmpty()) {
            System.out.println("No Movies Found");
        } else {
            for (Movie movie : result) {
                System.out.println(movie.getMovieId());
                System.out.println(movie.getMovieName());
                System.out.println(movie.getMovieRating());
            }
        }
        
        return result;
    }
    
    // Task 2: Calculate Average Movie Rating based on the Actor
    public double calculateAverageRating(List<Movie> movies, String actorName) throws NoActorFoundException {
        double totalRating = 0;
        int movieCount = 0;
        
        for (Movie movie : movies) {
            for (String actor : movie.getActors()) {
                if (actor.equalsIgnoreCase(actorName)) {
                    totalRating += movie.getMovieRating();
                    movieCount++;
                    break; // Found actor in this movie, no need to check other actors
                }
            }
        }
        
        if (movieCount == 0) {
            throw new NoActorFoundException("No Actor Found");
        }
        
        return totalRating / movieCount;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of movies
        int numberOfMovies = scanner.nextInt();
        List<Movie> movies = new ArrayList<>();
        
        // Read movie details
        for (int i = 0; i < numberOfMovies; i++) {
            int movieId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            String movieName = scanner.nextLine();
            int movieRating = scanner.nextInt();
            int numberOfActors = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            
            List<String> actors = new ArrayList<>();
            for (int j = 0; j < numberOfActors; j++) {
                String actor = scanner.nextLine();
                actors.add(actor);
            }
            
            movies.add(new Movie(movieId, movieName, movieRating, numberOfActors, actors));
        }
        
        // Read actor names for tasks
        String actorForTask1 = scanner.nextLine();
        String actorForTask2 = scanner.nextLine();
        
        // Create MovieService instance
        MovieService service = new MovieService();
        
        // Task 1: Find movies of actorForTask1
        service.findListMovie(movies, actorForTask1);
        
        // Task 2: Calculate average rating for actorForTask2
        try {
            double averageRating = service.calculateAverageRating(movies, actorForTask2);
            System.out.printf("Average Rating for the actor is: %.2f%n", averageRating);
        } catch (NoActorFoundException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}