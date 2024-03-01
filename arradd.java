import java.util.Scanner;

public class arradd {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int a[] = new int[5];
            int b[] = new int[5];

            System.out.print("Enter array A: ");
            for(int i = 0; i < 5; i++)
                a[i] = scan.nextInt();
            System.out.print("Enter array B: ");
                for(int i = 0; i < 5; i++)
                    b[i] = scan.nextInt();

            int add[] = add(a, b);
            System.out.print("Addition array: ");
            for(int i = 0; i < 5; i++){
                System.out.print(add[i]);
                if(i < 4){
                    System.out.print(", ");
                }
            }
        }
    }

    static int[] add(int a[], int b[]){
        int add[] = new int[5];
        for(int i = 0; i < 5; i++){
            add[i] = a[i] + b[i];
        }

        return add;
    }
}
