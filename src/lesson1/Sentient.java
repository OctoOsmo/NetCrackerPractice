package lesson1;

/**
 * Created by al on 09.11.2015.
 */
public abstract class Sentient {

    String name;

    Sentient(String name){
        this.name = name;
    }

    public abstract void introduce();
}
