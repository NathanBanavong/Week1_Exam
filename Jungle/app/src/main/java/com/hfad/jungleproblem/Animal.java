package com.hfad.jungleproblem;


abstract class Animal {
    //variables
    public int healthbar = 50;
    public int eat = 5, sounds = 3, sleep = 10;

    public Animal() {
    }

    //animal functions
    public void animalEat() {
        healthbar += eat;
    }

    public void animalSound() {
        healthbar -= sounds;
    }

    public void animalSleep() {
        healthbar += sleep;
    }

    //creation of animal object
    public Animal(int sounds, int eat, int sleep, String[] food, int healthbar) {
        this.sounds = 3;
        this.eat = 5;
        this.sleep = 10;
        this.healthbar = healthbar;
    }
}
