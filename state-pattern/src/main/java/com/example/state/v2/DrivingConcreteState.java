package com.example.state.v2;

public class DrivingConcreteState implements TravelModeState {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (Driving)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (Driving)");
        return 1;
    }
}