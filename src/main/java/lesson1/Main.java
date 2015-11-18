package lesson1;

/**
 * Created by al on 09.11.2015.
 */

public class Main {
    public static void main(String[] args) {
        Jedi Qui_Gon_Jinn = new Jedi("Qui-Gon Jinn");
        Sith Dart_Vader = new Sith("Dart Vader");

        Qui_Gon_Jinn.introduce();
        Qui_Gon_Jinn.feelDisturbanceInForce();

        Dart_Vader.introduce();
        Dart_Vader.makeThreat();
        Dart_Vader.evilLaugh();
    }
}
