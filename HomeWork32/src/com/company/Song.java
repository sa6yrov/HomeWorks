package com.company;

public class Song {
    String title;
    String genre;
    String executor;
    String lyrics;

    public Song(String title, String genre, String executor, String lyrics) {
        this.title = title;
        this.genre = genre;
        this.executor = executor;
        this.lyrics = lyrics;
    }
    public Song(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
