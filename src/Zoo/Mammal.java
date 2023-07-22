package Zoo;

import java.util.List;

public class Mammal extends Animal implements Flyable,NoseAble{

    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeASound() {

    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
