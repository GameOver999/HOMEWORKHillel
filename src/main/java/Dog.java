public class Dog {

    private String name;
    private int age;
    private int height;
    private String color;


    public Dog() {
        System.out.println("Creating object of the class Dog");
    }

    public Dog(String name, int age, int height, String color) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.color = color;

    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 40;
        this.color = "Black";


    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void print (){
        System.out.println("Name "+this.name);
        System.out.println("Age "+this.age);
        System.out.println("HEIGHT "+this.height);
        System.out.println("Color "+this.color);
    }



}
