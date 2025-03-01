package OOPS.Interfaces;

public class Car implements Engine,Media,Brake{


    @Override
    public void brake() {
        System.out.println("I brake the car");
    }

    @Override
    public void start() {
        System.out.println("I start engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop the car");
    }

    @Override
    public void accelerate() {
        System.out.println("I move the car");
    }
}
