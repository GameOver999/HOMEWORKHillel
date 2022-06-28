public abstract class Animal1 {
    private String name;

    public Animal1 (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    abstract void greets ();
}

