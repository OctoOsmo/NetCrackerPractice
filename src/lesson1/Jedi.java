package lesson1;

/**
 * Created by al on 09.11.2015.
 */
public class Jedi extends Sentient implements ForceUser{

    Jedi(String name) {
        super(name);
    }

    @Override
    public void feelDisturbanceInForce() {
        System.out.println("I feel disturbance in Force!");
    }

    @Override
    public void moveObject(SomeObject o) {
        o.x += 2;
        o.y += 2;
        o.z += 1;
    }


    @Override
    public void introduce() {
        System.out.printf("Hello, ny name is %s\n", name);
    }

//    public bo
}
