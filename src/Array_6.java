import java.util.*;
class Array_6 {
    /*Даны целые числа N (> 2), A и B.
     Сформировать и вывести целочисленный массив размера N,
     первый элемент которого равен A, второй равен B,
     а каждый последующий элемент равен сумме всех предыдущих.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива N(>2), первый эллемент A и второй равный B:");
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int[] arr = new int[n];
        arr[0] = a;
        arr[1] = b;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.print(arr[i] + " ");
        }
    }
}
