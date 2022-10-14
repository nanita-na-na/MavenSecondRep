package org.example;

import org.example.animalsImpl.Dog;
import org.example.animalsImpl.Fox;
import org.example.animalsImpl.Horse;
import org.example.animalsImpl.Tiger;

public class ZooDay {
    Dog dog = new Dog();
    Tiger tiger = new Tiger();
    Horse horse = new Horse();
    Fox fox = new Fox();

    public void animalsVoice() {
        dog.voice();
        tiger.voice();
        horse.voice();
        fox.voice();
    }

    public void animalsEating() {
        dog.eat();
        tiger.eat();
        horse.eat();
        fox.eat();
    }

    public void animalsWalking() {
        dog.walk();
        tiger.walk();
        horse.walk();
        fox.walk();
    }

    public void animalsSleeping() {
        dog.sleep();
        tiger.sleep();
        horse.sleep();
        fox.sleep();
    }

    public void zooDay() {
        animalsVoice();
        animalsEating();
        animalsWalking();
        animalsEating();
        animalsSleeping();
    }
}
