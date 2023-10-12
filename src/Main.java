import br.com.alura.screenmatch.models.Episodes;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {

        Movie topGun = new Movie();
        topGun.setName("Top Gun Maverick");
        topGun.setDurationInMinutes(131);
        topGun.setYerRelease(2022);

        Series naruto = new Series();

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
    }
}
