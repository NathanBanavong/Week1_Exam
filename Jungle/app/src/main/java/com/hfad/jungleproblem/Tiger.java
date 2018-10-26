package com.hfad.jungleproblem;

public class Tiger extends Animal {

    private static int numTiger;   //count number of tigers
    private int tigerSleep = 15;

    public Tiger() {
        numTiger++;
        healthbar= 50;
        System.out.println("There are " + String.valueOf(numTiger) + " Tigers");
    }

    public Tiger(int sounds, int eat, int sleep, String [] food, int healthbar) {
        super(sounds, eat, sleep, food, healthbar);
        numTiger++;
        this.sounds = sounds;
        this.eat = eat;
        this.sleep = eat;    //get 10 (+5) extra for sleep
        this.healthbar = healthbar;

    }

    //animal functions
    public void animalEat() {
        healthbar += eat;
    }

    public void animalSound() {
        healthbar -= sounds;
    }

    public void animalSleep() {
        healthbar += tigerSleep;
    }

    public void SoundOff(boolean PerformSound){
        System.out.println("Energy: " + String.valueOf(healthbar));
    }

}
