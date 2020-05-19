package sda1.exc11;

public class Cow implements Animal {

    private String sound;

    public Cow () {
        this.sound = "muuu";
    }

    @Override
    public String makeSound() {
        return this.sound;
    }
}
