package Exercise;

import java.util.Scanner;

public class greatest {
    public static int twogreatest(int a,int b){
        if(a>b){
             return a;
            }

        else{
             return b;
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println(twogreatest(a,b));

    }
}

