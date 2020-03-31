package first.hw11;

import first.hw10.Gender;
import first.hw7.PersonDiedException;

import java.util.ArrayList;
import java.util.Objects;

public class Person extends Human {

    //private String naam;
    private int leeftijd;
    private Gender gender = Gender.UNKNOWN;
    private final static int MAX_LEEFTIJD = 130;

    public static int numberOfPossibleGenders = Gender.values().length;

    public Person() {

    }

    public Person (String naam, int leeftijd) {
        this(naam, leeftijd, Gender.UNKNOWN);
        System.gc();
    }

    public Person (String naam, int leeftijd, Gender gender) {
        super(naam);
        //this.naam = naam;
        this.leeftijd = leeftijd;
        this.gender = gender;
    }

    public String greet() {
        return "Hello, my name is " + this.name + ". Nice to meet you!";
    }

    public String getNaam() {
        return this.name;
    }

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
        System.out.println("Ik ben nu opgeruimt.");
        super.finalize();
    }

    public static void main(String[] args) {
        Person p = new Person();
        HistoryRecord hr1 = p.new HistoryRecord("Nino");
        HistoryRecord hr2 = p.new HistoryRecord("Seizoen");
        hr1.addHisotry("Geboren.");
        hr1.addHisotry("Basisschool.");
        hr1.addHisotry("Middelbareschool.");
        hr1.addHisotry("Hogeschool");
        hr1.printHistory();
        hr2.addHisotry("Lente");
        hr2.addHisotry("Zomer");
        hr2.addHisotry("Herfst");
        hr2.addHisotry("Winter");
        hr2.printHistory();
        Human createSubHuman = hr1.createSubHuman;
        System.out.println(createSubHuman.greet());
    }


    private class HistoryRecord {
        private String description;
        private ArrayList<String> historyList = new ArrayList<>();
        private HistoryRecord(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "History Record: " + description;
        }

        public void addHisotry(String description) {
            historyList.add(description);
        }

        public void printHistory() {
            System.out.println(toString());
            for (String s : historyList) {
                System.out.println(s);
            }
        }

        public Human createSubHuman = new Human() {
            @Override
            public String greet() {
                return "Sub is the best.";
            }
        };
    }
}
