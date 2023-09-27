import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args){
        // tasks
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1(){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println(3 <= x && x <= 8);
    }

    public static void task2(){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println(-3 <= x && x <= 5 || 9 <= x && x <= 15);
    }

    public static void task3(){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println(!(-2 <= x && x <= 3 || 6 <= x && x <= 9));
    }

    public static void task4(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(100 <= x && x <= 999 && x % 5 == 0);
    }

    public static void task5(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), sum = 0;
        sum += (a + b == 0 ? 1 : 0);
        sum += (a + c == 0 ? 1 : 0);
        sum += (a + d == 0 ? 1 : 0);
        sum += (b + c == 0 ? 1 : 0);
        sum += (b + d == 0 ? 1 : 0);
        sum += (c + d == 0 ? 1 : 0);
        System.out.println(sum != 0);
    }

    public static void task6(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        System.out.println((abs(a % 2) + abs(b % 2) + abs(c % 2)) <= 1);
    }
}