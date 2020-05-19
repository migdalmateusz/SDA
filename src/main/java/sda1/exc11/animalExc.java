package sda1.exc11;

public class animalExc {
    public static void main(String[] args) {
        Cat garifeld = new Cat();
        Dog azor = new Dog();
        Cow elza = new Cow();

        Animal[] animals = {garifeld,azor,elza};

        for (Animal animal : animals ) {
            System.out.println(animal.makeSound());
        }
    }
}
