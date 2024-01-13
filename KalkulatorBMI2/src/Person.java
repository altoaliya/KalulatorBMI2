public abstract class Person {
    private double weight;
    private double height;

    public Person(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public abstract void displayInfo();
}
