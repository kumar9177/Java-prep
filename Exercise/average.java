import java.util.Scanner;

public class average {
    public static int findaverage(int a ,int b, int c)
    {
        int avg=(a+b+c)/3;
        return avg;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c=sc.nextInt();
        
        System.out.println(findaverage(a,b,c));
    }
}
