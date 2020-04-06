package first.hw10;

import first.hw7.PersonDiedException;

import java.util.Objects;

public class Person extends Human {

    //private String naam; // TODO BRAM opschonen
    private int leeftijd;
    private Gender gender = Gender.UNKNOWN; // TODO BRAM opschonen.
    private final static int MAX_LEEFTIJD = 130;

    public static int numberOfPossibleGenders = Gender.values().length;

    public Person(String naam, int leeftijd) {
        this(naam, leeftijd, Gender.UNKNOWN);
        System.gc(); // TODO BRAM BAH!
    }

    public Person(String naam, int leeftijd, Gender gender) {
        super(naam);
        //this.naam = naam; // TODO BRAM opschonen
        this.leeftijd = leeftijd;
        this.gender = gender;
    }

    public String greet() {
        return "Hello, my name is " + this.name + ". Nice to meet you!";
    }

    public String getNaam() {
        return this.name;
    }

    // TODO BRAM opschonen ongebruikte getters/setters (maak geen onnodige aan)
    public void setNaam(String naam) {
        this.name = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // TODO BRAM unused? geen test voor?
    public void haveBirthday() {
        if (leeftijd >= MAX_LEEFTIJD) {
            throw new PersonDiedException();
        }
        leeftijd++;
    }

    @Override
    public String toString() {
        return this.name + " " + leeftijd + " is " + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return leeftijd == person.leeftijd &&
                Objects.equals(this.name, person.name) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return leeftijd * this.name.hashCode() * gender.hashCode();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Ik ben nu opgeruimt.");// TODO BRAM opgeruimD
        super.finalize();
    }
}
