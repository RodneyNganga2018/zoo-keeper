package io.codingdojo.zookeeper;

public class Gorilla extends Mammal {
    public Gorilla() {
        energyLevel = 100;
    }

    public void throwSomething() {
        System.out.println("Woosh!");
        decreaseEnergy(5);
    }

    public void eatBananas() {
        System.out.println("Om nom nom!");
        increaseEnergy(10);
    }

    public void climb() {
        System.out.println("Hyup!");
        decreaseEnergy(10);
    }
}
