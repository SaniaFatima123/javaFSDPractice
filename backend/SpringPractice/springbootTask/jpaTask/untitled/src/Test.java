import java.util.ArrayList;
import java.util.Comparator;

public class Test{
    public static void main(String[] args) {
       ArrayList<Integer> numList = new ArrayList<>();
       numList.sort(new Comparator<Integer>() {
           @Override
           public int compare(Integer num1, Integer num2) {
               return -num2 +num1;
           }
       });

    }

}
