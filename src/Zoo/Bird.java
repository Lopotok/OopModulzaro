package Zoo;

public  class Bird extends Animal implements Flyable,NoseAble{

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeASound() {

    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}

