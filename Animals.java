import java.util.*;
class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, type);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}

class AnimalTest {
    public static void main(String[] himanshu) {
        Animal dog = new Animal("Dog", "Brown", "Pet");
        Animal cat = new Animal("Cat", "White", "Pet");
        Animal lion = new Animal("Lion", "Yellow", "Wild");

        System.out.println("Hash Code for Dog: " + dog.hashCode());
        System.out.println("Hash Code for Cat: " + cat.hashCode());
        System.out.println("Hash Code for Lion: " + lion.hashCode());
    }
}