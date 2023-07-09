public class new1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Output: Woof!

        Cat cat = new Cat();
        cat.makeSound();  // Output: Meow!

        Cow cow = new Cow();
        cow.makeSound();  // Output: Moo!
    }
}
class Animal {
    public void makeSound() {
        // Placeholder method, to be overridden by subclasses
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}



