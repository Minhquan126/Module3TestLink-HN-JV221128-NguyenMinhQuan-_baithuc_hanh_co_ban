package mangRandom;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
public class ArrayRandom {
    public static void main(String[] args) {
        Random random = new Random();
      int max = 0;
      int min = 0;

        int[] array = new int[50];
        // Nhập các phần tử random cho mảng.
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }
        System.out.println(Arrays.toString(array));
        // Tìm giá trị min, max.
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Gia tri lon nhat " + max);
        System.out.println("Gia tri nho nhat " + min);
        //Sắp xếp lại mảng từ bé đến lớn.

        Arrays.sort(array);
        System.out.println("Mang sau khi sap xep");
        System.out.println(Arrays.toString(array));
       // Đếm số nguyên tố .
        boolean check = false;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < i - 1; j++) {
                if(i % j == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if (check) {
                count++;
            }
        }
        System.out.println("So luong so nguyen to :" + count);
    }
}
