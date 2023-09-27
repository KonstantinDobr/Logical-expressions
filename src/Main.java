import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // tasks
        task1();
        task2();
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
}