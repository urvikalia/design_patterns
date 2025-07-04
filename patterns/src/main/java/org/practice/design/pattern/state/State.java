package org.practice.design.pattern.state;

public class State {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setRingState(new SoundState());

        phone.ring(); // should be ringing

        phone.volumeUp();
        phone.ring(); // should be ringing

        phone.volumeDown();
        phone.ring(); // vibrating

        phone.volumeDown();
        phone.ring(); // silent

        phone.volumeDown();
        phone.ring(); // silent

        phone.volumeUp();
        phone.volumeUp();
        phone.ring(); // ringing


    }
}
