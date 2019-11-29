import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        FabricOfSelectables fabricOfSelectables = new FabricOfSelectables();
        Selectable [] selectables = new Selectable[15];
        for (int i = 0; i < selectables.length; i++) {
            selectables[i] = fabricOfSelectables.produce(rnd.nextInt(3));
        }
        sortByWeight(selectables);
    }
    static void sortByWeight(Selectable[] selectables){
        for(Selectable s : selectables){
            if(s instanceof Shark && ((Shark)s).getWeight() > 120) ((Shark)s).makeSound();
            if(s instanceof Duck && ((Duck) s).getWeight() > 25) ((Duck)s).makeSound();
            if(s instanceof Turtle && ((Turtle)s).getWeight() > 85)((Turtle)s).makeSound();
        }
    }
}
