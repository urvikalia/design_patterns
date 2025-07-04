package org.practice.design.pattern.observer;

public class Observer {

    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannel();
        youTubeChannel.subscribe(new User("Urvi"));
        youTubeChannel.subscribe(new User("Vipul"));
        youTubeChannel.subscribe(new User("Anshul"));
        youTubeChannel.uploadVideo("movie Flow");
        youTubeChannel.uploadVideo("Anna Karenina");

    }
}
