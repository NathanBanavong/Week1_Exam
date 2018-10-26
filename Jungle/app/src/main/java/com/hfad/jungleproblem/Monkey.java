package com.hfad.jungleproblem;

public class Monkey extends Animal {
    private static int numMonkey;

    //
    private int monkeyEat = 7;
    private int monkeySound = 4;

    public Monkey() {
        numMonkey++;
        healthbar = 50;
        System.out.println("There are " + String.valueOf(numMonkey) + " Monkeys");
    }

    public Monkey(int sounds, int eat, int sleep, String[]food, int healthbar) {
        super(sounds, eat, sleep, food, healthbar);
        this.sounds = monkeySound;    //get -4 for making sound
        this.eat = monkeyEat;       //get 7 (+2) eating
        this.sleep = sleep;    //get 10 (+5) extra for sleep
        this.healthbar = healthbar;
    }

    //food that monkey can eat
    @Override
    public void animalSleep(){
        healthbar += sleep;
    }

    @Override
    public void animalEat() {
        healthbar += monkeyEat;
    }

    @Override
    public void animalSound() {
        healthbar -= monkeySound;
    }

    public void SoundOff(boolean PerformSound){
        healthbar -= monkeySound; //making sound
        System.out.println("Energy: " + String.valueOf(healthbar));
    }

    //only monkey 'play's
    public void playMonkey(boolean play) {
        if (play == true) {
            System.out.println("Oooo Oooo Oooo");
            healthbar -= 8;
        }
        else if(healthbar < 0) {
            System.out.println("Monkey is too tired");
        }
    }
}
