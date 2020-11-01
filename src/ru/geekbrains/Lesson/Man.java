package ru.geekbrains.Lesson;

import java.util.Random;

public class Man implements Participants {
    protected String name;
    protected int runDistance;
    protected int jumpHeight;
    protected boolean hasVin;
    Random random = new Random();

    public Man(String name) {
        this.name = name;
        this.runDistance = random.nextInt(2000);
        this.jumpHeight = random.nextInt(5);
        this.hasVin = false;
    }

    @Override
    public void canJump() {
        System.out.println("Человек " + this.name + " может прыгнуть на высоту до " + this.jumpHeight + " метров");
    }


    @Override
    public void canRun() {
        System.out.println("Человек " + this.name + " может пробежать расстояние до " + this.runDistance + " метров");
    }

    @Override
    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public String getName() {
        return name;
    }
}
