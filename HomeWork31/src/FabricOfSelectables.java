import java.util.Random;

public class FabricOfSelectables {
    public Selectable produce(int n) {
        Random rnd = new Random();
        switch (n) {
            case 0: return new Shark(100 + rnd.nextInt(51));
            case 1: return new Turtle(70 + rnd.nextInt(31));
            case 2: return new Duck(20 + rnd.nextInt(31));
            default: return null;
        }
    }
}
