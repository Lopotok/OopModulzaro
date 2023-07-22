package Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person {

    private String name;

    private int age;

    private final Gender gender;

    private String hobby;

    private List<Friends> friends = new ArrayList<>();

    public static int population;

    public Person(String name, int age, Gender gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
        population++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    public List<Friends> getFriends() {
        return friends;
    }

    public void listofFriends() {
        for (Friends friend : friends) {
            System.out.println(friend.getName());
        }

    }
    public List<Friends> addfriends ( String friendsname){
        List<Friends> friendsList = new ArrayList<>();
        for (Friends friend : friends) {
            if(friend.getName().equals(friendsname)){
                System.out.println("Mar van ilyen barátod");
            }else {
                friends.add(friend);
            }

        } return friendsList;

    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobby='" + hobby + '\'' +
                ", friends=" + friends +
                '}';
    }

}

