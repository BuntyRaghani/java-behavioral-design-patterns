package com.example.state.v2;

public class DirectionServiceContext {

    private TravelModeState travelModeState;

    public Object getEta() {
        return travelModeState.getEta();
    }

    public Object getDirection() {
        return travelModeState.getDirection();
    }

    public TravelModeState getTravelModeState() {
        return travelModeState;
    }

    public void setTravelModeState(TravelModeState travelModeState) {
        this.travelModeState = travelModeState;
    }
}
