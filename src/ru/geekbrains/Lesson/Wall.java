package ru.geekbrains.Lesson;

import java.util.Random;

public class Wall implements Competition {
    protected int height;
    Random random = new Random();

    public Wall() {
        this.height = random.nextInt(21);
    }

    @Override
    public void vin(Participants[] arr) {
        System.out.println("Стена высотой: " + this.height + " метров");
        for (int i = 0; i < arr.length; i++){
            int q = arr[i].getJumpHeight();
            if (this.height < q) {
                System.out.println(arr[i].getName() + " успешно перепрыгнул стену высотой "+ this.height + " метров");
            } else {
                System.out.println(arr[i].getName() + " не смог перепрыгнуть стену высотой " + this.height + " метров");
            }
        }
    }
}
