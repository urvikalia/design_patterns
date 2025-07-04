package org.practice.design.pattern.observer;

public class User implements Subscriber {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update (String videoTitle) {
        System.out.println("User " + name + " updated");
        System.out.println("new video added to the channel: " + videoTitle);
    }
}
