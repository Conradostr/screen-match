package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exception.YearConversionErrorException;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reading = new Scanner(System.in);
        String op = "";
        List<Title> myFilms = new ArrayList<>();

        while (!op.equalsIgnoreCase("sair")){


            System.out.println("Busca de filme: ");
            String search = reading.nextLine();

            if(op.equalsIgnoreCase("sair")){
                break;
            }

            String address = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=71886541";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(address)).build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                System.out.println(response.body());

                var json = response.body();


                Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
                TitleOmdb titleOmdb = gson.fromJson(json, TitleOmdb.class);
                Title myTitle = new Title(titleOmdb);

                myFilms.add(myTitle);


                System.out.println(myTitle);

            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }catch (YearConversionErrorException e){
                System.out.println(e.getMessage());
            }



        }
        System.out.println(myFilms);
        System.out.println("Código executado corretamente");

    }
}
