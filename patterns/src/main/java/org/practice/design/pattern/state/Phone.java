package org.practice.design.pattern.state;

public class Phone {
    private RingState ringState;

    public RingState getRingState() {
        return ringState;
    }
    public void setRingState(RingState ringState) {
        this.ringState = ringState;
    }

    public void ring() {
        ringState.ring();
    }

    public void volumeUp()
    {
        ringState = ringState.nextStateVolumeUpState();
    }
    public void volumeDown()
    {
        ringState = ringState.nextStateVolumeDownState();
    }
}
