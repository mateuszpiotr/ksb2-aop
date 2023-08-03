package pl.piotrowski.ksb2aop.movies;

public class Movie {
    private final int id;
    private String name;
    private String releaseDate;
    private String producer;

    public Movie(int id, String name, String releaseDate, String producer) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
