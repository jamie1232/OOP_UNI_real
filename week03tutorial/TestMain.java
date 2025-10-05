package week03tutorial;

public class TestMain {

    public static void main(String[] args) {
        System.out.println("=== Director & Date test ===");
        Director director = new Director("James", "Cameron");
        Date dob = new Date(16, 8, 1984);
        director.setDoB(dob);
        director.setNumberOfMovie(23);

        System.out.println(director);
        System.out.println("name is: " + director.getName());
        System.out.println("surname is: " + director.getSurname());
        System.out.println("dob is: " + director.getDoB().getDate());
        System.out.println("number of directed movies is: " + director.getNumberOfMovie());

        System.out.println("\n=== Movie test ===");
        Movie movie = new Movie("Avatar", "Fantasy", director);
        System.out.println(movie);
        movie.setNumAwards(3);
        System.out.println(movie);
        System.out.println("title is: " + movie.getTitle());
        System.out.println("category is: " + movie.getCategory());
        System.out.println("name of director is: " + movie.getDirector().getName());
        System.out.println("surname of director is: " + movie.getDirector().getSurname());
        System.out.println("number of awards is " + movie.getNumAwards());

        System.out.println("\n=== Actor array in Movie (extra exercise) ===");
        Actor a1 = new Actor("Sam", "Worthington", 46);
        Actor a2 = new Actor("Zoe", "Saldana", 38);
        movie.addActor(a1);
        movie.addActor(a2);

        Actor[] actors = movie.getActors();
        for (Actor a : actors) {
            if (a != null) {
                System.out.println(a);
            }
        }

        System.out.println("\n=== Static vs Instance variables ===");
        IdentifyVariables a = new IdentifyVariables();
        IdentifyVariables b = new IdentifyVariables();

        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;

        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyVariables.x = " + IdentifyVariables.x);
    }
}
