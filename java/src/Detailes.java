import java.util.*;
class Hashmap{
    public static void main(String[]args)throws  Exception{

        try {
            int[] arr = {2, 3, 2, 4, 3, 2,4};

            HashMap<Integer, Integer> map = new HashMap<>();
            int s = arr.length - 1;
            int t = 1;
            while (s >= 0) {

                if (map.containsKey(arr[s])) {
                    map.put(arr[s], map.get(arr[s]) + 1);
                } else {
                    map.put(arr[s], 1);

                }
                s--;

            }

            System.out.println(map);

        }catch (Exception e){
           e.printStackTrace();
        }finally {
            System.out.print("1st probleme");
        }

            }

        }


        class Array{

     public static void main(String[]args){
         try {
             int[] arr = {2, 3, 2, 4, 3, 2, 7};
             int f = arr[0];
             int s = arr[0];
             for (int i = 1; i < arr.length; i++) {
                 if (arr[i] > f) {
                     s = f;
                     f = arr[i];
                 } else if (arr[i] > s && arr[i] != f) {
                     s = arr[i];
                 }

             }

             System.out.print("secound largest element : " + s);
         }catch (ArithmeticException e){
             e.printStackTrace();
         }finally {
             System.out.print("2nd probleme");
         }
     }
        }


class Smallestidentifier {
    public static  void main(String[]args){
   try {
       int arr[] = {2, 5, 10, 50, 30, 20, 40, 60, 90, 1};
       int big = arr[0];
       int temp2 = 0;
       int small = arr[0];
       int temp = 0;
       for (int i = 1; i < arr.length; i++) {
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[i] < arr[j]) {
                   temp = arr[i];
               } else {
                   temp = arr[j];
               }

               if (arr[i] > arr[j]) {
                   temp2 = arr[i];
               } else {
                   temp2 = arr[j];
               }

               if (big < temp2) {
                   big = temp2;
               }

           }
           if (temp < small) {
               small = temp;
           }
       }
       System.out.println("smallest element is : " + small);
       System.out.print("Biggest element is : " + big);
   }catch(ArithmeticException e){
       e.printStackTrace();
   }finally {
       System.out.print("3 rd probleme ");
   }
    }
}

 //4 probleme
class Palindrome{
    public static  void main(String[]args){
        try {


            int a = 111;
            int temp = a;
            int p = 0;

            while (temp != 0) {
                int c = temp % 10;
                p = p * 10 + c;
                temp = temp / 10;
            }
            if (a == p) {
                System.out.print(p + " is an palindrome ");
            } else {
                System.out.print(p + " not an palindrome");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.print("4 th probleme");
        }
    }
        }

        //m1

class Prime{

    public static void main(String[]ards){
        try{
        int r = 7;
        for(int i =1;i<=r;i++){
            int c =0;
            for (int j =1;j<=i;j++){
              try{
                  if(i%j==0){
                      c++;

                  }
            }catch (Exception e){
                  e.printStackTrace();
              }
        }

            if (c <= 2 ){
                System.out.print(i + " ");
            }

            }
        }catch (Exception e){
            System.out.print(e);
        }
    }
}

//mai 2
class Fibbinoci {
    public static String fibbonoci(int fib){
        int x = 0;
        int y = 1;
        int c = 0;
        System.out.print("Fibonoci numbers are :");
        while (fib > 0) {
            try {
                System.out.print(x + " ");
                c = x + y;
                y = x;
                x = c;

                fib--;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "fib";
    }
    public static void main(String[] args) {
        try {
            int fib = 9;
            Fibbinoci.fibbonoci(fib);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



//me3
class Tempory{
    public static void main(String[]args){
        try {
            int[]arr = {10,3,5,7,8,1};
           int temp =arr[5];
           arr[5] = arr[0];
           arr[0] = temp;
           for(int x : arr){
               try {

                   System.out.print(x+" ");
               }catch (IndexOutOfBoundsException e){
                   e.printStackTrace();
               }
           }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
interface i1{
     String check(int s);
}


class EvenODD implements i1 {
    public String check(int s) {
        if (s % 2 == 0) {
            return "even number";
        } else {
            return "odd number";
        }
    }
        public static void main(String[]args){
            try {
                EvenODD i1 = new EvenODD();
                int s = 5;
             System.out.print(i1.check(s));



        }catch(Exception r){
            r.printStackTrace();
        }

    }
}




abstract  class Employee {
    String name;
    int age;
  Employee(String name,int age){
      this.name =name;
      this.age = age;
  }
    void display() {
        System.out.print("name" + name);
        System.out.print("age" + age);

    }

    void company() {
        System.out.print("Asset telematics");
    }

    abstract void work();

    abstract void salary();

}

class Developer extends Employee {


    Developer(Employee e) {
        super(e.name, e.age);
    }

    @Override
    void work() {
        System.out.println("Developer writes Java code.");
    }

    @Override
    void salary() {
        System.out.println("Salary : 60000");
    }

   static class Tester extends Employee {


        Tester(Employee e) {
            super(e.name, e.age);
        }

        @Override
        void work() {
            System.out.println("Tester performs software testing.");
        }

        @Override
        void salary() {
            System.out.println("Salary : 45000");
        }
    }
}
public class Detailes{

    public static void main(String[] args) {
 try {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Name: ");
     String name = sc.nextLine();

     System.out.print("Enter Age: ");
     int age = sc.nextInt();

     Employee emp = new Employee(name, age) {
         @Override
         void work() {

         }

         @Override
         void salary() {

         }
     };

     System.out.println("Choose Employee");
     System.out.println("1. Developer");
     System.out.println("2. Tester");

     int choice = sc.nextInt();

     Employee obj = null;

     if (choice == 1) {
         obj = new Developer(emp);
     } else {
         Developer.Tester obj2 = new Developer.Tester(emp);
     }

     System.out.println("\nEmployee Details");
     assert obj != null;
     obj.display();
     obj.company();
     obj.work();
     obj.salary();

     sc.close();
 }catch (Exception e){
     System.out.print("Some issue please try again");
 }
    }
}



class NumbersIdentifier{
    public String FizzBuzzIdentifier(int a) {

        if (a % 2 == 0 && a % 3 == 0) {

            return String.valueOf(a);
        } else if (a % 2 == 0) {
            return "Fizz";
        } else if (a % 3 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(a);
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try{
              int a = sc.nextInt();
              if(a<=0){
                  System.out.print("Invalid Input");
                  return;
              }
            NumbersIdentifier obj = new NumbersIdentifier();
              for(int i=1;i<=a;i++){
                  try{
                  System.out.println(obj.FizzBuzzIdentifier(i));
                  }catch (Exception e){
                      System.out.print("Error in the Loop");
                  }
              }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


class palindrome {
static int s = 10;
public static void main(String[] args) {

        for (int i = 1; i <= s; i++) {
try{

            if (i == 5) {
                i = Integer.parseInt(null);
            }
            System.out.print(i);

            } catch (Exception e) {
    System.out.print(e);
}
        }
}
}



class Duplicates {
    public int duplicatecount(int arr[]) {
        int count = 0;
        HashSet<Integer> Set = new HashSet<>();
        for (int x : arr) {
            try {


                Set.add(x);
            } catch (Exception e) {
                System.out.print("Error in the Array");
            }
        }
        Iterator<Integer> it = Set.iterator();
        while (it.hasNext()) {
            try {
                System.out.print(it.next() + " ");

                count++;
            } catch (Exception e) {
                System.out.print("Error in the loop");
            } finally {
                System.out.println();


            }
        }
        System.out.print("count   ");
        return count;
    }
    public static void main (String[]args){
            int[] arr = {1, 1, 2, 2, 3, 4, 5, 6, 6};
            Duplicates d = new Duplicates();
            System.out.print(d.duplicatecount(arr));

        }
    }

class Student {

    String name;
    int[] marks = new int[5];
    int total = 0;
    double average;
    int highest;
    int lowest;
    char grade;
    int vowelCount = 0;

    // Read Data
    void readData() {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Student Name: ");
            name = sc.nextLine();

            System.out.println("Enter Marks of 5 Subjects:");

            for (int i = 0; i < marks.length; i++) {

                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();

                if (marks[i] < 0 || marks[i] > 100) {
                    throw new Exception("Marks should be between 0 and 100.");
                }
            }

        } catch (Exception e) {

            System.out.println("Invalid Input : " + e.getMessage());
            System.exit(0);
        }
    }

    // Calculate Result
    void calculateResult() {

        highest = marks[0];
        lowest = marks[0];

        try {

            for (int i = 0; i < marks.length; i++) {

                total += marks[i];

                if (marks[i] > highest)
                    highest = marks[i];

                if (marks[i] < lowest)
                    lowest = marks[i];
            }

            average = total / 5.0;

            // Grade
            if (average >= 90)
                grade = 'A';
            else if (average >= 75)
                grade = 'B';
            else if (average >= 60)
                grade = 'C';
            else if (average >= 40)
                grade = 'D';
            else
                grade = 'F';

            // Count Vowels
            String str = name.toLowerCase();

            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }

        } catch (Exception e) {

            System.out.println("Calculation Error : " + e.getMessage());
        }
    }

    // Display Result
    void displayResult() {

        try {

            System.out.println("\n------ Student Result ------");
            System.out.println("Student Name : " + name);

            System.out.print("Marks        : ");

            for (int mark : marks) {
                System.out.print(mark + " ");
            }

            System.out.println("\nTotal        : " + total);
            System.out.println("Average      : " + average);
            System.out.println("Highest      : " + highest);
            System.out.println("Lowest       : " + lowest);
            System.out.println("Grade        : " + grade);
            System.out.println("Vowel Count  : " + vowelCount);

        } catch (Exception e) {

            System.out.println("Display Error : " + e.getMessage());
        }
    }
}

 class StudentDetails {

    public static void main(String[] args) {

        try {

            Student obj = new Student();

            obj.readData();
            obj.calculateResult();
            obj.displayResult();

        } catch (Exception e) {

            System.out.println("Unexpected Error : " + e.getMessage());
        }
    }
}

class AmstrongNumber {
    public Boolean Identifier(int s){
        int temp =s;
        int d= 0;
        while(temp!=0){
            d++;
            temp=temp/10;
        }
        int sum =0;
        temp = s;
        while(temp!=0){
            int ci = temp%10;
            sum +=Math.pow(ci,d);
            temp=temp/10;
        }

        if(sum == s){
            System.out.println("It is An Palimdrome");
            return true;
        }else{
            System.out.println("not an palindrome");
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        AmstrongNumber amstrongNumber = new AmstrongNumber();
       System.out.print(amstrongNumber.Identifier(s));
    }
}



class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter rows of Matrix 1: ");
            int r1 = sc.nextInt();

            System.out.print("Enter columns of Matrix 1: ");
            int c1 = sc.nextInt();


            System.out.print("Enter rows of Matrix 2: ");
            int r2 = sc.nextInt();

            System.out.print("Enter columns of Matrix 2: ");
            int c2 = sc.nextInt();


            if (r1 <= 0 || c1 <= 0 || r2 <= 0 || c2 <= 0) {
                throw new IllegalArgumentException("Matrix dimensions must be greater than zero.");
            }


            if (c1 != r2) {
                throw new ArithmeticException("Matrix multiplication is not possible. Columns of Matrix 1 must equal Rows of Matrix 2.");
            }

            int[][] matrix1 = new int[r1][c1];
            int[][] matrix2 = new int[r2][c2];
            int[][] result = new int[r1][c2];


            System.out.println("Enter elements of Matrix 1:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }


            System.out.println("Enter elements of Matrix 2:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }


            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            // Display Result
            System.out.println("Resultant Matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(result[i][j] + "\t");
                }
                System.out.println();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Matrix Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input! Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}




class MatrixTranspose {

    public static void displayMatrix(int[][] matrix, int rows, int cols) {
        try {
            for (int i = 0; i < rows; i++) {
                try {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                } catch (Exception e) {
                    System.out.println("Error displaying row.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error displaying matrix.");
        }
    }

    public static int[][] transposeMatrix(int[][] matrix, int rows, int cols) {
        int[][] transpose = new int[cols][rows];

        try {
            for (int i = 0; i < rows; i++) {
                try {
                    for (int j = 0; j < cols; j++) {
                        transpose[j][i] = matrix[i][j];
                    }
                } catch (Exception e) {
                    System.out.println("Error transposing row.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error while transposing matrix.");
        }

        return transpose;
    }

    public static boolean isSymmetric(int[][] matrix, int[][] transpose, int size) {

        try {
            for (int i = 0; i < size; i++) {
                try {
                    for (int j = 0; j < size; j++) {
                        if (matrix[i][j] != transpose[i][j]) {
                            return false;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error checking row.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error checking symmetry.");
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();

            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            if (rows <= 0 || cols <= 0) {
                System.out.println("Invalid Input");
                return;
            }

            int[][] matrix = new int[rows][cols];

            System.out.println("Enter Matrix Elements:");

            try {
                for (int i = 0; i < rows; i++) {
                    try {
                        for (int j = 0; j < cols; j++) {
                            matrix[i][j] = sc.nextInt();
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid Input");
                        return;
                    } catch (Exception e) {
                        System.out.println("Error reading row.");
                        return;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error reading matrix.");
                return;
            }

            System.out.println("\nOriginal Matrix:");
            displayMatrix(matrix, rows, cols);

            int[][] transpose = transposeMatrix(matrix, rows, cols);

            System.out.println("\nTranspose Matrix:");
            displayMatrix(transpose, cols, rows);

            if (rows == cols) {
                if (isSymmetric(matrix, transpose, rows)) {
                    System.out.println("\nSymmetric Matrix");
                } else {
                    System.out.println("\nNot Symmetric Matrix");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

