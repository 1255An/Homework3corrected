package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // задача 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }

        System.out.println();

        //задача 2

        int firstFriday = 5;
        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница, " + firstFriday + " число");
            firstFriday = firstFriday + 7;
        }

        // задача 3
        int currentYear = 2021;
        for (int year = currentYear - 200; year <= currentYear + 100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
                continue;
            }
        }

        // задача 4
        int a = 1;
        while (a < 30) {
            if (a % 3 == 0) {
                System.out.println(a + ": ping");
            } else if (a % 5 == 0) {
                System.out.println(a + ": pong");
            } else if (a % 3 == 0) {
                System.out.println(a + ": ping pong");
            } else {
                System.out.println(a + ": ");
            }
            a++;
        }
        System.out.println(a + ": ");

        //задача 5
        int b = 0;
        int c = 1;
        int d;
        System.out.print(b + " " + c + " ");
        for (int e = 3; e <= 10; e++) {
            d = b + c;
            System.out.print(d + " ");
            b = c;
            c = d;;
        };
    }
}

