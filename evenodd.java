public class evenodd {
    public static void main(String[] args) {
        int[] shuffle = {2,5,7,9,6};
        int temp[] = new int[shuffle.length];
        int count = 0;
        for(int i = 0; i< shuffle.length; i++){
            if(shuffle[i] % 2 == 0){
                temp[count] = shuffle[i];
                count++;
            }
        }
        for(int i = 0;i < temp.length; i++)
            if(temp[i] != 0)
                System.out.print(temp[i] + ",");
    }
}
