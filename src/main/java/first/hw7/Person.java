package first.hw7;

import java.util.Objects;

public class Person {

    private String naam;
    private int leeftijd;
    private Gender gender = Gender.UNKNOWN;
    private final static int MAX_LEEFTIJD = 130;

    public static int numberOfPossibleGenders = Gender.values().length;


    public Person (String naam, int leeftijd) {
        this(naam, leeftijd, Gender.UNKNOWN);
        System.gc();
    }

    public Person (String naam, int leeftijd, Gender gender) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.gender = gender;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
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

    public void haveBirthday() {
        if (leeftijd >= MAX_LEEFTIJD) {
            throw new PersonDiedException();
        }
        leeftijd++;
    }

    @Override
    public String toString() {
        return naam + " " + leeftijd + " is " + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return leeftijd == person.leeftijd &&
                Objects.equals(naam, person.naam) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return leeftijd * naam.hashCode() * gender.hashCode();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Ik ben nu opgeruimt.");
        super.finalize();
    }
}
