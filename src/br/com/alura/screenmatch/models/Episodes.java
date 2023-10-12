package br.com.alura.screenmatch.models;

public class Episodes {
    private String name;
    private int number;
    private Series serie;

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
