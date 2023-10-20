package br.com.alura.screenmatch.models;

public class Title implements Comparable<Title> {
    private String name;
    private int yerRelease;
    private double durationInMinutes;
    private boolean includedInThePlan = true;
    private double sumOfRatings;
    private int totalReviews;

    public Title(String name, int yerRelease) {
        this.name = name;
        this.yerRelease = yerRelease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYerRelease() {
        return yerRelease;
    }

    public void setYerRelease(int yerRelease) {
        this.yerRelease = yerRelease;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void showTechnicalSheet() {
        System.out.println("Nome: " + name);
        System.out.println("Ano de Lançamento: " + yerRelease);
        System.out.println("Duração: " + durationInMinutes + "minutos");
    }

    public void evaluate(double note) {
        sumOfRatings += note;
        totalReviews++;
    }

    public double getAverage() {
        return sumOfRatings / totalReviews;
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getName().compareTo(anotherTitle.getName());
    }
}
