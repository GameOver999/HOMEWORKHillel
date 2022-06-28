public class BigDog1 extends Dog1{
    public BigDog1(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woow");
    }

    @Override
    void greets(Dog1 another) {
        System.out.println("WOOOOW");
    }
    void greets (BigDog1 another){
        System.out.println("Wooooooooooow");
    }
}
