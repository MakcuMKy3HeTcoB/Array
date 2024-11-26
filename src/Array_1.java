import java.util.*;
public class Array_1 {
    /* Дано целое число N (> 0).
    Сформировать и вывести целочисленный массив размера N,
    содержащий N первых положительных нечетных чисел: 1, 3, 5, … */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число равное размеру массива - N (> 0) = ");
        int N = in.nextInt();
        if (N > 0) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = 2 * i + 1;
            System.out.print(arr[i] + " ");
            }
        }else {
            System.out.println("Введено число меньшее или равное нулю.");
        }
    }
}