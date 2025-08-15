package com;

import java.util.HashMap;
import java.util.Map;

// 1. Presentation Layer
class MovieUI {
    private MovieController controller = new MovieController();

    public void showMovieDetails(String movieName) {
        String details = controller.getMovieDetails(movieName);
        System.out.println(details);
    }

    public void bookTicket(String movieName) {
        String result = controller.bookMovieTicket(movieName);
        System.out.println(result);
    }
}

// 2. Application Layer (Controller)
class MovieController {
    private MovieService service = new MovieService();

    public String getMovieDetails(String movieName) {
        return service.fetchMovieDetails(movieName);
    }

    public String bookMovieTicket(String movieName) {
        return service.bookTicket(movieName);
    }
}

// 3. Business Logic Layer (Service)
class MovieService {
    private MovieDAO dao = new MovieDAO();

    public String fetchMovieDetails(String movieName) {
        String info = dao.getMovieInfo(movieName);
        if (info == null) {
            return "Movie not found!";
        }
        return "Movie Details: " + info;
    }

    public String bookTicket(String movieName) {
        boolean available = dao.checkAvailability(movieName);
        if (!available) {
            return "Sorry, tickets for " + movieName + " are sold out.";
        }
        dao.reduceSeatCount(movieName);
        return "Ticket booked successfully for " + movieName + "!";
    }
}

// 4. Data Access Layer (DAO)
class MovieDAO {
    private MovieDatabase db = new MovieDatabase();

    public String getMovieInfo(String movieName) {
        return db.queryMovie(movieName);
    }

    public boolean checkAvailability(String movieName) {
        return db.getSeats(movieName) > 0;
    }

    public void reduceSeatCount(String movieName) {
        db.decreaseSeats(movieName);
    }
}

// 5. Database Layer (DB)
class MovieDatabase {
    private Map<String, String> movieInfo = new HashMap<>();
    private Map<String, Integer> movieSeats = new HashMap<>();

    public MovieDatabase() {
        movieInfo.put("Inception", "Sci-Fi, Directed by Christopher Nolan");
        movieInfo.put("Avengers", "Action, Directed by Joss Whedon");

        movieSeats.put("Inception", 2);
        movieSeats.put("Avengers", 1);
    }

    public String queryMovie(String movieName) {
        return movieInfo.get(movieName);
    }

    public int getSeats(String movieName) {
        return movieSeats.getOrDefault(movieName, 0);
    }

    public void decreaseSeats(String movieName) {
        movieSeats.put(movieName, movieSeats.get(movieName) - 1);
    }
}

public class MultiTierDemo {
    public static void main(String[] args) {
        MovieUI ui = new MovieUI();

        ui.showMovieDetails("Inception");
        ui.bookTicket("Inception");
        ui.bookTicket("Inception");
        ui.bookTicket("Inception");
    }
}
