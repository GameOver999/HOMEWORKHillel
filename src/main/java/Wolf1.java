public class Wolf1 extends Animal1 implements WildAnimal1{
    public Wolf1(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println(super.getName()+" Hawoo");

    }

    @Override
    public void hunting() {
        System.out.println(super.getName()+" goes hunting");

    }
}
