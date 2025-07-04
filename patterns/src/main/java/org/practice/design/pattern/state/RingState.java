package org.practice.design.pattern.state;

public abstract class RingState {

    public abstract void ring();
    public abstract RingState nextStateVolumeUpState();
    public abstract RingState nextStateVolumeDownState();

}
