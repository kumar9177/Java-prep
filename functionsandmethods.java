// import java.util.Scanner;
// public class functionsandmethods {

//     public static void printmyname(String name){
//    System.out.println(name);
//    return;
//     }
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          String name=sc.next();

//          printmyname(name);//calling the function 
//     }
// }






//--------  add 2 numbers using function--///
 


// import java.util.Scanner;
// public class functionsandmethods {

//     public static int printsum(int a,int b){
//         int sum=a+b;
   
//    return sum;
//     }
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          int a=sc.nextInt();
//          int b=sc.nextInt();

//          int sum=printsum(a,b);
//          System.out.println("sum of two numbers " + sum);
//     }
// }


//--------------------------------- Make a function to multiply 2 numbers and return the product.

// import java.util.Scanner;
// public class functionsandmethods {

//     public static int printmultiply(int a,int b){
//         int sum=a*b;
   
//    return sum;
//     }
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          int a=sc.nextInt();
//          int b=sc.nextInt();

//          int sum=printmultiply(a,b);
//          System.out.println("multiply of two numbers " + sum);
//     }
// }


///------ Find the factorial of a number--//


 
import java.util.Scanner;
public class functionsandmethods {

    public static void factorial(int n){
        //loop
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial =1;
        for(int i=n; i>=1 ;i--) 
        {
            factorial=factorial*i;
        }
   
       System.out.println(factorial);
   return ;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();

         factorial(n);
    }
}
