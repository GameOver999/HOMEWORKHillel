
public class Cat extends Animal{
    private String color;

    //Setter and Getter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(Boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public Cat(Boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = "White";

    }

    @Override
    public int getNoOfLegs() {
        return super.getNoOfLegs()+10;
    }


}
