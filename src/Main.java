import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random random=new Random();
        int[]number=new int[50];
        for (int i = 0; i <number.length ; i++) {
            number[i]= random.nextInt(100);
         list.add(number[i]);
        }
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0) {
                even.add(x);
            } else
                odd.add(x);
        }
        System.out.println(even);
        System.out.println(odd);


    }
}
