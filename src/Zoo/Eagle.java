package Zoo;

public class Eagle extends Bird  {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
