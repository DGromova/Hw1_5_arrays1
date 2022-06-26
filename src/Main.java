public class Main {
    public static void main(String[] args) {
        task1_2();
    }
    // Задание 1, 2
    public static void task1_2() {
        // Массив 1
        byte[] arr = new byte[3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[2]);
        System.out.println();
        // Массив 2
        float[] box = {1.57F, 7.654F, 9.986F};
        for (int c = 0; c < box.length-1; c++) {
            System.out.print(box[c] + ", ");
        }
        System.out.print(box[2]);
        System.out.println();
        // Массив 3
        int[] bag = new int[]{5, 6, 33, 7, 6};
        for (int x = 0; x < bag.length-1; x++) {
            System.out.print(bag[x] + ", ");
        }
        System.out.print(bag[4]);
        System.out.println();
        // Задание 3
        // Массив 1
        for (int i = 2; i > 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[0]);
        System.out.println();
        // Массив 2
        for (int c = 2; c > 0; c--) {
            System.out.print(box[c] + ", ");
        }
        System.out.print(box[0]);
        System.out.println();
        // Массив 3
        for (int x = 4; x > 0; x--) {
            System.out.print(bag[x] + ", ");
        }
        System.out.print(bag[0]);
        System.out.println();
        // Задание 4
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                System.out.print(arr[i] + ", ");
            } else if (arr[i] % 2 != 0 && arr[i] != 0) {
                System.out.print(arr[i] + 1 + ", ");
            }
        }
        if (arr[2] % 2 != 0 && arr[2] != 0) {
            System.out.print(arr[2] + 1);
        } else {
            System.out.print(arr[2]);
        }
    }
}