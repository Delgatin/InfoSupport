package first.hw11;

public abstract class Human {

    protected String name;

    public Human() {

    }

    public Human(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello!";
    }
}
