package com.hfad.jungleproblem;

public class Snake extends Animal{
    private static int numSnake;

    public Snake () {
        numSnake ++;
        System.out.println("There are " + String.valueOf(numSnake) + " Snakes");
        healthbar = 50;
    }

    @Override
    public void animalEat() {
        healthbar += eat;
    }

    @Override
    public void animalSound() {
        healthbar -= sounds;
    }

    @Override
    public void animalSleep() {
        healthbar += sleep;
    }

    public void SoundOff(boolean PerformSound){
        System.out.println("Energy: " + String.valueOf(healthbar));
    }

}
