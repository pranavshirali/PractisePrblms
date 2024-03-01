import java.util.Scanner;

public class lowercnt {
    public static void main(String[] args) {
        int lower = 0;
        int special = 0;
        String s = "MITE@1235";
        for(int i=0;i<s.length();i++)
            if(Character.isLowerCase(s.charAt(i))){
                lower++;
            }
        System.out.println("lower case:" + lower);

        for(int i=0;i<s.length();i++)
            if(!Character.isLowerCase(s.charAt(i))
            && !Character.isWhitespace(s.charAt(i))
            && !Character.isDigit(s.charAt(i))
            && !Character.isUpperCase(s.charAt(i))){
                special++;
            }
        System.out.println("special char:" + special);
        
        int sum = 0;
        int a = 0;
        for(int i=0; i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                a = Character.getNumericValue(s.charAt(i));
                sum+=a;}}
                boolean val = isPrime(sum);
        System.out.println("No. is prime: "+val);
        userid();
        password();

    }
    static boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 

        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 


    //Answer No.2
    public static void userid() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the string");
        String id = scan.nextLine();
        int cnt = 0;

        if (id.length() >= 5 && !Character.isDigit(id.charAt(0)) && !Character.isWhitespace(id.charAt(0))) {
            for (int i = 0; i < id.length(); i++) {
                if (!(Character.isLetterOrDigit(id.charAt(i)) || id.charAt(i) == '_')) {
                    cnt++;
                }
            }
            if (cnt > 0) {
                System.out.println("Invalid id.");
            } else {
                System.out.println("Valid id.");
            }
        } else {
            System.out.println("Invalid id.");
        }
    }



    public static void password() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the password");
        String id = scan.nextLine();
        int lwr = 0;
        int upr = 0;
        int dig = 0;

        if (id.length() >= 8) {
            for (int i = 0; i < id.length(); i++) {
                if (!Character.isWhitespace(id.charAt(i))){
                    if(Character.isUpperCase(id.charAt(i)))
                        upr++;
                    if(Character.isLowerCase(id.charAt(i)))
                        lwr++;
                    if(Character.isDigit(id.charAt(i)))
                        dig++;
                }


            }

            if (dig > 0 || lwr > 0|| upr > 0) {
                System.out.println("Valid id.");
            } else {
                System.out.println("invalid id.");
            }
        } else {
            System.out.println("Invalid id.");
        }
    }
}
