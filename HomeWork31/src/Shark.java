public class Shark implements Swimmable, Selectable{
    private int weight;

    public Shark(int weight) {
        this.weight =  weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void swim() {
        System.out.println("i swimm");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getClass() + ": AUE");
    }
    public void eat(){
        System.out.println("Eat something");
    }
    public void hunting(){
        System.out.println("Hunt");
    }
}
