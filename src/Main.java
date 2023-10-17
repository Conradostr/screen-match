import br.com.alura.screenmatch.models.Episodes;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Movie topGun = new Movie("Top Gun Maverick", 2022);
        topGun.setDurationInMinutes(131);


        Series naruto = new Series("naruto", 1999);

        topGun.showTechnicalSheet();
        topGun.evaluate(8.6);
        topGun.evaluate(7.5);
        topGun.evaluate(10);
        topGun.evaluate(8.3);
        topGun.evaluate(9.6);
        topGun.evaluate(8.6);

        System.out.println("A média é: " + topGun.getAverage());

        Episodes episodeOne = new Episodes();
        episodeOne.setName("Bem vindo de volta");
        episodeOne.setNumber(1);
        episodeOne.setSerie(naruto);

        Movie avatar = new Movie("Avatar", 2022);
        avatar.setDurationInMinutes(200);


        ArrayList<Movie> moviesList = new ArrayList<Movie>();

        moviesList.add(topGun);
        moviesList.add(avatar);

        System.out.println(moviesList);
    }
}
