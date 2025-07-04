package org.practice.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class YouTubeChannel implements Channel {

    private List<Subscriber> subscribers =new ArrayList<Subscriber>();

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);

    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void uploadVideo(String videoTitle) {
        //normally there would be some more actions to be done when video is uploaded
        // for the given example ... lets consider its done
        // so next thing we have to do is notify the subscriber.
        notifySubscribers(videoTitle);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        subscribers.forEach(subscriber -> subscriber.update(videoTitle));

    }
}
