public class Animal {
    private Boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public static void print(){
        System.out.println("tttttt");
    }

    //Конструктор, принимает все параметры полей
    public Animal(Boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }
    // Контсруктор без параметров
    public Animal() {
    }


    //Геттеры,Сеттеры
    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }


}
