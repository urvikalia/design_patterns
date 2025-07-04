package org.practice.design.pattern.observer;



public interface Channel {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void uploadVideo(String videoTitle);
    void notifySubscribers(String videoTitle);


}
