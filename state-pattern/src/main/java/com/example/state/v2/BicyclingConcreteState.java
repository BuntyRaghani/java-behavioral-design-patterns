package com.example.state.v2;

public class BicyclingConcreteState implements TravelModeState {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (Bicycling)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (Bicycling)");
        return 2;
    }
}
