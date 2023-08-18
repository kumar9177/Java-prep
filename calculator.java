import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("addition" +(a+b));
        System.out.println("multiplication" +(a*b));
        System.out.println("subtraction" +(a-b));
        System.out.println("division" +(a/b));
}
}