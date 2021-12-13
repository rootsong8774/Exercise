package problemFunctionalProgramming.q03;


import java.util.function.Supplier;

class Animal {

    public void sound() {
        System.out.println("asdf");
    }

}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Pig extends Animal {

    @Override
    public void sound() {
        System.out.println("꿀꿀");
    }
}

public class animalSoundTest {

    public static void main(String[] args) {
       /* Animal animal = new Animal(); //Make an instance
        Dog dog = new Dog();
        Pig pig = new Pig();
        Supplier<Animal> supplier = () -> animal; //Return the Animal class for using the parameters.
        supplier.get().sound();*/


        /*animalSound(() -> new Animal());
        animalSound(() -> new Dog());
        animalSound(() -> new Pig());*/ //Lambda Expression for the pre-defined method.

        animalSound(Animal::new);
        animalSound(Dog::new);
        animalSound(Pig::new); //Abbreviated version of Lambda Expression for the pre-defined method.
    }

    public static void animalSound(Supplier<Animal> supplier) {
        supplier.get().sound();
    } //Define the method for getting the sound of animal in the argument.

}
