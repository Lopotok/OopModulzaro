package Zoo;

public class Penguin extends Bird  {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
