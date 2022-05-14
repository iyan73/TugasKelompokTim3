import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        int list[] = {10, 5, 2, 19, 7, 1};

        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i -1; k >= 0 && list[k] > currentElement; k--){
                list[k +1] = list[k];
            }
            list[k +1] = currentElement;
        }

        System.out.println(Arrays.toString(list));
    }
}
