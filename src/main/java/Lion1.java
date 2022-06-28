public class Lion1 extends Animal1 implements WildAnimal1{
    public Lion1(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println(super.getName()+" Says Roar");

    }

    @Override
    public void hunting() {
        System.out.println(super.getName()+" goes hunting");

    }
}
