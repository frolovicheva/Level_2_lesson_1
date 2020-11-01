package ru.geekbrains.Lesson;

import java.util.Random;

public class Track implements Competition {
    protected int length;
    Random random = new Random();

    public Track () {
        this.length = random.nextInt(3100);
    }


    @Override
    public void vin(Participants[]arr) {
        System.out.println("Беговая дорожка длинной: " + this.length + " метров");
        for (int i = 0; i < arr.length; i++){
            int q = arr[i].getRunDistance();
            if (this.length < q) {
                System.out.println(arr[i].getName() + " успешно пробежал дистанцию в " + this.length + " метров");
            } else {
                System.out.println(arr[i].getName() + " не смог пробежать дистанцию в " + this.length + " метров");
            }
        }
    }
}
