package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Task1(10, 3));
       Task2(-27);
       Task3(38);
       Task4("Bang", 5);
    }

    public static boolean Task1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }
    public static void Task2(int c) {
        if (c >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }
    public static void Task3(int c) {
        if (c >= 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void Task4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
}