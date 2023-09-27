import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // tasks
        task1();
    }
    public static void task1(){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println(3 <= x && x <= 8);
    }
}