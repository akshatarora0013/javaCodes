package oops.Interfaces;

public class Car implements engine , Mediaplayer{

    @Override
    public void start() {
        System.out.println("Starts");
    }

    @Override
    public void stop() {
        System.out.println("Stops");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate");
    }
}
