package org.example.Duck;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I Cannot fly, sorry");
    }
}
