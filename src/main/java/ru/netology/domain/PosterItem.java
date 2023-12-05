package ru.netology.domain;

public class PosterItem {
    private String filmName;
    private String filmCategory;
    private boolean premiereTomorrow;

    public PosterItem(String filmName, String filmCategory, boolean premiereTomorrow) {
        this.filmName = filmName;
        this.filmCategory = filmCategory;
        this.premiereTomorrow = premiereTomorrow;
    }
}
