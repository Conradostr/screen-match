package br.com.alura.screenmatch.models;
import br.com.alura.screenmatch.calculations.Classificable;

public class Movie extends Title implements Classificable {
    private String director;

    public Movie(String name, int yerRelease) {
        super(name, yerRelease);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }

    @Override
    public String toString() {
        return "O nome do filme é: " + getName() + " (" + getYerRelease() + ")";
    }
}
