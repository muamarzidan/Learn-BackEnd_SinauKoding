public class Task2 {
    public static void main(String args[]){

        for (int n = 0; n<=20; n++) {
            int  o = 0;
            for (int p = 1; p<=20; p++) {
                if (n%p==0) {
                    o++;
                }
            }
            if((o==2)&&(n!=1)){
                System.out.println(n+ " adalah bilangan prima");
            } else {
                System.out.println(n+ " adalah bukan bilangan prima");
            }
        }
    }
}

// CARA SAVAGE
// public class Task2 {
//     public static void main(String args[]){

//         for (int n = 0; n<=20; n++) {
//             // System.out.println(n);
//             if (n == 2 || n == 3 || n == 5 || n == 7 || n == 11 || n == 13 || n == 17 || n == 19) {
//                 System.out.println(n + " Bilangan prima");
//             } else {
//                 System.out.println(n + " Bukan Bilangan Prima");
//             }
//         }
//     }
// }