public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.5;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.5;
        System.out.println(cat);
        cat = cat + 4.0;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);

    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4.0;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.5;
        System.out.println(cat);
        cat = cat + 4.0;
        System.out.println(cat);
        cat = cat -1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper -7639;
        System.out.println(paper);
    }


    private static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);

    }


    private static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4.0;
        System.out.println(frog);
    }


    private static void task6() {
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var boxersWeight = boxer1Weight + boxer2Weight;
        System.out.println(boxersWeight);
        var boxersDiff = boxer2Weight - boxer1Weight;
        System.out.println(boxersDiff);
    }


    private static void task7() {
        System.out.println("Задача 7");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var boxersDiff = boxer2Weight - boxer1Weight;
        System.out.println(boxersDiff);
        var boxersDiff2 = boxer2Weight % boxer1Weight;
        System.out.println(boxersDiff2);
    }


    private static void task8() {
        System.out.println("Задача 8");
        var workDuration = 640;
        var work1Duration = 8;
        var quantityWorkers = workDuration / work1Duration;
        System.out.println("Всего работников в компании — " + quantityWorkers + " " + " человек");
        quantityWorkers = quantityWorkers + 94;
        workDuration = quantityWorkers * 8;
        System.out.println("Если в компании работает " + quantityWorkers + " человек, то всего " + workDuration + " часов работы может быть поделено между сотрудниками");
    }

}