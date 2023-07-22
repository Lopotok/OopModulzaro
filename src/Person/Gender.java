package Person;

public enum Gender {

    MALE("Ferfi","Male"),

    FEMALE("No","Female");

    private String hunName;

    private String englishName;

    Gender(String hunName,String englishName){
        this.hunName= hunName;
        this.englishName=englishName;
    }
    public String getHunName(){
        return hunName;
    }
    public String getEnglishName(){
        return englishName;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "hunName='" + hunName + '\'' +
                ", englishName='" + englishName + '\'' +
                "} " + super.toString();
    }
}
