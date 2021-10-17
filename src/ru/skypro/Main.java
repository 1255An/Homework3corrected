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

        int fridayDate = 5;
        while (fridayDate <= 31) {
            System.out.println("Сегодня пятница, " + fridayDate + " число. Необходимо сдать отчет.");
            fridayDate = fridayDate + 7;
        }

        // задача 3
        int currentYear = 2021;
        for (int year = currentYear - 200; year <= currentYear + 100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

        // задача 4
        int a = 1;
        while (a <= 30) {
            System.out.print(a + ": ");
            if (a % 3 == 0) {
                System.out.print("ping" + " ");
            } if (a % 5 == 0) {
                System.out.print("pong");
            }
            a++;
        System.out.println();
            }


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

