public class Duck implements Swimmable, Selectable {
    private int weight;

    public Duck(int weight) {
        this.weight = weight;
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
        System.out.println(this.getClass() + ": Krya -krya");
    }
}
