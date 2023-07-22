package Person;

public class Friends {

    private String name;

    private Person person;

    public Friends(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "name='" + name + '\'' +
                ", person=" + person.getName() +
                '}';
    }
}
