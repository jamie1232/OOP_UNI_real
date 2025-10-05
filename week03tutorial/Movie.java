package week03tutorial;

public class Movie {

    private String title;
    private String category;
    private int numAwards;
    private Director director;
    private Actor[] actors;

    public Movie(String title, String category, Director director) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.numAwards = 0;
        this.actors = new Actor[10];
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Director getDirector() {
        return director;
    }

    public void setNumAwards(int numAward) {
        if (numAward < 0) {
            throw new IllegalArgumentException("Number of awards cannot be negative.");
        }
        this.numAwards = numAward;
    }

    public int getNumAwards() {
        return numAwards;
    }

    public boolean addActor(Actor actor) {
        for (int i = 0; i < actors.length; i++) {
            if (actors[i] == null) {
                actors[i] = actor;
                return true;
            }
        }
        return false;
    }

    public Actor[] getActors() {
        return actors.clone();
    }

    @Override
    public String toString() {
        String dirName = (director == null) ? "N/A" : director.getName();
        String dirSurname = (director == null) ? "N/A" : director.getSurname();
        return "Movie [ title = " + title + ", category = " + category + ", director name = "
                + dirName + ", director surname = " + dirSurname + ", number of awards = " + numAwards + " ]";
    }
}
