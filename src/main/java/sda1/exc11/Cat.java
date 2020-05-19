package sda1.exc11;

public class Cat implements Animal {

    private String sound;

    public Cat () {
        this.sound = "miau";
    }

    @Override
    public String makeSound() {
        return this.sound;
    }
}
