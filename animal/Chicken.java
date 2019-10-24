package animal;


import edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "animal.Chicken : winner winer animal.Chicken Dinner!";
    }

    @Override
    public String howToEat() {
        return "Fried Chicken";
    }
}
