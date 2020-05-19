package sda1.exc11;

public class Dog implements Animal {

    private String sound;

    public Dog () {
        this.sound = "hau";
    }

    @Override
    public String makeSound() {
        return this.sound;
    }
}
