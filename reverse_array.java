public class reverse_array {
    public static void main(String[] args) {
        char a[] = { 'H', 'E', 'L', 'L', 'O'};
        int leftP = 0;
        int rightP = a.length - 1;

        while (leftP < rightP) {
            char temp = a[leftP];
            a[leftP] = a[rightP];
            a[rightP] = temp;
            leftP++;
            rightP--;
        }

        System.out.print("Reversed arrray: ");
        for(int i = 0; i < a.length; i ++){
            System.out.print(a[i]);
            if(i < a.length - 1){
                System.out.print(", ");
            }}
    }
}
