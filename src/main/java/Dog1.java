public class Dog1 extends Animal1 implements Pet1{
    public Dog1(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println(super.getName()+" Says Woof");

    }
    void greets(Dog1 another){
        System.out.println("Woof ");

    }

    @Override
    public void feed() {
        System.out.println("Feeding Dog "+super.getName());

    }

    @Override
    public void walk() {
        System.out.println("Walking Dog "+super.getName());

    }

    @Override
    public void play() {
        System.out.println("Playing with Dog "+super.getName());

    }
}

