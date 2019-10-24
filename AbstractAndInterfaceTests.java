import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }

        Fruit[] f = new Fruit[2];
        f[0] = new Orange();
        f[1] = new Apple();
        for(Fruit F : f){
            System.out.println(F.howToEat());
        }
    }
}