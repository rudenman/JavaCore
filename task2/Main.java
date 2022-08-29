package task2;


public class Main {
    public static void main(String[] args) {
        test();
        int array[] = {3, 5, 2, 1, 6, 9, 5, 0, 10, 8};
        qSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void test() {
        int array1[] = {1, 3294, 22, 33, 33, 11, 10, 0};
        qSort(array1, 0, array1.length -1);
        int result1[] = {0, 1, 10, 11, 22, 33, 33, 3294};
        for (int i = 0; i < array1.length; i++) {
            assert(array1[i] == result1[i]);
        }
        System.out.println("The first test was successfully completed!");
        int array2[] = {23, 32, 23, 11, 0, 20, 23};
        qSort(array2, 0, array2.length - 1);
        int result2[] = {0, 11, 20, 23, 23, 23, 32};
        for (int i = 0; i < array2.length; i++) {
            assert(array2[i] == result2[i]);
        }
        System.out.println("The second test was successfully completed!");
    }

    static void qSort(int[] array, int left, int right) {
        if (left >= right) return;
        int pi = partition(array, left, right);
        qSort(array, left, pi - 1);
        qSort(array, pi + 1, right);

    }
    static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int ptr = left - 1;
        for (int i = left; i < right; i++) {
            if (array[i] < pivot) {
                ptr++;
                swap(ptr, i, array);
            }
        }
        swap(ptr + 1, right, array);
        return ptr + 1;
    }
    static void swap(int ptr, int i, int[] array) {
        int temp = array[ptr];
        array[ptr] = array[i];
        array[i] = temp;
    }
}