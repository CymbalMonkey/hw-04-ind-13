public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temp = 6;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        float speed = 60.2f;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 60;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать.");
        }
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        }
        if (age > 24 && age <= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
        if (age > 60) {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть.");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на оттракционе.");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении.");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можноо кататься на аттракционе без сопровождения.");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int totalCapacity = 102;
        int seats = 60;
        int standingSpace = totalCapacity - seats;
        int people = 59;
        if (people >= totalCapacity) {
            System.out.println("Вагон полностью забит.");
        }
        if (people >= seats && people < totalCapacity) {
            System.out.println("В вагоне есть стоячие места.");
        }
        if (people < seats) {
            System.out.println("В вагоне есть сидячие места.");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 5987;
        int two = 4250;
        int three = 3987;
        if (one > two && two > three) {
            System.out.println("БОльшим числом является " + one);
        }
        if (two > one && two > three) {
            System.out.println("БОльшим числом является " + two);
        }
        if (three > one && three > two) {
            System.out.println("БОльшим числом является " + three);
        }

    }
}