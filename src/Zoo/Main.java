package Zoo;

public class Main {

    public static void main(String[] args) {


        Zoo zoo = new Zoo();

        Animal kutya = new Dog("Fifi",5);
        Animal kutya2= new Animal("Harap",4);
        Animal Teknos = new Turtle("CSuzsik",4);
        Animal madar = new Snake("Hugo",6);

        zoo.addAnimal(kutya);
        zoo.addAnimal(kutya2);
        zoo.addAnimal(Teknos);
        zoo.addAnimal(madar);
        System.out.println(zoo);




    }

}
