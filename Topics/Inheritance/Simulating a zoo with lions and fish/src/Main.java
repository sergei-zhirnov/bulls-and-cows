import java.util.*;

public class Main {

    // Base class Animal is declared here
    public abstract class Animal {
        String name;
        int age;

        public Animal(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public String toString() {
            return String.format("name: %s, age: %d", getName(), getAge());
        }
    }

    public class Lion extends Animal {

        public Lion(String name, int age) {
            super(name, age);
        }

        public String roar() {
            return "roar!";
        }
    }

    public class Fish extends Animal {

        public Fish(String name, int age) {
            super(name, age);
        }

        public String swim() {
            return "swim!";
        }
    }

    public String simulateZoo(String animalType, int age) {
        return switch (animalType) {
            case "Lion" -> {
                Lion lion = new Lion("Simba", age);
                yield lion.toString() + ", " + lion.roar();
            }
            case "Fish" -> {
                Fish fish = new Fish("Nemo", age);
                yield fish.toString() + ", " + fish.swim();
            }
            default -> "NaN";
        };
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main zooSimulation = new Main();
        String animalType = scanner.next();
        int age = scanner.nextInt();
        System.out.println(zooSimulation.simulateZoo(animalType, age));
    }
}