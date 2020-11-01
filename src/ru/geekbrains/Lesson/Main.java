package ru.geekbrains.Lesson;

public class Main {

    public static void main(String[] args) {
    	/*1. Создайте три класса Человек, Кот, Робот,
		которые не наследуются от одного класса.
		Эти классы должны уметь бегать и прыгать
		(методы просто выводят информацию о действии в консоль).*/
	Cat cat1 = new Cat("Барсик");
	Man man1 = new Man("Виктор");
	Robot robot1 = new Robot("Super-3000");
	Participants[] participants = {cat1, man1, robot1};
	System.out.println("Участники:");
	for (int i = 0; i < participants.length; i++) {
		participants[i].canRun();
		participants[i].canJump();
    }
	System.out.println();

	/*2. Создайте два класса: беговая дорожка и стена,
	при прохождении через которые,
	участники должны выполнять соответствующие действия (бежать или прыгать),
	результат выполнения печатаем в консоль
	(успешно пробежал, не смог пробежать и т.д.).
	У препятствий есть длина (для дорожки) или высота (для стены),
	а участников ограничения на бег и прыжки.*/
	Track trackTest = new Track();
	Wall wallTest = new Wall();
	System.out.println("Тестовый забег:");
	trackTest.vin(participants);
	wallTest.vin(participants);
	System.out.println();

	/*3. Создайте два массива: с участниками и препятствиями,
	и заставьте всех участников пройти этот набор препятствий. */
	Track track1 = new Track();
	Wall wall1 = new Wall();
	Track track2 = new Track();
	Wall wall2 = new Wall();
	Competition[] competition = {track1, wall1, track2, wall2};
	System.out.println("Соревнование:");
	for (int j = 0; j < competition.length; j++) {
            competition[j].vin(participants);
            System.out.println();
        }
    }
    /*Если участник не смог пройти одно из препятствий,
	то дальше по списку он препятствий не идет.*/

	//Не получилось пока.

}
