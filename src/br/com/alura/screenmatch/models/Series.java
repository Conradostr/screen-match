package br.com.alura.screenmatch.models;
import br.com.alura.screenmatch.calculations.Classificable;

public class Series extends Title implements Classificable {
    private int seasons;
    private int episodesPerSeasons;
    private boolean active;
    private int minutesPerEpisodes;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeasons() {
        return episodesPerSeasons;
    }

    public void setEpisodesPerSeasons(int episodesPerSeasons) {
        this.episodesPerSeasons = episodesPerSeasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesPerEpisodes() {
        return minutesPerEpisodes;
    }

    public void setMinutesPerEpisodes(int minutesPerEpisodes) {
        this.minutesPerEpisodes = minutesPerEpisodes;
    }

    @Override
    public double getDurationInMinutes(){
        return seasons * episodesPerSeasons * minutesPerEpisodes;
    }

    @Override
    public int getClassification() {
        if (totalViews >= 100) {
            return 4;
        }else {
            return 2;
        }

    }
}

