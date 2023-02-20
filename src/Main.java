import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        MyNumber number=new MyNumber(a);
        boolean check= number.isPrime();
        System.out.println(check);
        System.out.println(number.isSum());

    }
}
