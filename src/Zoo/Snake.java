package Zoo;

public class Snake extends Reptile {

    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Snake{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
