package Zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {

    private List<Animal> animals ;

    public Zoo() {
        this.animals = new ArrayList<>();

    }


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addAnimals(List<Animal> animals) {
        animals.addAll(animals);

    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }


    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void listOfBirds() {
        for (Animal actual : animals) {
            if (actual instanceof Bird) {
                System.out.println("Madar neve " + actual.getName() + "Madar eletkora" + actual.getAge());
            }
        }
    }

    public void listOfMammals() {
        for (Animal actual : animals) {
            if (actual instanceof Mammal) {
                System.out.println("Emlos neve" + actual.getName() + "Emlos eletkora " + actual.getAge());
            }

        }

    }

    public void listOfReptiles() {
        for (Animal actual : animals) {
            if (actual instanceof Reptile) {
                System.out.println("Ragadozo neve" + actual.getName() + "Ragadozo neve" + actual.getAge());
            }
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }
}




