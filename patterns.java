// public class patterns {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++) {
//              for(int j=1;j<=4;j++){
//             System.out.print("*");
//              }
//               System.out.println("*");
//     }
// }
// }
//----------------------------------------------------------------Solid Rectangle------------------------//



//----------------------------------------------------------------HOLLOW rECTANGLE------------------------//

// public class patterns {
//     public static void main(String[] args) {

//         int n=4;
//         int m=5;

//         for(int i=1;i<=n;i++) {
//             //inner loop
//              for(int j=1;j<=m;j++){

//                 if(i==1 || j==1 || i==n || j==m){
//             System.out.print("*");
//              }
//              else{
//                 System.out.print(" ");
//              }
//              }
//               System.out.println();
//     }

//        }
//}

// // ----------------------------------------------------------------Half pyramid--------------------------------//


// public class patterns {
//     public static void main(String[] args) {

//         int n=4;
       

//         for(int i=1;i<=n;i++) {
//             //inner loop
//              for(int j=1;j<=i;j++){

         
//             System.out.print("*");
//              }
           
//               System.out.println();
//     }

// }
// }



// ----------------------------------------------------------------INVERTED Half pyramid--------------------------------//


// public class patterns {
//     public static void main(String[] args) {

//         int n=4;
       

//         for(int i=n;i>=1;i--) {
//             //inner loop
//              for(int j=1;j<=i;j++){

         
//             System.out.print("*");
//              }
           
//               System.out.println();
//     }

// }
// }



// ----------------------------------------------------------------INVERTED Half pyramid  (rotated by 180deg)--------------------------------//



// public class patterns {
//     public static void main(String[] args) {

//         int n=4;
       

//        for (int i=0; i<=n; i++){
//         for (int j=0; j<=n-i; j++){
//             System.out.print(" ");

//        }
//        for(int j=1;j<=i; j++){
//         System.out.print("*");
//        }
//        System.out.println( );
//     }

// }
// }


// //----------------------------------------------------------------half pyramid with numbers--------------------------------//


// public class patterns {
//     public static void main(String[] args) {

//         int n=8;
//         for(int i=1;i<=n;i++) {
//             for(int j=1;j<=i;j++) {
//                 System.out.print(j+"");
//             }
//             System.out.println( );
//         }
// }
// }




//---------------------------------------------------------------- inverted half pyramid with numbers--------------------------------//


// public class patterns {
//     public static void main(String[] args) {

//         int n=5;
//         for(int i=1;i<=n;i++) {
//             for(int j=1;j<=n-i+1;j++) {
//                 System.out.print(j);
//             }
//             System.out.println( );
//         }
// }
// }

//---------------------------------------------------------------- Floyds triangle------------------------//



// public class patterns {
//     public static void main(String[] args) {

//         int n=5;
//         int number=1;
//         for(int i=1;i<=n;i++) {
//             for(int j=1;j<=i;j++) {
//                 System.out.print(number+" ");
//             number++;
//             }
//             System.out.println();
//         }



//         }
//     }

    //----------------------------------------------------------------0-1 Triangle PATTERN  --------------------------------//




public class patterns {
    public static void main(String[] args) {

        int n=5;
        
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {

                int sum=i+j;
                if(sum%2==0){
                System.out.print("1  ");
            }
                else{
                    System.out.print("0  ");
                }
            }
                System.out.println( );
            }  
        
    }
}