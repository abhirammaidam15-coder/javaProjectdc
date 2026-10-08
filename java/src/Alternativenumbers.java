import java.util.*;
public class Alternativenumbers {
    static Scanner sc = new Scanner(System.in);
    public int Alternative(int i){
        if(i%2==0){
           return 10;
        }else{
            return 5;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{

            int a = sc.nextInt();
            if(a<=0){
System.out.print("Invalid input");
return;
            }
            Alternativenumbers s = new Alternativenumbers();
            for(int i =0;i<=a;i++){
                try{

                    System.out.print(s.Alternative(i)+" ");
                }catch (Exception e){
                    System.out.print("Invalid credentials");
                }
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}

class AvgFibbinoci {

    public static double average(int a, int b) {

        int x = 0;
        int y = 1;

        double sum = 0;
        int count = 0;

        while (x <= b) {
try {
    if (x >= a) {
        sum += x;
        count++;
    }

    int c = x + y;
    x = y;
    y = c;

}catch (Exception e){
    System.out.print("Invalid");
}
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter starting number: ");
            int a = sc.nextInt();

            System.out.print("Enter ending number: ");
            int b = sc.nextInt();

            System.out.println("Average = " + average(a, b));
        }catch (Exception e){
            System.out.print("Invalid");
        }
    }
}



class Armstrong {

    public static boolean isArmstrong(int num) {
        int temp = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (temp > 0) {
            try {
                int rem = temp % 10;
                sum += Math.pow(rem, digits);
                temp /= 10;
            }catch (Exception e){
                System.out.print("Inavalid");
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();


            if (n1 == 0 || n2 == 0) {
                System.out.println("Invalid Inputs");
                return;
            }


            n1 = Math.abs(n1);
            n2 = Math.abs(n2);

            int start = Math.min(n1, n2);
            int end = Math.max(n1, n2);

            int count = 0;
            int altCount = 0;
            int sum = 0;

            for (int i = start; i <= end; i++) {
                try {
                    if (isArmstrong(i)) {
                        count++;


                        if (count % 2 != 0) {
                            sum += i;
                            altCount++;
                        }
                    }
                } catch (Exception e) {
                    System.out.print("Error");
                }
            }

            if (count == 0) {
                System.out.println("No Armstrong Numbers in the Given Range");
            } else {
                double average = (double) sum / altCount;
                System.out.printf("%.2f", average);
            }

            sc.close();
        }catch (Exception e){
            System.out.print("Invalid");
        }
    }
}



