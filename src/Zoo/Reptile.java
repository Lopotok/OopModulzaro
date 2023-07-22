package Zoo;

public class Reptile extends Animal implements Oviparou,NoseAble {

    public Reptile(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeASound() {

    }

    @Override
    public String toString() {
        return "Reptile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}






