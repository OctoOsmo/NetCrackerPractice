package lesson1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by al on 09.11.2015.
 */
public class Sith extends Sentient implements ForceUser, Villain {

    Random r = new Random();
    ArrayList<String> plans = new ArrayList<>();

    Sith(String name) {
        super(name);
    }

    @Override
    public void feelDisturbanceInForce() {
        System.out.println("I feel disturbance in Force!");
    }

    @Override
    public void moveObject(SomeObject o) {
        o.x = r.nextInt();
        o.y = r.nextInt();
        o.z = r.nextInt();
    }

    @Override
    public void evilLaugh() {
        System.out.println("MU HA HA HA HA HA HA");
    }

    @Override
    public void makeThreat() {
        System.out.println("I will destroy you!");
    }

    @Override
    public void plotEvilPlans() {
        plans.add(String.valueOf((r.nextInt())));
    }

    @Override
    public void introduce() {
        System.out.printf("Kneel before the power of %s!\n", name);
    }
}
