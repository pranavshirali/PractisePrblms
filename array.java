import java.util.Scanner;

public class array {
        static int a[] = new int[5];
        static int b[] = new int[5];
        static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        a[0] = 10;
        a[1] = 11;
        a[2] = 12;
        a[3] = 13;
        a[4] = 14;

        System.out.println("Enter elements into b:");
        for (int i = 0; i < 5; i++) {
            b[i] = scan.nextInt();
        }
        System.out.print("The first array elements are: ");
        printelements();
    }

    static void printelements(){
        int i = 0;
        for(i = 0; i < 5; i++){
            System.out.print(a[i]);
            if(i < 4){
                System.out.print(", ");
            }
        }


    }
}
