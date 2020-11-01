package ru.geekbrains.Lesson;

import java.util.Random;

public class Robot implements Participants {
    protected String name;
    protected int runDistance;
    protected int jumpHeight;
    protected boolean hasVin;
    Random random = new Random();

    public Robot(String name) {
        this.name = name;
        this.runDistance = random.nextInt(3000);
        this.jumpHeight = random.nextInt(20);
        this.hasVin = false;
    }

    @Override
    public void canJump() {
        System.out.println("Робот " + this.name + " может прыгнуть на высоту до " + this.jumpHeight + " метров");
    }


    @Override
    public void canRun() {
        System.out.println("Робот " + this.name + " может пробежать расстояние до " + this.runDistance + " метров");
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
