package org.example;

import org.example.Duck.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        banner();

        List<Duck> ducks = Arrays.asList(
                new MallardDuck(),
                new RubberDuck(),
                new DecoyDuck()
        );

        for (Duck d : ducks) {
            d.display();
            d.performQuack();
            d.perfomFly();
            System.out.println("----------------------------------------");
        }

        System.out.println("We can change behavior on runtime");
        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.perfomFly();
        System.out.println("Changing flying behavior...");
        model.setFlyBehavior(new FlyRocketPowered());
        model.perfomFly();

    }

    private static void banner() {
        System.out.println("#".repeat(40));
        System.out.println("\t\t\uD83E\uDD86 DUCK SIMULATOR \uD83E\uDD86\n");
    }
}
