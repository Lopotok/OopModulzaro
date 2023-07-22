package Person;

public class Main {

    public static void main(String[] args) {

        Friends friends = new Friends("Fulop");
        Friends friends1= new Friends("Eva");

        Person person= new Person("Tibi",18,Gender.FEMALE,"Uszas");

        person.addfriends("Kivi");
        person.addfriends("Tade");

        System.out.println(person);

    }
}
