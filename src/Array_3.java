import java.util.*;
public class Array_3 {
    /*Дано целое число N (> 1),
    а также первый член A и разность D арифметической прогрессии.
    Сформировать и вывести массив размера N,
    содержащий N первых членов данной прогрессии:
    A,    A + D,    A + 2·D,    A + 3·D,    … */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива и количество первых членов прогрессии N (> 1),первый член A и разность D арифметической прогрессии");
        int N = sc.nextInt();
        int A = sc.nextInt();
        int D = sc.nextInt();
        if (N > 1) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = A + D * i;
            System.out.print(arr[i] + " ");
        }
        }else {
            System.out.println("Введено число меньшее или равное 1");
        }
    }
}
