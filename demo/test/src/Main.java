import java.util.*;
class Main {
    public static void main(String[] argsd) {
        LinkedList<Double> ll = new LinkedList<>();
        int sums =0;
        Double sum = 0.0;
        ll.add(5.2);
        ll.add(2.4);
        ll.add(3.3);
        ll.add(4.4);

        Iterator<Double> i = ll.iterator();
        while (i.hasNext()) {
            sum += i.next();
        }

        System.out.printf("sum : %.2f", sum);


    int arr[] = {1, 2, 4, 5, 6};



   for(int j=0;j<arr.length;j++) {

       int s =arr[j];
       sums+=s;
   }
   System.out.println();
  System.out.print("sum :" + sums);

}
}
