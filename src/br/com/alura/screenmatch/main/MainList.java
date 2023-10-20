package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainList {
    public static void main(String[] args) {
        Movie topGun = new Movie("Top Gun Maverick", 2022);
        Series naruto = new Series("naruto", 1999);
        Movie avatar = new Movie("Avatar", 2022);

        ArrayList<Title> list = new ArrayList<>();
        list.add(topGun);
        list.add(naruto);
        list.add(avatar);

        topGun.evaluate(8.6);
        avatar.evaluate(8.6);

        for (Title item: list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie) {
                System.out.println(movie.getClassification());
            }
        }

        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.comparing(Title::getYerRelease));
        System.out.println(list);
    }
}
