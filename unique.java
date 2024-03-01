public class unique {
    public static void main(String[] args) {
        int[] unique = {2,11,2,4,11};

        uniqueele(unique);
    }
    static void uniqueele(int unique[]){
        int i,j;
        for(i = 0; i < unique.length; i++){
            for(j = 0; j < unique.length; j++){
                if(unique[i] == unique[j] && i != j)
                    break;
            }
            if(j == unique.length){
                System.out.print("unique element is: " + unique[i]+"\n");
            }
        }
    }
}
