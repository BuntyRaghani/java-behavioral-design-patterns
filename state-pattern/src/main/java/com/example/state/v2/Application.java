package com.example.state.v2;

public class Application {

    public static void main(String[] args) {

        DirectionServiceContext directionServiceContext = new DirectionServiceContext();

        // Driving
        System.out.println("-------Driving-------");
        directionServiceContext.setTravelModeState(new DrivingConcreteState());
        System.out.println("Direction: " + directionServiceContext.getDirection());
        System.out.println("ETA: " + directionServiceContext.getEta());

        // Bicycling
        System.out.println("\n-------Bicycling-------");
        directionServiceContext.setTravelModeState(new BicyclingConcreteState());
        System.out.println("Direction: " + directionServiceContext.getDirection());
        System.out.println("ETA: " + directionServiceContext.getEta());

        // Transit
        System.out.println("\n-------Transit-------");
        directionServiceContext.setTravelModeState(new TransitConcreteState());
        System.out.println("Direction: " + directionServiceContext.getDirection());
        System.out.println("ETA: " + directionServiceContext.getEta());

        // Walking
        System.out.println("\n-------Walking-------");
        directionServiceContext.setTravelModeState(new WalkingConcreteState());
        System.out.println("Direction: " + directionServiceContext.getDirection());
        System.out.println("ETA: " + directionServiceContext.getEta());

    }
}
