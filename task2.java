/*
Задание 2.
Вывести все простые числа от 1 до 1000
*/

public class task2 {
    public static void main(String[] args) {
        int[] new_arr = new int[1000];
        new_arr[0] = 1;
        for (int i = 0; i < new_arr.length; i++) {
            new_arr[i] = i + 1;;
            System.out.print(new_arr[i]);
        }        
    }
}
