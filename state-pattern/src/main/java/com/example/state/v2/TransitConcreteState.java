package com.example.state.v2;

public class TransitConcreteState implements TravelModeState {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (Transit)");
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (Transit)");
        return 3;
    }
}