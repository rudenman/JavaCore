package task1;
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int n = 25;
        int sum = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = rand() % 25;
                sum += array[i][j];
                if (i == 0 && j == 0) {
                    max = array[i][j];
                    min = array[i][j];
                }
                else {
                    if (array[i][j] > max) max = array[i][j];
                    if (array[i][j] < min) min = array[i][j];
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maximalnoe znachenie - " + max);
        System.out.println("Minimalnoe znachenie - " + min);
        System.out.println("Srednee znachenie - " + (double)(sum) / n);

    }
    static int x = 1;
    static int rand() {
        int a = 16807;
        int m = 0x7ffffff;
        x = (a * x) % m;
        return x;
    }
}