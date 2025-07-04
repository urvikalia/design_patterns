package org.practice.design.pattern.state;

public class SilentState extends RingState{

    @Override
    public void ring() {
        System.out.println("Phone is Silent... ");
    }

    @Override
    public RingState nextStateVolumeUpState() {
        return(new VibratingState());
    }

    @Override
    public RingState nextStateVolumeDownState() {
        return(this);
    }
}
