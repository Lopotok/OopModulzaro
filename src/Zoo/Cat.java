package Zoo;

public class Cat extends Mammal implements NoseAble {

    public Cat(String name, int age) {
        super(name, age);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
