package home_work_2.utils;

public class SortsUtils {
    /* Метод сортирует массив при помощи алгоритма пузырьковой сортировки
     * @param array
     */
    public static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /* Метод сортирует массив при помощи алгоритма шейкерной сортировки
     * @param array
     */
    public static void shake(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int flag = 1;

        while (left < right && flag==1) {
            flag = 0;
            int temp;
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
            right--;

            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    flag = 1;
                }
            }
            left++;
        }
    }
}
