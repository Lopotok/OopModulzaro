package Zoo;

public class Dog extends Mammal  {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}

