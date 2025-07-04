package org.practice.design.pattern.state;

public class VibratingState extends RingState {

    @Override
    public void ring() {
        System.out.println("Phone is Vibrating... ");
    }

    @Override
    public RingState nextStateVolumeDownState() {
        return (new SilentState());
    }

    @Override
    public RingState nextStateVolumeUpState() {
        return (new SoundState());
    }
}
