public class Task1 {

    public static void main(String args[]){
        System.out.println("MENEMUKAN BILANGAN YANG HABIS DIBAGI 3 DAN 5 ");

        for(int n = 1; n <= 50; n++) {
            System.out.println(n);
            if(n % 3 == 0) {
                System.out.println(n + " Habis dibagi 3");
            } else if (n % 5 == 0) {
                System.out.println(n + " Habis dibagi 5");
            }
        }
    }
}

