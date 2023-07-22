package Zoo;

public class Turtle extends Reptile {

    public Turtle(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
