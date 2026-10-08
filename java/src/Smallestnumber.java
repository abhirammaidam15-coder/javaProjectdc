import java.util.Scanner;

public class Smallestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        if (num <= 0) {
            System.out.println("Invalid Input.");
            return;
        }

        int smallest = 9;

        while (num > 0) {
            try {
                int digit = num % 10;

                if (digit < smallest) {
                    smallest = digit;
                }

                num /= 10;
            }catch (Exception e){
                System.out.print("Invalid ");
            }
        }

        System.out.println("Smallest Digit in a Given Number is " + smallest + ".");

        sc.close();
    }
}
