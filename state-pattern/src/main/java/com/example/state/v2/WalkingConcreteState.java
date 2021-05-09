package com.example.state.v2;

public class WalkingConcreteState implements TravelModeState {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (Walking)");
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (Walking)");
        return 4;
    }
}
