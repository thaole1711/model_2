package ss7_abstract_interface.thuc_hanh.annimal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "chicken: cluck cluck";
    }

    @Override
    public String howToEat() {
        return "could be tied";
    }
}
