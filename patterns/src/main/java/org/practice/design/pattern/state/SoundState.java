package org.practice.design.pattern.state;

public class SoundState extends RingState {

    @Override
    public void ring() {
        System.out.println("Phone is ringing... ");
    }

    @Override
    public RingState nextStateVolumeUpState() {
        return (this);
    }

    @Override
    public RingState nextStateVolumeDownState() {
        return (new VibratingState());
    }
}

