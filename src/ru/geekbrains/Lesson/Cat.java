package ru.geekbrains.Lesson;

import java.util.Random;

public class Cat implements Participants {
    protected String name;
    protected int runDistance;
    protected int jumpHeight;
    protected boolean hasVin;
    Random random = new Random();

    public Cat(String name) {
        this.name = name;
        this.runDistance = random.nextInt(500);
        this.jumpHeight = random.nextInt(3);
        this.hasVin = false;
    }

    @Override
    public void canJump() {
        System.out.println("Кот " + this.name + " может прыгнуть на высоту до " + this.jumpHeight + " метров");
    }

    @Override
    public void canRun() {
        System.out.println("Кот " + this.name + " может пробежать расстояние до " + this.runDistance + " метров");
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
