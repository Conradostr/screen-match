package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private double timeTotal;

    public double getTimeTotal() {
        return timeTotal;
    }

    public void includs(Title title){
        timeTotal += title.getDurationInMinutes();
    }
}
