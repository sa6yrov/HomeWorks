public class Turtle implements  Swimmable, Selectable{
    private int weight;

    public Turtle(int weight) {
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
        System.out.println("I swim");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getClass() + ": piu - piu");
    }
    public void layEgss(){
        System.out.println("Laying egg");
    }
}
