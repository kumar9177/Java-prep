


// public class arrays {

// public static void main(String args[]) {
// //int[] marks = new int [3];
// int [] marks={98,99,82};
// // marks [0] = 97; // phy
// // marks [1] = 98; // chem
// // marks [2] = 95; //eng

// // System.out.println(marks [0]);
// // System.out.println(marks [1]);
// // System.out.println(marks [2] );
// for(int i=0; i<3; i++) 
// {
// System.out.println (marks [i]);
// }
// }
// }




import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int numbers []=new int[size];
for(int i=0;i<size;i++) {
    numbers[i] = sc.nextInt();
}

int x=sc.nextInt();

     for (int i = 0; i <numbers.length; i++) {
        if(numbers[i]==x){
            System.out.println("x is found :"+i);
        }
       
    }
    
    }
}
