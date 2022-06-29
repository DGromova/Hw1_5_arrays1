import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1, 2
        // Массив 1
        byte[] arr = new byte[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        // Массив 2
        float[] box = {1.57F, 7.654F, 9.986F};
        for (int i = 0; i < box.length - 1; i++) {
            System.out.print(box[i] + ", ");
        }
        for (int i = 0; i < box.length; i++) {
            if (i == box.length - 1) {
                System.out.print(box[i]);
            }
        }
        System.out.println();
        // Массив 3
        int[] bag = new int[]{5, 6, 33, 7, 6};
        for (int i = 0; i < bag.length - 1; i++) {
            System.out.print(bag[i] + ", ");
        }
        for (int i = 0; i < bag.length; i++) {
            if (i == bag.length - 1) {
                System.out.print(bag[i]);
            }
        }
        System.out.println();
        // Задание 3
        // Массив 1
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < arr.length; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        // Массив 2
        for (int i = box.length - 1; i > 0; i--) {
            System.out.print(box[i] + ", ");
        }
        for (int i = 0; i < box.length; i--) {
            if (i == 0) {
                System.out.print(box[i]);
            }
        }
        System.out.println();
        // Массив 3
        for (int i = bag.length - 1; i > 0; i--) {
            System.out.print(bag[i] + ", ");
        }
        for (int i = 0; i < bag.length; i--) {
            if (i == 0) {
                System.out.print(bag[i]);
            }
        }
        System.out.println();
        // Задание 4. Способ 1
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length && arr[i] % 2 != 0) {
                arr[i]++;
            }
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        // Задание 4. Способ 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}