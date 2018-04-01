package sparkes.recommender.movies;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Movie implements Serializable {

    private String movieId;
    private String title;
    private String genres;
    private List<String> genres_list;
    private String imdbId;
    private String tmdbId;
    transient Map<String, AlsModel> featureVector;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(final String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(final String genres) {
        this.genres = genres;
        this.genres_list = Arrays.asList(genres.split("\\|"));
    }

    public List<String> getGenres_list() {
        return genres_list;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(final String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTmdbId() {
        return tmdbId;
    }

    public void setTmdbId(final String tmdbId) {
        this.tmdbId = tmdbId;
    }

    public Map<String, AlsModel>  getFeatureVector() {
        return featureVector;
    }

    public void setFeatureVector(final Map<String, AlsModel>  featureVector) {
        this.featureVector = featureVector;
    }

    public boolean anyNull() {
        if (movieId == null || title == null || genres == null) {
            return true;
        }
        return false;
    }
}
