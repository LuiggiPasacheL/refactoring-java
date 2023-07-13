
import java.util.HashMap;

public class MovieRental {

    private String movieId;
    private int days;

    public MovieRental(String movieId, int days) {
        this.movieId = movieId;
        this.days = days;
    }

    public String getMovieId() {
        return movieId;
    }

    public int getDays() {
        return days;
    }

    public double calculateAmount(HashMap<String, Movie> movies) {
        double thisAmount = 0;

        // determine amount for each movie
        if (movies.get(getMovieId()).getCode().equals("regular")) {
            thisAmount = 2;
            if (getDays() > 2) {
                thisAmount = ((getDays() - 2) * 1.5) + thisAmount;
            }
        }
        if (movies.get(getMovieId()).getCode().equals("new")) {
            thisAmount = getDays() * 3;
        }
        if (movies.get(getMovieId()).getCode().equals("childrens")) {
            thisAmount = 1.5;
            if (getDays() > 3) {
                thisAmount = ((getDays() - 3) * 1.5) + thisAmount;
            }
        }

        return thisAmount;
    }
}
